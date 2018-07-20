import javax.swing.*;
public class Matrica 
{ private int rows; 
   private int columns; 
   private char[][] data; 
   public Matrica(int row, int column) 
   { rows = row; 
      columns = column;
      data = new  char[rows][columns]; 
      rows = data.length;
      columns = data[0].length; }
   
   public void read() 
   {char a = 'x';
      char c ;
      if (rows != columns)
      {JOptionPane.showMessageDialog(null,"Gabim ne hyrje:Matrica nuk eshte katrore");
         System.exit(0);}
      String input = JOptionPane.showInputDialog("Shkruaj elementet e matrices:");
   
      int n = input.length();
      int k =0;
      int r = rows*columns;
   
     
      for (int i = 0; i <rows; i++) 
      { 
         for (int j = 0; j < columns; j++) 
         { 
            if(k<n)
            {c = input.charAt(k);
               data[i][j] = c; }
            else if (k>=n)
            {data[i][j] = a;}
            else { System.out.println("error"); }
            k++; } 
      
      
      }
   
      
   }
    
 
   public void transpose() 
   {  char[][] temp = new  char[columns][rows]; 
      for (int i = 0; i < rows; i++) 
      { 
         for (int j = 0; j < columns; j++) 
         { temp[j][i] = data[i][j]; 
         } 
      } 
      data = temp; } 
   
   public void print() 
   { 
      for (int i = 0; i < rows; i++) 
      { 
         for (int j = 0; j < columns; j++) 
         { System.out.print(data[i][j] + "    "); } 
         System.out.println();
      }
   } 
   
   public void print1()
   {
      for (int i =0;i<rows;i++)
      {
         for (int j=0;j<columns;j++)
         {System.out.print(data[i][j]+"");}
         System.out.print(",");
         
      }
         
   }


}
     

