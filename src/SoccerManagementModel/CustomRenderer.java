/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementModel;

import SoccerManagementDTO.StartingItem;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Administrator
 */
public class CustomRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object>{
     @Override
     public Component getListCellRendererComponent(JList<?> list,Object value, int index, boolean isSelected, boolean hasFocus){
         
         StartingItem item =(StartingItem) value;
         setIcon(item.getLogo());
         setIconTextGap(10);
         setText(item.getTourName());
         
         if(isSelected){
             setBackground(list.getSelectionBackground());
             setForeground(list.getSelectionBackground());
         }
         else{
             setBackground(list.getBackground());
             setForeground(list.getBackground());
         }
         setEnabled(true);
         setFont(list.getFont());
         
         return this;
     }
}
