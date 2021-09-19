/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.project;

import java.util.logging.Logger;

/**
 *
 * @author malik Abdul Rehman
 */
public class Node {
   private int occur;
   private String word;
   private Node link;

    public Node() {
    }

    public int getOccur() {
        return occur;
    }

    public void setOccur(int occur) {
        this.occur = occur;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
    
    Node removeLastNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        if (head.getLink() == null) { 
            return null; 
        } 
  
        // Find the second last node 
        Node second_last = head; 
        while (second_last.getLink().getLink() != null) 
            second_last = second_last.getLink(); 
  
        // Change next of second last 
        second_last.setLink(null); 
  
        return head; 
    }  
}
