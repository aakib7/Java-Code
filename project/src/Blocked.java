/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Blocked extends Exception {

    public Blocked() {
    }

    public Blocked(String message) {
        super(message);
    }
    
    public void message(){
        System.out.println("Blocked:");}
}
