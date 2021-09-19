/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLinkList;

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
        Stack st=new Stack();
        st.push(23);
        st.push(231);
        st.push(232);
        st.push(233);
        st.Print();
      System.out.println(st.Peek());
       st.pop();
       System.out.println(st.Peek());
    }
    
}
