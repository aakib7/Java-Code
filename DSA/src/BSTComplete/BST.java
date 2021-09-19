//
//package BSTComplete;
//public class BST {
//    
//        
// public Node insert(Node node, int value){
//    if(node == null){
//        //System.out.println("Root:"+value);
//        return new Node(value);
//    }
//    
//    if(value < node.value){ // Move to the left if passed value is 
//       // System.out.println(value+"insert to left"+node.value);
//        node.left = insert(node.left, value);
//            }
//    
//       else if(value > node.value){// Move to the right if passed value is 
//       // System.out.println(value+"insert to right"+node.value);
//        node.right = insert(node.right, value);
//        
//    }
//    return node;
//}
//  
////  public void insertNewNode(int value){
////      Node node=new Node();
////      node.data=value;
////      node.left=null;
////      node.right=null;
////      
////  }
// 
// public void inorder(Node node){
//     if(node==null){
//         return;
//     }
//     inorder(node.left);
//     System.out.print(node.value+" ");
//     inorder(node.right);
//     
// }
// public void preOrder(Node node){
//     if(node==null){
//         return;
//     }
//     System.out.print(node.value+" ");
//     preOrder(node.left);
//     preOrder(node.right);}
// 
// public void postOrder(Node node){
//     if(node==null){
//         return;
//     }
//    postOrder(node.left);
//    postOrder(node.right);
//    System.out.print(node.value+" ");}
// 
//  public Node delete(Node node, int val) {
//    if(node == null) {
//      return node;
//    }
//    //case 1 @ 2
//    if(val < node.value) {
//      node.left = delete(node.left, val);
//    } else if(val > node.value) {
//      node.right = delete(node.right, val);
//    }
//    else {
//      if(node.left == null || node.right == null) {
//        Node temp = node.left == null ? node.right : node.left;//if left null then right else left
//
//        if(temp == null) {
//          return null;
//        } else {
//          return temp;
//        }
//      } else {
//        Node successor = getSuccessor(node);
//        node.value = successor.value;//copy
//        
//        node.right = delete(node.right, successor.value);
//        return node;
//      }
//    }
//    
//    return node;
//  }
//  
//  public Node getSuccessor(Node node) {//maximum of left child
//    if(node == null) {
//      return null;
//    }
//    
//    Node temp = node.right;
//    
//    while(temp.left != null) {
//      temp = temp.left;
//    }
//    
//    return temp;
//  }
//
//  
//  public int getDifferenceEvenOddLevel(Node node) {
//    if(node == null) {
//      return 0;
//    }
//    
//    return node.value - getDifferenceEvenOddLevel(node.left) - getDifferenceEvenOddLevel(node.right);
//  }
//  
//  public int getMax(Node node) {
//    if(node == null) {
//      System.out.println("Tree is Empty");
//      return -1;
//    }
//    
//    while(node.right != null) {
//      node = node.right;
//    }
//    
//    return node.value;
//  }
//  
//  public int getMin(Node node) {
//    if(node == null) {
//      System.out.println("Tree is Empty");
//      return -1;
//    }
//    
//    while(node.left != null) {
//      node = node.left;
//    }
//    
//    return node.value;
//  }
//  
//}