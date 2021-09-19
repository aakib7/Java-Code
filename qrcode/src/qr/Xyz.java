///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package qr;
//
///**
// *
// * @author aaqib
// */
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.WriterException;
//import com.google.zxing.common.BitMatrix;
//import com.google.zxing.qrcode.QRCodeWriter;
//import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
//import java.awt.Color;
//import java.awt.Graphics2D;
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import net.glxn.qrgen.QRCode;
//import net.glxn.qrgen.image.ImageType;
//import java.io.File;
//import java.io.IOException;
//import java.awt.image.BufferedImage;
//import java.util.Hashtable;
//import javax.imageio.ImageIO;
//
//public class Qr {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws WriterException, IOException  {
//        
//                
//        
//          String qrCodeText="https://goo.gl/maps/FKSGscE3GvAWk8TM8";
//       
//  String filePath = "/Users/aaqib/Desktop/untitled folder//office.jpg";
//  int size = 125;
//  String fileType = "png";
//       
//  File qrFile = new File(filePath);
//  createQRImage(qrFile, qrCodeText, size, fileType);
//  System.out.println("Done");
// 
// 
// 
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//  
////        File f1 =new File("/Users/aaqib/Desktop/New Folder With Items//aqib12.png");
////        String details="Name = Aaqib javed   Roll no:sp19-bse-087";
////        ByteArrayOutputStream out= QRCode.from(details).to(ImageType.JPG).stream();
////        FileOutputStream fos=new FileOutputStream(f1);
////        fos.write(out.toByteArray());
////        fos.close();
////        System.out.println("Sussess");
////        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        // TODO code application logic here
////        String details="aaqib javed mehdi 123";
////        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
////        File file=new File("/Users/aaqib/Documents/Study//QRRR.jpg");
////        FileOutputStream fos=new FileOutputStream(file);
////        fos.write(out.toByteArray());
////        fos.flush();
//    }
//    
//    private static void createQRImage(File qrFile, String qrCodeText, int size,
//   String fileType) throws WriterException, IOException {
//  // Create the ByteMatrix for the QR-Code that encodes the given String
//  Hashtable hintMap = new Hashtable();
//  hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//  QRCodeWriter qrCodeWriter = new QRCodeWriter();
//  BitMatrix byteMatrix = qrCodeWriter.encode(qrCodeText,
//    BarcodeFormat.QR_CODE, size, size, hintMap);
//  // Make the BufferedImage that are to hold the QRCode
//  int matrixWidth = byteMatrix.getWidth();
//  BufferedImage image = new BufferedImage(matrixWidth, matrixWidth,
//    BufferedImage.TYPE_INT_RGB);
//  image.createGraphics();
// 
//  Graphics2D graphics = (Graphics2D) image.getGraphics();
//  graphics.setColor(Color.WHITE);
//  graphics.fillRect(0, 0, matrixWidth, matrixWidth);
//  // Paint and save the image using the ByteMatrix
//  graphics.setColor(Color.BLACK);
// 
//  for (int i = 0; i < matrixWidth; i++) {
//   for (int j = 0; j < matrixWidth; j++) {
//    if (byteMatrix.get(i, j)) {
//     graphics.fillRect(i, j, 1, 1);
//    }
//   }
//  }
//  ImageIO.write(image, fileType, qrFile);}
//    
//}
//
//
////public class MyImage{
////  public static void main(String args[])throws IOException{
////    int width = 963;    //width of the image
////    int height = 640;   //height of the image
////    BufferedImage image = null;
////    File f = null;
////
////    //read image
////    try{
////      f = new File("D:\\Image\\Taj.jpg"); //image file path
////      image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
////      image = ImageIO.read(f);
////      System.out.println("Reading complete.");
////    }catch(IOException e){
////      System.out.println("Error: "+e);
////    }
////  }
////}
//
//
//
////    BufferedImage image = null;
////    File f = null;
////
////    //read image file
////    try{
////      f = new File("/Users/aaqib/Desktop/B612_20181125_041121_091.jpeg");
////      image = ImageIO.read(f);
////    }catch(IOException e){
////      System.out.println("Error: "+e);
////    }
////
////    //write image
////    try{
////      f = new File("/Users/aaqib/Desktop/untitled folder//aq.jpeg");
////      ImageIO.write(image, "jpg", f);
////    }catch(IOException e){
////      System.out.println("Error: "+e);}