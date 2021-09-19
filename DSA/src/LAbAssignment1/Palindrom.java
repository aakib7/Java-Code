/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAbAssignment1;

/**
 *
 * @author aaqib
 */



public class Palindrom {  
     
public void palindromChecking(String word){
     
      Method pal=new Method(word.length());
       boolean isPalindrome =false;
        
    if(word.length() == 1 || word.length() == 0){
          isPalindrome =true;
          System.out.println("Palindrom");
    //return isPalindrome;  //in case of boolean return type
    }
        
    else if(isPalindrome==false) {
     
        for (Character c : word.toCharArray()) {
             pal.enqueue(Character.toLowerCase(c));
             pal.push(Character.toLowerCase(c));
         } 
         
        for(int i=0;i<word.length();i++)  {
             isPalindrome=pal.pop()==pal.dequeue();
            }
        }
    if(isPalindrome){
          System.out.println("Pailandrom ");}
    else if(!isPalindrome){
        System.out.println("Not Pailandrom ");}
//    return isPalindrome; //in case of boolean return type
}}



class Method {//Stack and Queue
 
    int front, rear, size,top,max; 
    int capacity; 
    Character array[]; 
    Character array1[]; 
    
public Method(int capacity) { 
        this.capacity = capacity; 
        front = this.size = 0; 
        top = -1;
        rear = capacity - 1; 
        array = new Character[this.capacity]; 
        array1 = new Character[this.capacity]; 
    } 
  
public void enqueue(Character item)  { 
        this.rear = (this.rear + 1)% this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1;} 
  
public Character dequeue() { 
        Character item = this.array[this.front]; 
        this.front = (this.front + 1)% this.capacity; 
        this.size = this.size - 1; 
        return item; } 

public void push(Character x) { 
        array1[++top] = x;} 

public Character pop() { 
        Character x = array1[top]; 
        top--;
        return x;}   
} 

