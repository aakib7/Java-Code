/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class AlreadyExistException extends Exception {

    public AlreadyExistException() {
    }

    public AlreadyExistException(String message) {
        super(message);
    }
    public void getMesssage(){
        System.out.println("Already Exist:");
    }
    
}
