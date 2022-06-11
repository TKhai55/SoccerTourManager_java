/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

/**
 *
 * @author Administrator
 */
public class Tournamnet {
    String tnmName,stadium,organizer,timestart,timeend,logo;
    int sl,rk,num;

    public Tournamnet() {
    }

    public Tournamnet(String tnmName, String stadium, String organizer, String timestart, String timeend, String logo, int sl, int rk, int num) {
        this.tnmName = tnmName;
        this.stadium = stadium;
        this.organizer = organizer;
        this.timestart = timestart;
        this.timeend = timeend;
        this.logo = logo;
        this.sl = sl;
        this.rk = rk;
        this.num = num;
    }

    public void setTnmName(String tnmName) {
        this.tnmName = tnmName;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    public void setTimeend(String timeend) {
        this.timeend = timeend;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void setRk(int rk) {
        this.rk = rk;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTnmName() {
        return tnmName;
    }

    public String getStadium() {
        return stadium;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getTimestart() {
        return timestart;
    }

    public String getTimeend() {
        return timeend;
    }

    public String getLogo() {
        return logo;
    }

    public int getSl() {
        return sl;
    }

    public int getRk() {
        return rk;
    }

    public int getNum() {
        return num;
    }
    
}
