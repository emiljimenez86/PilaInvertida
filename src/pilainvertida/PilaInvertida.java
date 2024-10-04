
package pilainvertida;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Emil
 */
public class PilaInvertida {

    
    public static void main(String[] args) {
      Stack<Integer> pila1 = new Stack<>();
      
        for (int i = 0; i < 7; i++) {
            String input = JOptionPane.showInputDialog("Ingresa un número para la pila:");
            int numero = Integer.parseInt(input);  
            pila1.push(numero);
            }
        JOptionPane.showMessageDialog(null, "Primera pila: " + pila1);
        
        
        Stack<Integer> pila2 = new Stack<>();
        
     
        while (!pila1.isEmpty()) {
            pila2.push(pila1.pop());
        }
        
       
        JOptionPane.showMessageDialog(null, "Segunda pila (orden inverso): " + pila2);
    }
    
}
