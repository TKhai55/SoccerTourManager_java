/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementModel;

import SoccerManagementDTO.StartingItem;
import java.awt.Image;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Operation {
    public static void listTournamentsinStartingPage(JList list, JFrame frame,String user){
        DefaultListModel listModel=new DefaultListModel();
        listModel.clear();
        
        try{
            Connection conn = new ConnectDB().createConn();
            String sql= "SELECT * FROM TOURNAMENT where username=?";
            PreparedStatement preparedStatement =conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            preparedStatement.setString(1, user);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            while (rs.next()){
                String itemImage = rs.getString("LOGO");
                listModel.addElement(new StartingItem(rs.getString("TNMNAME"),new ImageIcon(new ImageIcon(itemImage).getImage()
                .getScaledInstance(128, 128, Image.SCALE_SMOOTH)),rs.getString("idtnm")));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Loanding error"+ e.getMessage());
        }
        list.setCellRenderer(new CustomRenderer());
        list.setModel(listModel);
    }
    public ArrayList<Integer> getTourid(String user){
        ArrayList<Integer> dsID= new ArrayList<>();
        try{
            Connection conn = new ConnectDB().createConn();
            
            PreparedStatement preparedStatement =conn.prepareStatement("SELECT * FROM TOURNAMENT where username=?");
            preparedStatement.setString(1, user);
            ResultSet rs=preparedStatement.executeQuery();
            
            while (rs.next()){
                int id= rs.getInt("idtnm");
                dsID.add(id);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Lỗi lấy list id");
        };
        return dsID;
    }
   
    
}
