package exceptions;

import javax.swing.JOptionPane;

public class UnchekedException {
    public static void main(String[] args) {
        boolean continuarLoop = true;

        while(continuarLoop) {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {                                   
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println(resultado);
                continuarLoop = false;
    
            } catch(NumberFormatException e) {      
                // e.printStackTrace();
                // JOptionPane.showMessageDialog(null, e.getMessage());
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro.");
    
            } catch(ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por zero.");
    
            } finally {                             
                System.out.println("Chegou no finally");
            }
        }

        

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
