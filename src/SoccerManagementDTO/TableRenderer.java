/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Administrator
 */
public class TableRenderer extends DefaultTableCellRenderer{

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
         String LogoName= value.toString();
         ImageIcon image;
         if(LogoName.equals("imagestore\\score.png")||
                 LogoName.equals("imagestore\\yellow-card.png")||LogoName.equals("imagestore\\red.png")){
             image= new ImageIcon(new ImageIcon(LogoName).getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
         }
         else{
            image= new ImageIcon(new ImageIcon(LogoName).getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
         }

           return new JLabel(image);
    }
    
    
}
