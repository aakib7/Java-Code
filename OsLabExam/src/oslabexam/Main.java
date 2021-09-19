/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslabexam;
import java.util.Scanner;
/**
 *
 * @author aaqib
 */

public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter the number of process");
    int pro=scan.nextInt();
    System.out.println("Enter the number of Available");
    int av=scan.nextInt();
    
    int processes[]=new int[pro];
    System.out.println("Enter process");
    for(int i=0;i<processes.length;i++)
  {
      System.out.print("process "+i+" =");
      processes[i]= scan.nextInt();
  }    
    int avail[]=new int[av];
    System.out.println("Enter avail");
    for(int i=0;i<avail.length;i++)
  {
       System.out.print("avail "+i+" =");
      avail[i]=scan.nextInt();
  }

  BankerAlgorithm b = new BankerAlgorithm();

System.out.println("enter the value of max");
int maxm[][]=new int[pro][av];
for(int i = 0 ; i < pro ; i++){
    for(int j = 0 ; j < av; j++){
        System.out.print("max ["+i+"]"+"["+j+"]=");
      maxm[i][j] =scan.nextInt();
}}
 
System.out.println("enter the value of allot");
int allot[][]=new int[pro][av];
for(int i = 0 ; i < pro ; i++){
    for(int j = 0 ; j < av; j++){
        System.out.print("allot ["+i+"]"+"["+j+"]=");
      allot[i][j] =scan.nextInt();
}}

  b.isSafe(pro,av,processes, avail, maxm, allot);
}
}