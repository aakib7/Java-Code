/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLinkList;

/**
 *
 * @author aaqib
 */
public class Stack <t>{
    
    int length;
    Node top;
    
    public Stack(){
    top=null;
    length=0;
    }
    
    public boolean isEmpty(){
    return length<=0;}
    
    public int length(){
    return length;}
    
    public void push(int data){
    Node temp=new Node(data);
    temp.next=top;
    top=temp;
    length++;}
  
    public int pop(){
        if(isEmpty()){
            System.out.println("Empty:");
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    
    public int Peek(){
        if(isEmpty()){System.out.println("Empty stack");}
        return top.data;
    }
   public void Print(){
    Node current;
    current=top;
    while(current!=null){
        System.out.print(current.data+" -> ");
    current=current.next;}
        System.out.println(current);}
}
