/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

/**
 *
 * @author Administrator
 */
public class Player {
    String Plname,date_born,pic,number;
    int IDpl,IDclb,score,yellow,red;

    public Player() {
    }

    public Player(String Plname, String date_born, String pic, String number, int IDpl, int IDclb, int score, int yellow, int red) {
        this.Plname = Plname;
        this.date_born = date_born;
        this.pic = pic;
        this.number = number;
        this.IDpl = IDpl;
        this.IDclb = IDclb;
        this.score = score;
        this.yellow = yellow;
        this.red = red;
    }

   

    public void setPlname(String Plname) {
        this.Plname = Plname;
    }

    public void setDate_born(String date_born) {
        this.date_born = date_born;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setIDpl(int IDpl) {
        this.IDpl = IDpl;
    }

    public void setIDclb(int IDclb) {
        this.IDclb = IDclb;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setNumber(String number) {
        this.number = number;
    }



    public String getPlname() {
        return Plname;
    }

    public String getDate_born() {
        return date_born;
    }

    public String getPic() {
        return pic;
    }

    public int getIDpl() {
        return IDpl;
    }

    public int getIDclb() {
        return IDclb;
    }

    public int getScore() {
        return score;
    }

    public int getYellow() {
        return yellow;
    }

    public int getRed() {
        return red;
    }

    public String getNumber() {
        return number;
    }


    
}
