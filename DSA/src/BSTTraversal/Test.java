/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTTraversal;

/**
 *
 * @author aaqib
 */
public class Test {
 public static void main(String[] args) {
     Traversal t=new Traversal();
    Node root=null;
    root=t.insert(root,10);
    t.insert(root,20);
    t.insert(root,3);
    t.insert(root,4);
    t.insert(root,50);
    t.insert(root,6);
    t.insert(root,7);
    t.insert(root,22);
    
    System.out.println("\ninorder tree: ");
    t.inorder(root); 
    
    System.out.println("\npreorder tree: ");
    t.Preorder(root);
    
    System.out.println("postorder tree: ");  
    t.postOrder(root);
    
    
    
    }
}
//   