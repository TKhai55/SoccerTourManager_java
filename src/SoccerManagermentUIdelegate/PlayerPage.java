/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SoccerManagermentUIdelegate;
import java.sql.*;
import SoccerManagementDTO.*;
import SoccerManagementModel.*;
import static SoccerManagermentUIdelegate.HomePage.idtour;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Administrator
 */
public class PlayerPage extends javax.swing.JFrame {

    /**
     * Creates new form PlayerPage
     */
    public static int idCLB;
    ListPlayer listPL= new ListPlayer();
    public PlayerPage(int clbid) {
        idCLB=clbid;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LoadPlayer(clbid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlayer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInsertImage = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        DateBorn = new com.toedter.calendar.JDateChooser();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlayerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlayer);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Full Name");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Number");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Date Born");

        btnInsertImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/icon_open.png"))); // NOI18N
        btnInsertImage.setText("Insert Image");
        btnInsertImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertImageActionPerformed(evt);
            }
        });

        btnCreate.setText("Create new player");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(167, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage)
                    .addComponent(btnInsertImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnInsertImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateBorn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDelete)
                                .addComponent(btnEdit)
                                .addComponent(btnClear)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String path ="imagestore/player.png";
    private void btnInsertImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertImageActionPerformed
        // TODO add your handling code here:
            JFileChooser fileChooser = new JFileChooser("imagestore");
            fileChooser.addChoosableFileFilter(new ImageFilter());
            fileChooser.setAcceptAllFileFilterUsed(false);

            int option = fileChooser.showOpenDialog(this);
            if(option == JFileChooser.APPROVE_OPTION){
               File file = fileChooser.getSelectedFile();
               path = file.getAbsolutePath();
               ImageIcon imgThisImg = new ImageIcon(new ImageIcon(path).getImage()
               .getScaledInstance(128, 128, Image.SCALE_SMOOTH));
               lblImage.setIcon(imgThisImg);
            }
    }//GEN-LAST:event_btnInsertImageActionPerformed
    int PLSelected;
    private void tblPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlayerMouseClicked
        // TODO add your handling code here:
                int indexTB=tblPlayer.getSelectedRow();
                Player pl =listPL.LayThongTin(indexTB);
                PLSelected=pl.getIDpl();
                txtFullName.setText(pl.getPlname());
                if(pl.getPic()==null){
                    ImageIcon imgThisImg = new ImageIcon(new ImageIcon("imagestore/player.png").getImage()
                .       getScaledInstance(128, 128, Image.SCALE_SMOOTH));
                    lblImage.setIcon(imgThisImg);
                }
                else{
                    ImageIcon imgThisImg = new ImageIcon(new ImageIcon(pl.getPic()).getImage()
                    .getScaledInstance(128, 128, Image.SCALE_SMOOTH));
                    lblImage.setIcon(imgThisImg);
                }
                
                txtNumber.setText(pl.getNumber());
                if(pl.getDate_born()!=null){
                        try{
                        String sDate1=pl.getDate_born();
                        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);  
                        DateBorn.setDate(date1);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                else
                    DateBorn.setDate(null);
                if(pl.getPlname()!=null){
                    txtFullName.setEditable(false);
                }
                else
                    txtFullName.setEditable(true);
    }//GEN-LAST:event_tblPlayerMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
            
            Connection con = new ConnectDB().createConn();
            String sqlCreate="insert into football_player(IDCLB,PLNAME,DAY_BORN,SCORE,YELLOWCARD,REDCARD"
                    + ",PIC,NUMBER) values(?,?,?,0,0,0,?,?)";
            String sqlUpdateClub="update club set SLTV=? where idclb=?";
            try{
                PreparedStatement pre= con.prepareStatement(sqlCreate,ResultSet.TYPE_SCROLL_SENSITIVE
                ,ResultSet.CONCUR_UPDATABLE);
                pre.setInt(1, idCLB);
                pre.setString(2, txtFullName.getText());
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                pre.setString(3, df.format(DateBorn.getDate()));
                pre.setString(4, path);
                pre.setString(5, txtNumber.getText());
                pre.executeUpdate();

                JOptionPane.showMessageDialog(null,"Thêm dữ liệu thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                LoadPlayer(idCLB);
                pre=con.prepareStatement(sqlUpdateClub,ResultSet.TYPE_SCROLL_SENSITIVE
                ,ResultSet.CONCUR_UPDATABLE);
                pre.setInt(1, tblPlayer.getRowCount());
                pre.setInt(2, idCLB);
                pre.executeUpdate();
                con.close();
                
            }
            catch(SQLException e){
                e.printStackTrace();
                System.out.println("Lỗi create player");
            }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Connection con = new ConnectDB().createConn();
        String sqlAddPL="update football_player set PLNAME=?,PIC=?,NUMBER=?,DAY_BORN=? where idpl=?";
        try{
            PreparedStatement pre= con.prepareStatement(sqlAddPL,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                pre.setString(1, txtFullName.getText());
                pre.setString(2, path);
                pre.setString(3, txtNumber.getText());
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                pre.setString(4, df.format(DateBorn.getDate()));
                pre.setString(3, txtNumber.getText());
                pre.setInt(5, PLSelected);
                pre.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(null,"Sửa dữ liệu thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                LoadPlayer(idCLB);

        }
        catch(SQLException e){
                e.printStackTrace();
                System.out.println("Lỗi edit player");

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this,"Sure? You want to delete?", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                Connection con = new ConnectDB().createConn();
                String sqlCreate="delete from football_player where idpl=?";
                String sqlUpdateClub="update club set SLTV=? where idclb=?";
                try{
                    PreparedStatement pre= con.prepareStatement(sqlCreate,ResultSet.TYPE_SCROLL_SENSITIVE
                    ,ResultSet.CONCUR_UPDATABLE);
                    pre.setInt(1, PLSelected);
                    pre.executeUpdate();

                    JOptionPane.showMessageDialog(null,"Xoá dữ liệu thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                    LoadPlayer(idCLB);
                    pre=con.prepareStatement(sqlUpdateClub,ResultSet.TYPE_SCROLL_SENSITIVE
                    ,ResultSet.CONCUR_UPDATABLE);
                    pre.setInt(1, tblPlayer.getRowCount());
                    pre.setInt(2, idCLB);
                    pre.executeUpdate();
                    con.close();

                }
                catch(SQLException e){
                    e.printStackTrace();
                    System.out.println("Lỗi delete player");
                }
            }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtFullName.setEditable(true);
        txtFullName.setText("");
        txtNumber.setText("");
        DateBorn.setDate(null);
        ImageIcon imgThisImg = new ImageIcon(new ImageIcon("imagestore/player.png").getImage()
               .getScaledInstance(123, 128, Image.SCALE_SMOOTH));
        lblImage.setIcon(imgThisImg);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerPage(idCLB).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateBorn;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsertImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTable tblPlayer;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
    public void LoadListclb(int idclb){
        listPL.listPlayer.removeAll(listPL.listPlayer);
        Connection con=new ConnectDB().createConn();
        String sqlClub="select * from football_player where idclb=?";
        try{
            PreparedStatement pre= con.prepareStatement(sqlClub,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, idclb);
            ResultSet rs= pre.executeQuery();
            while(rs.next()){
                Player player= new Player();
                player.setIDclb(idclb);
                player.setIDpl(Integer.parseInt(rs.getString("idpl")));
                player.setPic(rs.getString("pic"));
                player.setDate_born(rs.getString("DAY_BORN"));
                player.setNumber(rs.getString("number"));
                player.setPlname(rs.getString("plname"));
                player.setScore(rs.getInt("SCORE"));
                player.setYellow(rs.getInt("YELLOWCARD"));
                player.setRed(rs.getInt("REDCARD"));
                listPL.listPlayer.add(player);
            }
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi load club");
        }
    }
    
    DefaultTableModel tblmodelPlayer;
    public void LoadPlayer(int clbid) {
                //tạo tablemodel và custom header
        LoadListclb(clbid);
        tblmodelPlayer = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"IDPL","Picture","Name","Date born","Number","Score","Yellow","Red"};
        tblmodelPlayer.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblPlayer.getTableHeader();
        Font headerFont = new Font("Serif", Font.BOLD, 15);
        tableHeader.setFont(headerFont);
        for(Player s: listPL.listPlayer){
            Object row[]=new Object[8];
            row[0]="PL"+s.getIDpl();
            if(s.getPic()==null){
                row[1]="imagestore/player.png";
            }
            else
                row[1]=s.getPic();
            
            row[2]=s.getPlname();
            row[4]=s.getNumber();
            row[3]=s.getDate_born();
            row[5]=s.getScore();
            row[6]=s.getYellow();
            row[7]=s.getRed();
            tblmodelPlayer.addRow(row);
        }
        //set model cho table
        tblPlayer.setBackground(Color.WHITE);
        tblPlayer.setModel(tblmodelPlayer);
        tblPlayer.setFont(new Font("Serif", Font.PLAIN, 12));
        tblPlayer.setRowHeight(64);
        TableColumnModel columnModel = tblPlayer.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(250);
        columnModel.getColumn(3).setPreferredWidth(130);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(7).setPreferredWidth(70);
        tblPlayer.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }
}
