/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoccerManagementDTO;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class MatchScheduleAlgorithm {
    public ArrayList<Integer> arr1;
    public ArrayList<Integer> arr2;

    public MatchScheduleAlgorithm(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public MatchScheduleAlgorithm() {
        arr1= new ArrayList<>();
        arr2= new ArrayList<>();
    }
    public void algorithm(int []arr){
        int sodoi=arr.length;

            int rd= sodoi-1;
        
        for(int i=1;i<=rd;i++){

            if(i!=1){
                arr=rechange(arr);
            }
            for(int j=0;j<sodoi/2;j++){
                
                arr1.add(arr[j]);
            }
                
             for(int t=sodoi-1;t>=sodoi/2;t--){
                        arr2.add(arr[t]);
                }
                

    }
    }
    public static int[] rechange(int[] arr) {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>1;i--){
            arr[i]=arr[i-1];
        }
        arr[1]=temp;
        return arr;
    }
}
