/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ListPlayer {
    public List<Player> listPlayer;

    public ListPlayer() {
        this.listPlayer= new ArrayList<Player>();
    }

    public ListPlayer(List<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }
    public int TimViTriPlayer(int idPL){
        for(Player s: listPlayer){
            if(s.getIDpl()==idPL)
                return listPlayer.indexOf(s);
        }
        return -1;
    }
    public void ThemPlayer(Player s){
            listPlayer.add(s);
    }
    public Player LayThongTin(int i){
        if(i>=0 && i<=listPlayer.size())
          return this.listPlayer.get(i);
        return null;

    }
    public Player LayThongTinTheoID(int idpl){
        int i=TimViTriPlayer(idpl);
        if(i!=-1)
            return this.listPlayer.get(i);
        return null;
    }
    public int SLPlayer(){
        return this.listPlayer.size();
    }
}
