/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

/**
 *
 * @author Administrator
 */
public class MatchShedules {
    int idmatch,idtnm,idteam1,idteam2,score1,score2;
    String date,time,stadium,team1name,team2name,pic1,pic2;
    Boolean status;
    public MatchShedules() {
        this.status=false;
    }

    public MatchShedules(int idmatch, int idtnm, int idteam1, int idteam2, int score1, int score2, String date, String time, String stadium, String team1name, String team2name, String pic1, String pic2, Boolean status) {
        this.idmatch = idmatch;
        this.idtnm = idtnm;
        this.idteam1 = idteam1;
        this.idteam2 = idteam2;
        this.score1 = score1;
        this.score2 = score2;
        this.date = date;
        this.time = time;
        this.stadium = stadium;
        this.team1name = team1name;
        this.team2name = team2name;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public void setIdtnm(int idtnm) {
        this.idtnm = idtnm;
    }

    public void setIdteam1(int idteam1) {
        this.idteam1 = idteam1;
    }

    public void setIdteam2(int idteam2) {
        this.idteam2 = idteam2;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setTeam1name(String team1name) {
        this.team1name = team1name;
    }

    public void setTeam2name(String team2name) {
        this.team2name = team2name;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public int getIdmatch() {
        return idmatch;
    }

    public int getIdtnm() {
        return idtnm;
    }

    public int getIdteam1() {
        return idteam1;
    }

    public int getIdteam2() {
        return idteam2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStadium() {
        return stadium;
    }

    public String getTeam1name() {
        return team1name;
    }

    public String getTeam2name() {
        return team2name;
    }

    public String getPic1() {
        return pic1;
    }

    public String getPic2() {
        return pic2;
    }
    
}
