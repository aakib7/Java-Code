/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTComplete;

/**
 *
 * @author aaqib
 */
public class Node {
    char ch;
      int value;
      Node left;
      Node right;
    
       Node(int k){
        value=k;
        left=null;
         right=null;}
       Node(char k){
        ch=k;
        left=null;
         right=null;}
}
