/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Chair implements Wood{
   private String size;

    @Override
    public String getSize() {
        return size;
    }
   @Override
 public void setSize(String size) {
        this.size = size;
    }
     
    @Override
    public void build(){
        System.out.println("chairs are built size="+getSize());
    }
}
