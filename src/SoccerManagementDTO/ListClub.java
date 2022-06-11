package SoccerManagementDTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import SoccerManagementDTO.Club;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class ListClub {
    public List<Club> listClub;

    public ListClub() {
        listClub= new ArrayList<Club>();
    }

    public ListClub(List<Club> listClub) {
        this.listClub = listClub;
    }
    public int TimViTriCLB(int idCLB){
        for(Club s: listClub){
            if(s.getIdclb()==idCLB)
                return listClub.indexOf(s);
        }
        return -1;
    }
    public void ThemCLB(Club s){
            listClub.add(s);
    }
    public Club LayThongTin(int i){
        if(i>=0 && i<=listClub.size())
          return this.listClub.get(i);
        return null;

    }
    public Club LayThongTinTheoID(int idclb){
        int i=TimViTriCLB(idclb);
        if(i!=-1)
            return this.listClub.get(i);
        return null;
    }
    public int SLCLB(){
        return this.listClub.size();
    }
}
