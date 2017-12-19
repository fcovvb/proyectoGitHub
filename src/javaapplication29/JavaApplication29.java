package javaapplication29;
import java.util.Random;
//hola soy german
/**
 *
 * @author Duoc UC
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Random ran = new Random();
    public String starfrase(){
        return frases.frases[ran.nextInt(115)];
    }
    
}
