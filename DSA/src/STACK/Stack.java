/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK;

import java.util.*;
public class Stack {
    Scanner scan=new Scanner(System.in);
    int max;
    int[] stack;
    int top=-1;
    
    public Stack(){
        System.out.println("Enter maximum size");
        int max=scan.nextInt();
         stack=new int[max];}
    
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    
    
     public void push(int data) {
      stack[++top]=data;

}
     public int pop(){
         if(isEmpty()){
             System.out.println("stack is empty is no pop:");
             return -1;
         }
         else{
         int e;
         e=stack[top];
         top--;
         return e;}
         
     }
     public void print(){
         
     if(isEmpty()){
             System.out.println("No element is present in stack:");  
         }
       
     else{
      System.out.println("stack Elements:");
     for(int i=top;i>=0;i--){
         System.out.println(stack[i]+" ");}
     }
     }
     
     public void deleteNumber(int num){
    int top2=0;
    int n=0;
    int[] tempStack=new int[max];
    boolean flag=false;
    
     while(!isEmpty()){
      n=pop();
     if(n==num){
         flag=true;
         break;
     }
     else{
     tempStack[top2++]=n;}}
     
     while(top>0){
         push(tempStack[top2--]);
     }
     if(flag==false){
         System.out.println("not found:");}
     else {
         System.out.println("Number deleted:");
     }
     
     }
     
   
     
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Stack s=new Stack();
        
        while(true){
            System.out.println("");
            System.out.println("1-->push\n2-->pop\n3-->print\n4-->exit\n5-->foe del a num:");
            int ch=scan.nextInt();
            switch(ch){
                case 1:{
            System.out.println("Enter a num:");
            int num=scan.nextInt();
            s.push(num);
            break;}
                case 2:{
            s.pop();
            break;}
                case 3:{
           
            s.print();
                    System.out.println("");
            break;}
                case 4:{
            System.exit(0);
            break;}
                case 5:{
                     System.out.println("emter a num for del:");
           int a=scan.nextInt();
           s.deleteNumber(a);
            break;}
            }
        }
        }
    }
    

