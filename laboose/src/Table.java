/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Table implements Wood{
    
    private String size;

    @Override
    public String getSize() {
        return size;
    }
 public void setSize(String size) {
        this.size = size;
    }
     
    @Override
    public void build(){
        System.out.println("Table are built size="+getSize());
    }

   
}
