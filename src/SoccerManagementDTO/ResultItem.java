/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

/**
 *
 * @author Administrator
 */
public class ResultItem {
    int idobject,idclb,idmatch,time,idpl;
    String type;

    public ResultItem() {
    }

    public ResultItem(int idobject, int idclb, int idmatch, int time, int idpl, String type) {
        this.idobject = idobject;
        this.idclb = idclb;
        this.idmatch = idmatch;
        this.time = time;
        this.idpl = idpl;
        this.type = type;
    }

    public void setIdpl(int idpl) {
        this.idpl = idpl;
    }

    public int getIdpl() {
        return idpl;
    }

    

    public int getIdobject() {
        return idobject;
    }

    public int getIdclb() {
        return idclb;
    }

    public int getIdmatch() {
        return idmatch;
    }

    public int getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public void setIdobject(int idobject) {
        this.idobject = idobject;
    }

    public void setIdclb(int idclb) {
        this.idclb = idclb;
    }

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
