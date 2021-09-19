/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

/**
 *
 * @author aaqib
 */
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import javax.imageio.ImageIO;

public class Qr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws WriterException, IOException  {
        
                
        
          
 
 
        
        
        
        
        
        
        
        
        
        
        
  
        File f1 =new File("/Users/aaqib/Desktop/New Folder With Items//link.png");
        String details="https://goo.gl/maps/FKSGscE3GvAWk8TM8";
        ByteArrayOutputStream out= QRCode.from(details).to(ImageType.JPG).stream();
        FileOutputStream fos=new FileOutputStream(f1);
        fos.write(out.toByteArray());
        fos.close();
        System.out.println("Sussess");
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
//        String details="aaqib javed mehdi 123";
//        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
//        File file=new File("/Users/aaqib/Documents/Study//QRRR.jpg");
//        FileOutputStream fos=new FileOutputStream(file);
//        fos.write(out.toByteArray());
//        fos.flush();
    }
    
   
    
}


