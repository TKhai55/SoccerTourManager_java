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
public class ListResultItem {
    public List<ResultItem> ListResultItem;

    public ListResultItem() {
        this.ListResultItem= new ArrayList<>();
    }

    public ListResultItem(List<ResultItem> ListResultItem) {
        this.ListResultItem = ListResultItem;
    }
    public int TimViTriResultItem(int idResultItem){
        for(ResultItem s: ListResultItem){
            if(s.getIdmatch()==idResultItem)
                return ListResultItem.indexOf(s);
        }
        return -1;
    }
    public void ThemResultItem(ResultItem s){
            ListResultItem.add(s);
    }
    public ResultItem LayThongTin(int i){
        if(i>=0 && i<=ListResultItem.size())
          return this.ListResultItem.get(i);
        return null;

    }
    public ResultItem LayThongTinTheoID(int idResultItem){
        int i=TimViTriResultItem(idResultItem);
        if(i!=-1)
            return this.ListResultItem.get(i);
        return null;
    }
    public int SLMatch(){
        return this.ListResultItem.size();
    }
}
