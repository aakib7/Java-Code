/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

public class StringInsert {
    
    public Node newNode(String item){   
     Node newNode=new Node(item);
    return newNode;
    }
    public Node insert(Node root,String item){
        Node newNode=newNode(item);
        if(root==null){
        root=newNode;System.out.println("Insert at root");
        return root;}
        
     Node current=root;
     Node parent;
     while(true){
        parent=current;
        
     if(item.length()<current.name.length()){
        current=current.right;System.out.println("right");
        if(current==null){
             parent.right=newNode;
             return parent.right;}}
    else{
          current=current.left;System.out.println("left");
        if(current==null){
            parent.left=newNode;
            return parent.left;}
    }}}
    
    public Node search(Node root,String value){
    if(root==null){ return root;}
    Node current=root;
     while(value!=current.name){
         
    if(value.length()>current.name.length()){
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
