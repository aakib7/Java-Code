/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

/**
 *
 * @author aaqib
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinlList list=new LinlList();
        
      list.addFrist(132);
         list.addFrist(122);
         list.addFrist(12333);
            list.addLast(324);
       list.addLast(12);
       list.addLast(232222);
     //list.removeFrist();
//      System.out.println(list.findIndex(12333));
//      System.out.println(list.findIndex(12));
//      System.out.println(list.contain(122));
      list.print();
    }
    
}
