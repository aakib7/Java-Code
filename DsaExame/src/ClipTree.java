/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class ClipTree {
    
    
    public Node insert(Node root,FramQueue fq){
        if(root == null){
            return new Node(fq);
    }
    
    if(fq.deQueue().getFrame_No() < root.Clip_No){  
       
        root.left = insert(root.left, fq);
            }
    
       else if(fq.deQueue().getFrame_No() > root.Clip_No){ 
       
        root.right = insert(root.right, fq);
        
    }
    return root;
}
    
    public void inorder(Node node){
     if(node==null){
         return;
     }
     inorder(node.left);
     System.out.print(node.framqueue+" ");
     inorder(node.right);
     
 }
    public Node getFrame(Node node) {
    if(node == null) {
      System.out.println("Tree is Empty");
      return null;
    }
    
    while(node.left != null) {
      node = node.left;
    }
    
    return node;
  }
    }
    

