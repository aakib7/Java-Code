/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author aaqib
 */
import java.util.*;
public class Arrays2d {
    Scanner scan=new Scanner(System.in);
    
    String [][] no=new String[][]{{"aaqib","javed"},{"123","3"}};
    int[][] s;
    
    public void Input(){
        System.out.println("Enter no. of student:");
        int id=scan.nextInt();
        System.out.println("Enter no. of subject:");
        int num=scan.nextInt();
        s=new int[id][num];
        //System.out.println("Enter name of ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println("Enter id of Student: "+i);
                int r=scan.nextInt();
                s[i][j]=r;
                
            }
            
        }
        
        for (int i = 0; i <s.length; i++) {
            
            for(int j=0;j<s[i].length;j++){
                System.out.println(s[i][j]);}
    }
    }
    public void call(){
        for (int i = 0; i <no.length; i++) {
            
            for(int j=0;j<no[i].length;j++){
                System.out.println(no[i][j]);}
            
        }
        
    }
    
    public void Inhance(){
    for (String []arr:no){
        for (String ar: arr) {
            System.out.println(ar);
            
        }
        System.out.println("");
}}
    
    public static void main(String[] args){
    
    Arrays2d arr=new Arrays2d();
    
               arr.Input();
    }
    
}

//public void Inhance(){
//    for (int [][]arr:no){
//        for (int[] ar: arr) {
//            for(int ae:ar){
//            System.out.print(ae);
//                System.out.print("\n");}
//            
//            
//        }

//int [][][] no=new int[][][]{
//              {
//               {1, -2, 3}, 
//               {2, 3, 4}
//              }, 
//              { 
//               {-4, -5, 6, 9}, 
//               {1}, 
//               {2, 3}
//              } 
//};
// 