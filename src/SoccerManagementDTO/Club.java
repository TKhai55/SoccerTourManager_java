/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

/**
 *
 * @author quochung
 */
public class Club {
    String name;
    String logo;
    int numPlayer,idclb,score,hs,idtnm,win,lose,draw,bt,sbt,st;

    public Club() {
    }

    public Club(String name, String logo, int numPlayer, int idclb, int score, int hs, int idtnm, int win, int lose, int draw, int bt, int sbt, int st) {
        this.name = name;
        this.logo = logo;
        this.numPlayer = numPlayer;
        this.idclb = idclb;
        this.score = score;
        this.hs = hs;
        this.idtnm = idtnm;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.bt = bt;
        this.sbt = sbt;
        this.st = st;
    }

    public String getName() {
        return name;
    }

    public String getLoGo() {
        return logo;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public int getIdclb() {
        return idclb;
    }

    public int getScore() {
        return score;
    }

    public int getHs() {
        return hs;
    }

    public int getIdtnm() {
        return idtnm;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getDraw() {
        return draw;
    }

    public int getBt() {
        return bt;
    }

    public int getSbt() {
        return sbt;
    }

    public int getSt() {
        return st;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoGo(String logo) {
        this.logo = logo;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public void setIdclb(int idclb) {
        this.idclb = idclb;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    public void setIdtnm(int idtnm) {
        this.idtnm = idtnm;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void setBt(int bt) {
        this.bt = bt;
    }

    public void setSbt(int sbt) {
        this.sbt = sbt;
    }

    public void setSt(int st) {
        this.st = st;
    }
    

    
    
    
    
}
