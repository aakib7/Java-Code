/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Task-1");
        Fram fram=new Fram(1,"Aqib");
        Fram fram1=new Fram(2,"Javed");    
        Fram fram2=new Fram(3,"Ali");
        Fram fram3=new Fram(4,"Hamza");        
        Fram fram4=new Fram(5,"Sir");
        Fram fram5=new Fram(6,"Farhan");        
        Fram fram6=new Fram(7,"abc");
        Fram fram7=new Fram(8,"hello");        
        Fram fram8=new Fram(9,"hy");
        Fram fram9=new Fram(10,"the end");        
        FramQueue f=new FramQueue(10);
        f.enQueue(fram);
        f.enQueue(fram1);
        f.enQueue(fram2);
        f.enQueue(fram3);
        f.enQueue(fram4);
        f.enQueue(fram5);
        f.enQueue(fram6);
        f.enQueue(fram7);
        f.enQueue(fram8);
        f.enQueue(fram9);
        System.out.println(f.toString());
        
        
//        System.out.println("Task-2");
//        
//        Fram framt=new Fram(1,"Aqib");
//        FramQueue ff=new FramQueue(1);
//        ff.enQueue(framt);
//        ClipTree cp=new ClipTree();
//        Node n=new Node(ff);
        
       
        
        

    }
    
}
