/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.project;

import java.io.IOException;

/**
 *
 * @author malik Abdul Rehman
 */
public class Main {

    /**
         * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
   Check c=new Check();
   c.achievingfile(c.filenames);
c.insertioninlinkedlist();
//c.printingtroughlinkedlist();
//        System.out.println("\n===================");
            c.topWords();
c.printingtroughlinkedlist();
    c.deletenode();
    c.printingtroughlinkedlist();
c.searchfile();
}}
