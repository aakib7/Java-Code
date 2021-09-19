/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Node {
    Node left;
    Node right;
    FramQueue framqueue;
    int Clip_No;

    public Node(FramQueue fq) {
        
        Fram f=new Fram();
        this.Clip_No = f.getFrame_No();
        this.framqueue=fq;
           }    
}
