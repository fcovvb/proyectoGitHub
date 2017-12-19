package javaapplication29;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//hola soy german
/**
 *
 * @author Duoc UC
 */
public class JavaApplication29 {
 
    public static void main(String[] args) {
      NewJFrame frame = new NewJFrame();
      try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           SwingUtilities.updateComponentTreeUI(frame);
           frame.setTitle("StarFrase");
        } catch (UnsupportedLookAndFeelException ex) {}
         catch (ClassNotFoundException ex) {}
         catch (InstantiationException ex) {}
         catch (IllegalAccessException ex) {}
       
      frame.setVisible(true);
    }
   
}
