/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8b;

/**
 *
 * @author aaqib
 */
public class PieceWorker extends Employee {
    private double wage;
    private int piece;

    public PieceWorker(double wage, int piece, String frisrName, String lastName, String SSN, Date DOB) {
        super(frisrName, lastName, SSN, DOB);
        this.wage = wage;
        this.piece = piece;
    }
    
    

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
         if (wage < 0.0){
           throw new IllegalArgumentException("wage should be >= 0.0");}
        this.wage = wage;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        if (piece < 0.0){
           throw new IllegalArgumentException("Piece should be >= 0.0");}
        this.piece = piece;
    }
    
    @Override
    public double earnings(){
        return getWage()*getPiece();
}

    @Override
    public String toString() {
        return "PieceWorker{" + "wage=" + wage + ", piece=" + piece + super.toString()+'}';
    }
    
    
}
