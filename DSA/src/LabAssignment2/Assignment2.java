/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabAssignment2;

import java.util.Scanner;

/**
 *
 * @author aaqib
 */
public class Assignment2 {
    
class Node {
   
        public Node left;
        public Node right;
        public char  value;
    public Node(char value) {
        this.value = value;
        right=null;
        left=null;}
    }

 
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        Assignment2 in=new Assignment2();
        System.out.println("Enter input 1:");
        String input1=scan.nextLine();
        System.out.println("Enter input 2:");
        String input2=scan.nextLine();
        
        in.output(input1,input2);
    }
    
    
    public void output(String input1,String input2) {
        
        char ch = getCharFromString(input1, 0);
        Node root =new Node(ch);
       
        System.out.print("Insertion with root ("+root.value+")");
       
    for(int i=1;i<input1.length();i++){
        
          char ch1 = getCharFromString(input1, i);
          insert(root, ch1 );}
  
        System.out.println("\n\nInOrder Before deletion");
        System.out.print("--->>");
        printInOrder(root);
        System.out.println("\nInorder After Deletion");
        System.out.print("--->>");
  for(int j=0;j<input2.length();j++){
        char ch1 = getCharFromString(input2, j);
        delete(root,ch1);
  }
  printInOrder(root);
        System.out.println("");
    }

    
    public void insert(Node node, char value) {
        
        if (value <= node.value) {
            if (node.left != null) {
                insert(node.left, value);
    } else {
        System.out.println("  Inserted " + value +   " to left of node " + node.value);
        node.left = new Node(value);
    }} 
    else if (value >= node.value) {
        if (node.right != null) {
            insert(node.right, value);
        } else {
                System.out.println("  Inserted " + value + "  to right of node " + node.value);
                node.right = new Node(value);}
    }
  }
    
 
   
    public char getCharFromString(String str, int index) { 
        return str.charAt(index);} 


    public Node delete(Node node,char val){
        if(node == null) {
            return node;}
    
        if(val < node.value) {
            node.left = delete(node.left, val);
        } 
        else if(val > node.value) {
            node.right = delete(node.right, val); }
    
        else {
            if(node.left == null || node.right == null) {
                 Node temp = node.left == null ? node.right : node.left;//if left null then right else left

            if(temp == null) {
                 return null;
        } else {
          return temp;
        }
        } else {
            Node successor = getSuccessor(node);
            node.value = successor.value;//copy
        
            node.right = delete(node.right, successor.value);
        return node;}
    }
    
    return node;
}
    public Node getSuccessor(Node node) {//maximum of left child
        if(node == null) {
        return null;}
        
        Node temp = node.right;
    
        while(temp.left != null) {
            temp = temp.left;}
    
        return temp;} 
    

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value+" ");
            printInOrder(node.right);}
  }

}