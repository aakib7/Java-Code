/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class WoodMaker {
    
    private Wood table=null;
    private Wood chair=null;
    private Wood labDesk=null;
    
    public void WoodMaker(){
        table=new Table();
        chair=new Chair();
        labDesk=new LabDesk();
    }
    
    public void tableBuilt(){
        table.setSize("40cm");
      table.build();
   }
   public void chairBuilt(){
       chair.setSize("30cm");
      chair.build();
   }
   public void labDeskBuilt(){
       labDesk.setSize("20cm");
      labDesk.build();
   }
    
    
    
}



