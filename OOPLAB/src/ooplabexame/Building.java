/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplabexame;

/**
 *
 * @author aaqib
 */import java.util.*;
public class Building {
    private String houseNumber;
     private boolean iaPaid;
    private int billingMonth;
    public String resName;
    public String houseType;

    public Building(String houseNumber, boolean iaPaid, int billingMonth, String resName, String houseType) {
        this.houseNumber = houseNumber;
        this.iaPaid = iaPaid;
        this.billingMonth = billingMonth;
        this.resName = resName;
        this.houseType = houseType;
    }

    public Building() {
    }
    

    
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public boolean isIaPaid() {
        return iaPaid;
    }

    public void setIaPaid(boolean iaPaid) {
        this.iaPaid = iaPaid;
    }

    public int getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(int billingMonth) {
        this.billingMonth = billingMonth;
    }
    
    public Building input(){
    return null;}
    
    public double calculateTotleBill(int month){
    return 0;}
    
    public void saveInformation(Building b){
    }
    public void searchInformation(String houseNumber){}
}
