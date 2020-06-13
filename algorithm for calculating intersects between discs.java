/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Arrays;

/**
 *
 * @author ahmed khaled
 */
public class Task {
  
    int Intersections(int[] a){
        int y=0;
        int x=0;
        int OpenDisks=0;
        int intersections=0;
        int[] sp = new int[a.length];
        int[] ep = new int[a.length];
        for(int i=0; i<a.length; i++){
          sp[i]=i-a[i];
          ep[i]=i+a[i];
        }       
         Arrays.sort(sp);
         Arrays.sort(ep);
         while(y<a.length){  
          if(sp[y]<=ep[x]){
            OpenDisks++;  
            if(OpenDisks>1){
                intersections +=OpenDisks-1;
                for(int g=y-1;g>=0;g--){
                   if(y-a[y]<=g+a[g]){
                    System.out.println("intersection : "+g+" / "+y);
                   }
                }
            }
            y++;
          }
          else{
             
              OpenDisks--;
              x++;
          }
        } 
     if(intersections==0){
         System.out.println("There is no intersections");
     }    
     return intersections;   
    }
    
   
    
}
