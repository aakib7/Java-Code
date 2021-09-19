/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Link;

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
        LinkList list=new LinkList();
//        
        
        list.insertAtStart(23);
        list.insertAtStart(8);
        list.insertAtStart(67);
        list.inserAtPos(12,1);
        list.insertAtlast(100);
        list.listView();
    }
    
}
