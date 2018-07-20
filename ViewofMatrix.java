import javax.swing.*;
public class ViewofMatrix


{  
   public int getRows()
   { int rows = new Integer(JOptionPane.showInputDialog("Shkruaj numrin e rreshtave:")).intValue();
      return rows; }
 
 
 
   public int getColumns()
   { int columns = new Integer(JOptionPane.showInputDialog("Shkruaj numrin e kolonave(te njejte me numrin e rreshtave):")).intValue();
      return  columns; 
   }
      
}
