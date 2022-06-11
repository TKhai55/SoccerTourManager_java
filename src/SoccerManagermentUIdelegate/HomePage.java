/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SoccerManagermentUIdelegate;

import SoccerManagementDTO.*;
import java.sql.*;
import SoccerManagementModel.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import java.util.Date;


/**
 *
 * @author quochung
 */
public class HomePage extends javax.swing.JFrame {
    static int idtour;
    ListClub ListCLB=new ListClub();
    ListMatchShedules ListMatch=new ListMatchShedules();
    ListMatchShedules ListMatchPerDay=new ListMatchShedules();
    ListMatchShedules ListResult=new ListMatchShedules();
    ListMatchShedules ListResultPerDay=new ListMatchShedules();
    
    public HomePage(int tourid) {
        idtour=tourid;
        initComponents();
        Date date= new Date();
        DateMatch.setDate(date);
        DateResult.setDate(date);
        LoadTour(tourid);
        LoadClub(tourid);
        LoadMatch(tourid);
        try {
            LoadResult();
        } catch (ParseException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnClub = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMatchSchedule = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnTournament = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnResult = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRanking = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnChange = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        subPannel = new javax.swing.JPanel();
        pannelTournament = new javax.swing.JPanel();
        lbltour = new javax.swing.JLabel();
        lblOrganizer = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblNumTeams = new javax.swing.JLabel();
        lblTimeStart = new javax.swing.JLabel();
        lblTimeEnd = new javax.swing.JLabel();
        pannelClub = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClub = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNameClub = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNumPlayer = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        lblLoGoClub = new javax.swing.JLabel();
        btnInsertImage = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        pannelMatchSchedule = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnRfMatch = new javax.swing.JPanel();
        DateMatch = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        btnrf1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatch = new javax.swing.JTable();
        pannelResult = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        DateResult = new com.toedter.calendar.JDateChooser();
        btnSearchRS = new javax.swing.JButton();
        btnrf2 = new javax.swing.JButton();
        adasd = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        pannelRanking = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRanking = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1045, 650));

        bg.setPreferredSize(new java.awt.Dimension(1045, 650));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(34, 172, 158));
        sidePanel.setMaximumSize(new java.awt.Dimension(195, 650));
        sidePanel.setMinimumSize(new java.awt.Dimension(195, 650));
        sidePanel.setPreferredSize(new java.awt.Dimension(195, 650));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClub.setBackground(new java.awt.Color(34, 172, 158));
        btnClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClubMouseClicked(evt);
            }
        });
        btnClub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 30, 54));
        jLabel3.setText("Club");
        btnClub.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 195, 40));

        btnMatchSchedule.setBackground(new java.awt.Color(34, 172, 158));
        btnMatchSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMatchScheduleMouseClicked(evt);
            }
        });
        btnMatchSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 30, 54));
        jLabel4.setText("Match Schedule");
        btnMatchSchedule.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        sidePanel.add(btnMatchSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 195, 40));

        btnTournament.setBackground(new java.awt.Color(37, 197, 181));
        btnTournament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTournamentMouseClicked(evt);
            }
        });
        btnTournament.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 30, 54));
        jLabel5.setText("Tournament");
        btnTournament.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnTournament, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 195, 40));

        btnResult.setBackground(new java.awt.Color(34, 172, 158));
        btnResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultMouseClicked(evt);
            }
        });
        btnResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 30, 54));
        jLabel6.setText("Result");
        btnResult.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 195, 40));

        btnRanking.setBackground(new java.awt.Color(34, 172, 158));
        btnRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRankingMouseClicked(evt);
            }
        });
        btnRanking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 30, 54));
        jLabel7.setText("Ranking");
        btnRanking.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 195, 40));

        btnChange.setBackground(new java.awt.Color(34, 172, 158));
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 30, 54));
        jLabel11.setText(" Change Tour");

        javax.swing.GroupLayout btnChangeLayout = new javax.swing.GroupLayout(btnChange);
        btnChange.setLayout(btnChangeLayout);
        btnChangeLayout.setHorizontalGroup(
            btnChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        btnChangeLayout.setVerticalGroup(
            btnChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        sidePanel.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 40));

        btnLogOut.setBackground(new java.awt.Color(34, 172, 158));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 30, 54));
        jLabel13.setText(" Log Out");

        javax.swing.GroupLayout btnLogOutLayout = new javax.swing.GroupLayout(btnLogOut);
        btnLogOut.setLayout(btnLogOutLayout);
        btnLogOutLayout.setHorizontalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        btnLogOutLayout.setVerticalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        sidePanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 200, 40));

        bg.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 195, 650));

        subPannel.setBackground(new java.awt.Color(255, 51, 51));
        subPannel.setMaximumSize(new java.awt.Dimension(850, 650));
        subPannel.setPreferredSize(new java.awt.Dimension(850, 650));
        subPannel.setLayout(new java.awt.CardLayout());

        pannelTournament.setBackground(new java.awt.Color(204, 255, 255));
        pannelTournament.setPreferredSize(new java.awt.Dimension(850, 650));

        lbltour.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        lbltour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltour.setText("TOURNAMENT NAME");

        lblOrganizer.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblOrganizer.setText("Organizer:");

        lblLocation.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblLocation.setText("Location:");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/football-player.png"))); // NOI18N

        lblNumTeams.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblNumTeams.setText("Number of teams:");

        lblTimeStart.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblTimeStart.setText("Time Start:");

        lblTimeEnd.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblTimeEnd.setText("Time End:");

        javax.swing.GroupLayout pannelTournamentLayout = new javax.swing.GroupLayout(pannelTournament);
        pannelTournament.setLayout(pannelTournamentLayout);
        pannelTournamentLayout.setHorizontalGroup(
            pannelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelTournamentLayout.createSequentialGroup()
                .addGroup(pannelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelTournamentLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(pannelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pannelTournamentLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lbltour)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        pannelTournamentLayout.setVerticalGroup(
            pannelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelTournamentLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbltour)
                .addGap(34, 34, 34)
                .addGroup(pannelTournamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelTournamentLayout.createSequentialGroup()
                        .addComponent(lblOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(lblLocation)
                        .addGap(45, 45, 45)
                        .addComponent(lblNumTeams)
                        .addGap(45, 45, 45)
                        .addComponent(lblTimeStart)
                        .addGap(45, 45, 45)
                        .addComponent(lblTimeEnd)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(pannelTournamentLayout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        subPannel.add(pannelTournament, "card4");

        pannelClub.setMaximumSize(new java.awt.Dimension(850, 650));
        pannelClub.setVerifyInputWhenFocusTarget(false);
        pannelClub.setLayout(new javax.swing.BoxLayout(pannelClub, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 49));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 49));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CLUB");
        jLabel12.setAlignmentX(0.5F);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(404, 404, 404))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pannelClub.add(jPanel1);

        tblClub.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClub.setToolTipText("");
        tblClub.setAlignmentX(0.0F);
        tblClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClubMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClubMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblClub);

        pannelClub.add(jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Club Name");

        txtNameClub.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel14.setText("Number of Player");

        txtNumPlayer.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        btnEdit.setText("Edit");
        btnEdit.setMaximumSize(new java.awt.Dimension(118, 39));
        btnEdit.setMinimumSize(new java.awt.Dimension(118, 39));
        btnEdit.setPreferredSize(new java.awt.Dimension(118, 39));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnInsertImage.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnInsertImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/icon_open.png"))); // NOI18N
        btnInsertImage.setText("Insert Image");
        btnInsertImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertImageActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/refresh.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertImage))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumPlayer))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNameClub, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoGoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnRefresh)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameClub, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNumPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertImage)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLoGoClub, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pannelClub.add(jPanel2);

        subPannel.add(pannelClub, "card2");

        pannelMatchSchedule.setBackground(new java.awt.Color(255, 255, 255));
        pannelMatchSchedule.setMaximumSize(new java.awt.Dimension(850, 650));
        pannelMatchSchedule.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(102, 255, 204));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setText("MATCH SHEDULES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(325, 325, 325))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pannelMatchSchedule.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        btnRfMatch.setBackground(new java.awt.Color(102, 255, 204));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnrf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/refresh.png"))); // NOI18N
        btnrf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrf1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnRfMatchLayout = new javax.swing.GroupLayout(btnRfMatch);
        btnRfMatch.setLayout(btnRfMatchLayout);
        btnRfMatchLayout.setHorizontalGroup(
            btnRfMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRfMatchLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(DateMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(btnrf1)
                .addContainerGap())
        );
        btnRfMatchLayout.setVerticalGroup(
            btnRfMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRfMatchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRfMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(DateMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnRfMatchLayout.createSequentialGroup()
                .addComponent(btnrf1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pannelMatchSchedule.add(btnRfMatch, java.awt.BorderLayout.PAGE_END);

        tblMatch.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMatchMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMatch);

        pannelMatchSchedule.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        subPannel.add(pannelMatchSchedule, "card3");

        pannelResult.setBackground(new java.awt.Color(255, 255, 255));
        pannelResult.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(102, 255, 204));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("RESULT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(382, 382, 382))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pannelResult.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(102, 255, 204));

        btnSearchRS.setText("Search");
        btnSearchRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRSActionPerformed(evt);
            }
        });

        btnrf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestore/refresh.png"))); // NOI18N
        btnrf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrf2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(DateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchRS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btnrf2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchRS)
                    .addComponent(DateResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnrf2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pannelResult.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
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
        tblResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultMouseClicked(evt);
            }
        });
        adasd.setViewportView(tblResult);

        pannelResult.add(adasd, java.awt.BorderLayout.CENTER);

        subPannel.add(pannelResult, "card5");

        pannelRanking.setBackground(new java.awt.Color(255, 255, 255));
        pannelRanking.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 255, 204));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setText("RANKING");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(373, 373, 373))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(17, 17, 17))
        );

        pannelRanking.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pannelRanking.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        tblRanking.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblRanking);

        pannelRanking.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        subPannel.add(pannelRanking, "card6");

        bg.add(subPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 0, 850, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClubMouseClicked
        setColor(btnClub);
        resetColor(btnMatchSchedule);
        resetColor(btnTournament);
        resetColor(btnResult);
        resetColor(btnRanking);
        resetColor(btnChange);
        resetColor(btnLogOut);
        LoadClub(idtour);
        removePannel();
        addPannel(pannelClub);
    }//GEN-LAST:event_btnClubMouseClicked

    private void btnMatchScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatchScheduleMouseClicked
        resetColor(btnClub);
        setColor(btnMatchSchedule);
        resetColor(btnTournament);
        resetColor(btnResult);
        resetColor(btnRanking);
        resetColor(btnChange);
        resetColor(btnLogOut);
        LoadMatch(idtour);
        perday=false;
        removePannel();
        addPannel(pannelMatchSchedule);
    }//GEN-LAST:event_btnMatchScheduleMouseClicked

    private void btnTournamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTournamentMouseClicked
        resetColor(btnClub);
        resetColor(btnMatchSchedule);
        setColor(btnTournament);
        resetColor(btnResult);
        resetColor(btnChange);
        resetColor(btnRanking);
        resetColor(btnLogOut);
        removePannel();
        addPannel(pannelTournament);

    }//GEN-LAST:event_btnTournamentMouseClicked

    private void btnResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultMouseClicked
  
            resetColor(btnClub);
            resetColor(btnMatchSchedule);
            resetColor(btnTournament);
            setColor(btnResult);
            resetColor(btnRanking);
            resetColor(btnChange);
            resetColor(btnLogOut);
            perday=false;
            LoadMatch(idtour);
        try {
            LoadResult();
        } catch (ParseException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
            removePannel();
            addPannel(pannelResult);
    }//GEN-LAST:event_btnResultMouseClicked

    private void btnRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRankingMouseClicked
        resetColor(btnClub);
        resetColor(btnMatchSchedule);
        resetColor(btnTournament);
        resetColor(btnResult);
        setColor(btnRanking);
        resetColor(btnChange);
        resetColor(btnLogOut);
        LoadRaking(idtour);
        removePannel();
        addPannel(pannelRanking);
    }//GEN-LAST:event_btnRankingMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
            int num=0;
            num= Integer.parseInt(txtNumPlayer.getText());
            Connection con= new ConnectDB().createConn();
            String sql="update club set clbname=?,logo=?,sltv=? where idclb=?";
            try{
                PreparedStatement pre= con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                pre.setString(1, txtNameClub.getText());
                pre.setString(2, path);
                pre.setString(3, txtNumPlayer.getText());
                pre.setInt(4, clbSelected);
                pre.executeUpdate();
                
                //create default player
                String sqlCreateDefaultClub="insert into football_player(PLNAME,IDCLB) values(null,"+String.valueOf(clbSelected)+")";
                for(int i=0; i<num;i++){
                    Statement stat= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                                ResultSet.CONCUR_UPDATABLE);
                    stat.executeUpdate(sqlCreateDefaultClub);
                }
                con.close();
                JOptionPane.showMessageDialog(null,"Thêm dữ liệu thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                LoadClub(idtour);
                
            }
            catch(SQLException e){
                e.printStackTrace();
                System.out.println("Lỗi add club");

        }
        ClubPage clubpage = new ClubPage(clbSelected,idtour);
        clubpage.setVisible(true);
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClubMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            ClubPage clubpage = new ClubPage(clbSelected,idtour);
            clubpage.setVisible(true);
        }
        
    }//GEN-LAST:event_tblClubMouseClicked

    int clbSelected=0;
    private void tblClubMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClubMousePressed
        // TODO add your handling code here:
                int indexTB=tblClub.getSelectedRow();
                Club clb =ListCLB.LayThongTin(indexTB);
                clbSelected=clb.getIdclb();
                txtNameClub.setText(clb.getName());
                if(clb.getLoGo()==null){
                    ImageIcon imgThisImg = new ImageIcon(new ImageIcon("imagestore/football-club.png").getImage()
                .       getScaledInstance(128, 128, Image.SCALE_SMOOTH));
                    lblLoGoClub.setIcon(imgThisImg);
                }
                else{
                    ImageIcon imgThisImg = new ImageIcon(new ImageIcon(clb.getLoGo()).getImage()
                    .getScaledInstance(128, 128, Image.SCALE_SMOOTH));
                    lblLoGoClub.setIcon(imgThisImg);
                }
                
                txtNumPlayer.setText(Integer.toString(clb.getNumPlayer()));
                if(clb.getNumPlayer()!=0){
                    txtNumPlayer.setEditable(false);
                }
                else{
                    txtNumPlayer.setEditable(true);
                }
    }//GEN-LAST:event_tblClubMousePressed
    String path ="imagestore/football-club.png";

    boolean perday = false;
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
               lblLoGoClub.setIcon(imgThisImg);
            }
    }//GEN-LAST:event_btnInsertImageActionPerformed

    private void tblMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMatchMouseClicked
        // TODO add your handling code here:
        if(perday==false){
            int indexTB=tblMatch.getSelectedRow();
                MatchShedules match =ListMatch.LayThongTin(indexTB);
            if(evt.getClickCount()==2){
                EditMatch editmatch = new EditMatch(match);
                editmatch.setVisible(true);
            }
        }
        else{
            int indexTB=tblMatch.getSelectedRow();
                MatchShedules match =ListMatchPerDay.LayThongTin(indexTB);
            if(evt.getClickCount()==2){
                EditMatch editmatch = new EditMatch(match);
                editmatch.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_tblMatchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        perday=true;
        ListMatchPerDay.ListMatch.removeAll(ListMatchPerDay.ListMatch);
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String search=df.format(DateMatch.getDate());
        for(MatchShedules s: ListMatch.ListMatch){
            if(s.getDate()==null)
                continue;
            if(s.getDate().equals(search)){
                ListMatchPerDay.ThemMatch(s);
            }
        }
        LoadMatchPerDate();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRSActionPerformed
        // TODO add your handling code here:
        perday=true;
        ListResultPerDay.ListMatch.removeAll(ListResultPerDay.ListMatch);
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String search=df.format(DateResult.getDate());
        for(MatchShedules s: ListResult.ListMatch){
            if(s.getDate()==null)
                continue;
            if(s.getDate().equals(search)){
                ListResultPerDay.ThemMatch(s);
            }
        }
        LoadResultPerDate();
    }//GEN-LAST:event_btnSearchRSActionPerformed

    private void tblResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultMouseClicked
        // TODO add your handling code here:
        if(perday==false){
            int indexTB=tblResult.getSelectedRow();
                MatchShedules match =ListResult.LayThongTin(indexTB);
            if(evt.getClickCount()==2){
                ResultDetails result = new ResultDetails(match.getIdmatch());
                result.setVisible(true);
            }
        }
        else{
            int indexTB=tblResult.getSelectedRow();
                MatchShedules match =ListResultPerDay.LayThongTin(indexTB);
            if(evt.getClickCount()==2){
                ResultDetails result = new ResultDetails(match.getIdmatch());
                result.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_tblResultMouseClicked

    public String getUsername(){
        String user=null;
        Connection con = new ConnectDB().createConn();
        String sql="select username from tournament where idtnm= ?";
        try{
            PreparedStatement pre= con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, idtour);
            ResultSet rs= pre.executeQuery();
            while(rs.next()){
                user=rs.getString("username");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi lay username");
        }
        return user;
    }
    private void btnChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseClicked
        // TODO add your handling code here:
        setColor(btnChange);
        resetColor(btnMatchSchedule);
        resetColor(btnTournament);
        resetColor(btnResult);
        resetColor(btnRanking);
        resetColor(btnClub);
        resetColor(btnLogOut);
        String user= getUsername();
        int result = JOptionPane.showConfirmDialog(this,"Sure? You want to change tour?", "Swing Tester",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.dispose();
            new StartingPage(user).setVisible(true);
        }
    }//GEN-LAST:event_btnChangeMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        setColor(btnLogOut);
        resetColor(btnMatchSchedule);
        resetColor(btnTournament);
        resetColor(btnResult);
        resetColor(btnRanking);
        resetColor(btnClub);
        resetColor(btnChange);
        int result = JOptionPane.showConfirmDialog(this,"Sure? You want to log out?", "Swing Tester",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.dispose();
            new Login().setVisible(true);
        }
        
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        LoadClub(idtour);
        perday=false;
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnrf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrf1ActionPerformed
        // TODO add your handling code here:
        LoadMatch(idtour);
        perday=false;
    }//GEN-LAST:event_btnrf1ActionPerformed

    private void btnrf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrf2ActionPerformed
        // TODO add your handling code here:
        perday=false;
        LoadMatch(idtour);
        try {
            LoadResult();
        } catch (ParseException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnrf2ActionPerformed

    void setColor(JPanel jPanel){
       jPanel.setBackground(new Color(37,197,181));
    }
    
    void resetColor(JPanel jPanel){
        jPanel.setBackground(new Color(34,172,158));
    }
    
    
    void getListClub(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Connection con = DriverManager.getConnection("")
    }
    
    void removePannel(){
        subPannel.removeAll();
        subPannel.repaint();
        subPannel.revalidate();
    }
    
    void addPannel(JPanel jPanel){
        subPannel.add(jPanel);
        subPannel.repaint();
        subPannel.revalidate();
    }
    
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage(idtour).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateMatch;
    private com.toedter.calendar.JDateChooser DateResult;
    private javax.swing.JScrollPane adasd;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnChange;
    private javax.swing.JPanel btnClub;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsertImage;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnMatchSchedule;
    private javax.swing.JPanel btnRanking;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel btnResult;
    private javax.swing.JPanel btnRfMatch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchRS;
    private javax.swing.JPanel btnTournament;
    private javax.swing.JButton btnrf1;
    private javax.swing.JButton btnrf2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLoGoClub;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNumTeams;
    private javax.swing.JLabel lblOrganizer;
    private javax.swing.JLabel lblTimeEnd;
    private javax.swing.JLabel lblTimeStart;
    private javax.swing.JLabel lbltour;
    private javax.swing.JPanel pannelClub;
    private javax.swing.JPanel pannelMatchSchedule;
    private javax.swing.JPanel pannelRanking;
    private javax.swing.JPanel pannelResult;
    private javax.swing.JPanel pannelTournament;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel subPannel;
    private javax.swing.JTable tblClub;
    private javax.swing.JTable tblMatch;
    private javax.swing.JTable tblRanking;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtNameClub;
    private javax.swing.JTextField txtNumPlayer;
    // End of variables declaration//GEN-END:variables

    public void LoadTour(int id) {
        Connection con=new ConnectDB().createConn();
        String sqlTour="select * from tournament where IDTNM=?";
        try{
            PreparedStatement pre= con.prepareStatement(sqlTour,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, id);
            ResultSet rs= pre.executeQuery();
            
            if(rs.absolute(1)){
                lbltour.setText(rs.getString("tnmname"));
                lblNumTeams.setText("Number of teams:  "+rs.getString("sl"));
                lblOrganizer.setText("Organizer:  "+rs.getString("organizational"));
                lblLocation.setText("Location:  "+rs.getString("location"));
                lblTimeEnd.setText("Time end:  "+rs.getString("timeend"));
                lblTimeStart.setText("Time start:  "+rs.getString("timestart"));
                ImageIcon imgThisImg = new ImageIcon(new ImageIcon(rs.getString("logo")).getImage()
                .getScaledInstance(128, 128, Image.SCALE_SMOOTH));
                lblLogo.setIcon(imgThisImg);
            }
            
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi load tournament");
        }
    }
    
    public void LoadListclb(int tourid){
        ListCLB.listClub.removeAll(ListCLB.listClub);
        Connection con=new ConnectDB().createConn();
        String sqlClub="select * from club where idtnm=?";
        try{
            PreparedStatement pre= con.prepareStatement(sqlClub,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, tourid);
            ResultSet rs= pre.executeQuery();
            while(rs.next()){
                Club club= new Club();
                club.setIdtnm(tourid);
                club.setIdclb(Integer.parseInt(rs.getString("idclb")));
                club.setName(rs.getString("clbname"));
                club.setLoGo(rs.getString("logo"));
                if(rs.getString("sltv")==null)
                    club.setNumPlayer(0);
                else
                    club.setNumPlayer(Integer.parseInt(rs.getString("sltv")));
                ListCLB.ThemCLB(club);
            }
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi load club");
        }
    }
    
    DefaultTableModel tblmodelClub;
    public void LoadClub(int tourid) {
        //tạo tablemodel và custom header
        LoadListclb(tourid);
        tblmodelClub = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"IDCLB","LOGO","CLUB NAME","MEMBER"};
        tblmodelClub.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblClub.getTableHeader();
        Font headerFont = new Font("Serif", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        for(Club s: ListCLB.listClub){
            String row[]=new String[4];
            row[0]="CLB"+s.getIdclb();
            
            if(s.getLoGo()==null){
                row[1]="imagestore/football-club.png";
            }
            else
                row[1]=s.getLoGo();
            row[2]=s.getName();
            row[3]=String.valueOf(s.getNumPlayer());
            tblmodelClub.addRow(row);
        }
        //set model cho table
        tblClub.setBackground(Color.WHITE);
        tblClub.setModel(tblmodelClub);
        tblClub.setFont(new Font("Serif", Font.PLAIN, 14));
        tblClub.setRowHeight(64);
        TableColumnModel columnModel = tblClub.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(450);
        columnModel.getColumn(3).setPreferredWidth(50);
        tblClub.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }

    
        public void LoadListMatch(int tourid){
        ListMatch.ListMatch.removeAll(ListMatch.ListMatch);
        Connection con=new ConnectDB().createConn();
        String sqlClub="select * from match1 where idtnm=?";
        try{
            PreparedStatement pre= con.prepareStatement(sqlClub,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, tourid);
            ResultSet rs= pre.executeQuery();
            while(rs.next()){
                MatchShedules match= new MatchShedules();
                match.setIdtnm(tourid);
                match.setIdmatch(rs.getInt("idmatch"));
                match.setIdteam1(rs.getInt("clb1"));
                match.setIdteam2(rs.getInt("clb2"));
                match.setScore1(rs.getInt("scored1"));
                match.setScore2(rs.getInt("scored2"));
                match.setStadium(rs.getString("stadium"));
                match.setDate(rs.getString("date"));
                match.setTime(rs.getString("time"));
                match.setStatus(rs.getBoolean("STT"));
                Club club= new Club();
                club=ListCLB.LayThongTinTheoID(match.getIdteam1());
                match.setTeam1name(club.getName());
                match.setPic1(club.getLoGo());
                club=ListCLB.LayThongTinTheoID(match.getIdteam2());
                match.setTeam2name(club.getName());
                match.setPic2(club.getLoGo());
                ListMatch.ThemMatch(match);
            }
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi load club");
        }
    }
        
    DefaultTableModel tblmodelMatch;    
    public void LoadMatch(int tourid) {
        LoadListMatch(tourid);
        tblmodelMatch = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"IDMATCH","","TEAM 1","","TEAM 2","DATE","TIME","STADIUM"};
        tblmodelMatch.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblMatch.getTableHeader();
        Font headerFont = new Font("Serif", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        for(MatchShedules s: ListMatch.ListMatch){
            String row[]=new String[8];
            row[0]="MAT"+s.getIdmatch();
            
            if(s.getPic1()==null){
                row[1]="imagestore/football-club.png";
            }
            else
                row[1]=s.getPic1();
            row[2]=s.getTeam1name();
            if(s.getPic2()==null){
                row[3]="imagestore/football-club.png";
            }
            else
                row[3]=s.getPic2();
            row[4]=s.getTeam2name();
            
            row[5]=s.getDate();
            row[6]=s.getTime();
            row[7]=s.getStadium();
            tblmodelMatch.addRow(row);
        }
        //set model cho table
        tblMatch.setBackground(Color.WHITE);
        tblMatch.setModel(tblmodelMatch);
        tblMatch.setFont(new Font("Serif", Font.PLAIN, 14));
        tblMatch.setRowHeight(64);
        TableColumnModel columnModel = tblMatch.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(64);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(7).setPreferredWidth(100);
        tblMatch.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        tblMatch.getColumnModel().getColumn(3).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }
    public void LoadMatchPerDate() {
        tblmodelMatch = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"IDMATCH","","TEAM 1","","TEAM 2","DATE","TIME","STADIUM"};
        tblmodelMatch.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblMatch.getTableHeader();
        Font headerFont = new Font("Serif", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        for(MatchShedules s: ListMatchPerDay.ListMatch){
            String row[]=new String[8];
            row[0]="MAT"+s.getIdmatch();
            
            if(s.getPic1()==null){
                row[1]="imagestore/football-club.png";
            }
            else
                row[1]=s.getPic1();
            row[2]=s.getTeam1name();
            if(s.getPic2()==null){
                row[3]="imagestore/football-club.png";
            }
            else
                row[3]=s.getPic2();
            row[4]=s.getTeam2name();
            
            row[5]=s.getDate();
            row[6]=s.getTime();
            row[7]=s.getStadium();
            tblmodelMatch.addRow(row);
        }
        //set model cho table
        tblMatch.setBackground(Color.WHITE);
        tblMatch.setModel(tblmodelMatch);
        tblMatch.setFont(new Font("Serif", Font.PLAIN, 14));
        tblMatch.setRowHeight(64);
        TableColumnModel columnModel = tblMatch.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(64);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(7).setPreferredWidth(100);
        tblMatch.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        tblMatch.getColumnModel().getColumn(3).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }

    private void LoadResult() throws ParseException {
        Date today= new Date();
        ListResult.ListMatch.removeAll(ListResult.ListMatch);
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String search=null;
        for(MatchShedules s: ListMatch.ListMatch){
            if(s.getDate()==null)
                continue;
            else{
                search=s.getDate();
                Date dateM= df.parse(search);
                if(dateM.compareTo(today)<=0){
                    ListResult.ThemMatch(s);
                }
            }
        }
        tblmodelMatch = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"IDMATCH","","TEAM 1","SCORE","","TEAM 2","DATE","TIME","STADIUM"};
        tblmodelMatch.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblResult.getTableHeader();
        Font headerFont = new Font("Serif", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        for(MatchShedules s: ListResult.ListMatch){
            String row[]=new String[9];
            row[0]="MAT"+s.getIdmatch();
            
            if(s.getPic1()==null){
                row[1]="imagestore/football-club.png";
            }
            else
                row[1]=s.getPic1();
            row[2]=s.getTeam1name();
            if(s.getStatus()==false){
                row[3]="-- : --";
            }
            else{
                row[3]=String.valueOf(s.getScore1())+" : "+String.valueOf(s.getScore2());
            }
            if(s.getPic2()==null){
                row[4]="imagestore/football-club.png";
            }
            else
                row[4]=s.getPic2();
            row[5]=s.getTeam2name();
            
            row[6]=s.getDate();
            row[7]=s.getTime();
            row[8]=s.getStadium();
            tblmodelMatch.addRow(row);
        }
        //set model cho table
        tblResult.setBackground(Color.WHITE);
        tblResult.setModel(tblmodelMatch);
        tblResult.setFont(new Font("Serif", Font.PLAIN, 14));
        tblResult.setRowHeight(64);
        TableColumnModel columnModel = tblResult.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(60);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(63);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(7).setPreferredWidth(70);
        columnModel.getColumn(8).setPreferredWidth(100);
        tblResult.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        tblResult.getColumnModel().getColumn(4).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }

    private void LoadResultPerDate() {
        tblmodelMatch = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"IDMATCH","","TEAM 1","SCORE","","TEAM 2","DATE","TIME","STADIUM"};
        tblmodelMatch.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblResult.getTableHeader();
        Font headerFont = new Font("Serif", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        for(MatchShedules s: ListResultPerDay.ListMatch){
            String row[]=new String[9];
            row[0]="MAT"+s.getIdmatch();
            
            if(s.getPic1()==null){
                row[1]="imagestore/football-club.png";
            }
            else
                row[1]=s.getPic1();
            row[2]=s.getTeam1name();
            if(s.getStatus()==false){
                row[3]="-- : --";
            }
            else{
                row[3]=String.valueOf(s.getScore1())+" : "+String.valueOf(s.getScore2());
            }
            if(s.getPic2()==null){
                row[4]="imagestore/football-club.png";
            }
            else
                row[4]=s.getPic2();
            row[5]=s.getTeam2name();
            
            row[6]=s.getDate();
            row[7]=s.getTime();
            row[8]=s.getStadium();
            tblmodelMatch.addRow(row);
        }
        //set model cho table
        tblResult.setBackground(Color.WHITE);
        tblResult.setModel(tblmodelMatch);
        tblResult.setFont(new Font("Serif", Font.PLAIN, 14));
        tblResult.setRowHeight(64);
        TableColumnModel columnModel = tblResult.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(63);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(7).setPreferredWidth(70);
        columnModel.getColumn(8).setPreferredWidth(100);
        tblResult.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        tblResult.getColumnModel().getColumn(4).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }

    private void LoadRaking(int idtour) {
        tblmodelMatch = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        String tieude[]={"POSITION","","CLUB","PLAYED","WON","DRAWN","LOST","GF","GA","GD","POINTS"};
        tblmodelMatch.setColumnIdentifiers(tieude);
        JTableHeader tableHeader = tblRanking.getTableHeader();
        Font headerFont = new Font("Serif", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        
        Connection con = new ConnectDB().createConn();
        String ranking="select * from club where idtnm=? order by score desc,hs desc";
        try{
            PreparedStatement pre= con.prepareStatement(ranking,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, idtour);
            ResultSet rs= pre.executeQuery();
            int i=1;
            while(rs.next()){
                String row[]= new String[11];
                row[0]=String.valueOf(i);
                if(rs.getString("logo")==null)
                    break;
                row[1]=rs.getString("logo");
                row[2]=rs.getString("clbname");
                row[3]=rs.getString("st");
                row[4]=rs.getString("win");
                row[5]=rs.getString("draw");
                row[6]=rs.getString("lose");
                row[7]=rs.getString("bt");
                row[8]=rs.getString("sbt");
                row[9]=rs.getString("hs");
                row[10]=rs.getString("score");
                tblmodelMatch.addRow(row);
                i++;
            }
            
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi load ranking");
        }
        
        //set model cho table
        tblRanking.setBackground(Color.WHITE);
        tblRanking.setModel(tblmodelMatch);
        tblRanking.setFont(new Font("Serif", Font.PLAIN, 14));
        tblRanking.setRowHeight(64);
        TableColumnModel columnModel = tblRanking.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(64);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(60);
        columnModel.getColumn(5).setPreferredWidth(60);
        columnModel.getColumn(6).setPreferredWidth(60);
        columnModel.getColumn(7).setPreferredWidth(40);
        columnModel.getColumn(8).setPreferredWidth(40);
        columnModel.getColumn(9).setPreferredWidth(40);
        columnModel.getColumn(10).setPreferredWidth(60);
        tblRanking.getColumnModel().getColumn(1).setCellRenderer(new TableRenderer());
        this.setVisible(true);
    }
    
}
  
