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
public class StringArrays {
    
    String[] names;
    String[] subject;
    String[] mrg;
    
    public StringArrays(){
        
         names=new String[]{"aaqib","javed","Mehdi"};
        
         System.out.println("OutPut:");
       for(String a: names){
           System.out.println(a);}
    
    }
    
    public StringArrays(int q){
        
        Scanner s=new Scanner(System.in);
   
        
        subject=new String[q];
        for (int i = 0; i < q; i++) {
           
            System.out.println("Enter name of " +(i+1)+ " Subject:");
             
            String sub=s.nextLine();
            subject[i]=sub;
    
            
        }
        System.out.println("OutPut:");
        for (int i = 0; i < q; i++) {
            System.out.println(subject[i]);
        }
        System.out.println("After murge:");
    }
    
    
//    public void concatinate(){
//        //int a=names.length+subject.length;
//        mrg=new String[names.length];
//        int k=0;
//        for (int i = 0; i < names.length; i++) {
//            
//            mrg[i]=names[i];
//            
//        }
//       
////        for (int j = 0; j <subject.length; j++) {
////            mrg[k]=subject[j];
////            k++;
////        }
////        
//        for(String d:mrg){
//            System.out.println(d);}
//  }
}
