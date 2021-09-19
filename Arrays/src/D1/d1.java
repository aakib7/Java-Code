/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D1;

import java.lang.reflect.Array;

/**
 *
 * @author aaqib
 */
public class d1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int[] num=new int[5];
        int[] num;//at declaration size not provided
        num=new int[3];//size must provided at the time of creation
        
        //initialization
        num[0]=33;
        num[1]=8;
        num[2]=67;
        
        int []num2={12,45,65};//all 3 step in single step int[]num2=new int[]{66,9,7}
        
        for(int i=0;i<num2.length;i++){
            
            System.out.println(num2[i]);}
        
        
        for(int i:num){
            System.out.println(i);}
        
    }
    
    
}
