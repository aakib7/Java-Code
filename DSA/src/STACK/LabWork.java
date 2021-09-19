/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//frist lab stack
package STACK;

import java.util.Scanner;

/**
 *
 * @author aaqib  12-06-2020
 */
public class LabWork {
   
    
   public int[] reverse(int[] a,int max){
        int[] b= new int[max];
        int top=max;
        int e=0;
   
        
         for(int i=0;i<max;i++){
            e=a[top-1];
            top--;
            b[i]=e;

            
        }
        return b;
    }
    void print(int[] b){
        System.out.println("After reversing");
        for(int a:b){
            System.out.println(a+ " ");}
    }
    
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner s=new Scanner(System.in);
        LabWork lw=new LabWork();
        System.out.println("Enter a for reversing:");
        int [] a=new int[5];
        
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        
        lw.print(lw.reverse(a,a.length));
    }
}
