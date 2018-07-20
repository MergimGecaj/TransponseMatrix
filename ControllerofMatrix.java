import javax.swing.*;
public class ControllerofMatrix
{ public static void main(String[] args) 
 { ViewofMatrix m = new ViewofMatrix();
  Matrica first = new Matrica(m.getRows(),m.getColumns());
 
  first.read();
  System.out.println("Matrica: "); 
  first.print();
  first.transpose(); 
  
  System.out.println("Matrica e transponuar: "); 
  first.print(); 
  
  System.out.println("Elementet e rreshtave te matrices se transponuar:");
  first.print1();

 
   } 
   
   }
