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
public class ListMatchShedules {
    public List<MatchShedules> ListMatch;

    public ListMatchShedules() {
        ListMatch= new ArrayList<MatchShedules>();
    }

    public ListMatchShedules(List<MatchShedules> listMatch) {
        this.ListMatch = listMatch;
    }
    public int TimViTriMatch(int idMatch){
        for(MatchShedules s: ListMatch){
            if(s.getIdmatch()==idMatch)
                return ListMatch.indexOf(s);
        }
        return -1;
    }
    public void ThemMatch(MatchShedules s){
            ListMatch.add(s);
    }
    public MatchShedules LayThongTin(int i){
        if(i>=0 && i<=ListMatch.size())
          return this.ListMatch.get(i);
        return null;

    }
    public MatchShedules LayThongTinTheoID(int idMatch){
        int i=TimViTriMatch(idMatch);
        if(i!=-1)
            return this.ListMatch.get(i);
        return null;
    }
    public int SLMatch(){
        return this.ListMatch.size();
    }
}
