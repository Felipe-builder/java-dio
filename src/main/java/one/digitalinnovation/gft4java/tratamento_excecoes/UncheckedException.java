package one.digitalinnovation.gft4java.tratamento_excecoes;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLoop = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!" + e.getMessage());
//            e.printStackTrace();
            } catch (ArithmeticException e) {
//            e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível divir um numero por 0." + e.getMessage());
            } finally {
                System.out.println("chegou no finally");
            }
        } while(continueLoop);
        System.out.println("Chegou até aqui");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
