/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
package ComplexNumber;
public class Complex {
    
        private final double re; 
         private final double im;
         
      public Complex(double real, double imag){
    re = real;im = imag; }
      
        public String toString() {
            if (im == 0) return re + "";
            if (re == 0) return im + "i";
                    if (im < 0) return re + " - " + (-im) + "i";
                    return re + " + " + im + "i";}
        
      public double abs() { 
          return Math.hypot(re, im); } 
// Math.sqrt(re*re+ im*im)
      public double phase() { 
          return Math.atan2(im, re); } 
      
           public Complex plus(Complex b) {
               Complex a = this; 
double real = a.re + b.re;double imag = a.im + b.im;
     return new Complex(real, imag);}
           
 
           public Complex minus(Complex b) {
               Complex a = this;double real = a.re - b.re;
               double imag = a.im - b.im;return new Complex(real, imag);
           }
   
    }