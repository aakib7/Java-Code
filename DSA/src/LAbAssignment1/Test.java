/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAbAssignment1;
/**
 *
 * @author aaqib
 */
import java.util.*;
import java.io.*;
public class Test {
  public static void main(String[] args){
        
         Palindrom p=new Palindrom();
         
        p.palindromChecking("awe");
         p.palindromChecking("aa");
         p.palindromChecking("aaa");
         p.palindromChecking("aaswe3");
         p.palindromChecking("hello");
         p.palindromChecking("abba");
         p.palindromChecking("m,ad,am");
         p.palindromChecking("Taco cat");
         p.palindromChecking("madam, i'm adam");
         p.palindromChecking("");
        
         
    }     
}
