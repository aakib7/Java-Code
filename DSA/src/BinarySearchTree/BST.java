/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author aaqib
 */
public class BST {
    
    public Node newNode(int value){
     Node newNode=new Node(value);
    return newNode;
    }
    
    public Node insert(Node root,int value){
        Node newNode=newNode(value);//method call 
        
    if(root==null){
        root=newNode;
        return root;}
        
     Node current=root;
     Node parent;
     while(true){
        parent=current;
     if(value<current.data){
        current=current.left;
        if(current==null){
             parent.left=newNode;
             return parent.left;}
        }
    else{
        current=current.right;
        if(current==null){
            parent.right=newNode;
            return parent.right;}
    }}}
    
    public Node search(Node root,int value){
    if(root==null){ return root;}
    Node current=root;
     while(value!=current.data){
         
    if(value<current.data){
        current=current.left;}
    else {
         current=current.right;}
    if(current==null){
        System.out.println("Value not founded");
        return current;
    }
     }
        System.out.println("value founded");
    return current;
    }
   
   
}
