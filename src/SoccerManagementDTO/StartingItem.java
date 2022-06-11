/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

import javax.swing.Icon;


/**
 *
 * @author Administrator
 */
public class StartingItem {
    String tourName;
    Icon logo;
    String tourID;
    public StartingItem() {
    }

    public StartingItem(String tourName, Icon logo, String tourID) {
        this.tourName = tourName;
        this.logo =  logo;
        this.tourID=tourID;
    }

    public String getTourID() {
        return tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public Icon getLogo() {
        return logo;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public void setLogo(Icon logo) {
        this.logo =  logo;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }
    
    
}
