/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTTraversal;
import java.util.Stack;

/**
 *
 * @author aaqib
 */
public class Traversal {
    
    public Node newNode(int value){
      Node newNode=new Node(value);
    return newNode; }
    
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
    
    public void inorder(Node root){ 
        if (root == null) 
            return; 
    Stack<Node> stack = new Stack<Node>(); 
    Node current = root; 
    while (current != null || !(stack.isEmpty()) )  { 
         while (current !=  null){ 
            stack.push(current); 
            current = current.left;}            
            
    current = stack.pop(); 
    System.out.print(current.data + " "); 
    current = current.right;} 
    
  } 
    
    public void Preorder(Node root) { 
       
        if (root == null) { 
            return; } 
       Stack<Node> stack = new Stack<Node>(); 
       stack.push(root); 
  
    while (stack.empty() == false) { 
        
        Node current = stack.peek(); 
        System.out.print(current.data + " "); 
        stack.pop(); 
        if (current.right != null) { 
            stack.push(current.right);} 
        if (current.left != null) { 
            stack.push(current.left);} 
        } }
   

    
    public void postOrder(Node root){ //LRN
       Stack<Node> s1 = new Stack<Node>(); 
       Stack<Node> s2 = new Stack<Node>(); 
  
        if (root == null) {
            return; }
        s1.push(root); 
   
    while (!s1.isEmpty()) { 
        Node temp = s1.pop(); 
        s2.push(temp); 
        if (temp.left != null) {
            s1.push(temp.left); }
        if (temp.right != null){ 
            s1.push(temp.right); }
        } 
    while (!s2.isEmpty()) { 
        Node temp = s2.pop(); 
       System.out.print(temp.data + " "); 
        } 
    } 
   
  
  }
