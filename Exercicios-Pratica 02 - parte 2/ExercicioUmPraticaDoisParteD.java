//PRATICA 02 parte 2 === exercicio 1)

import javax.swing.JOptionPane;

public class ExercicioUmPraticaDoisParteD {

                public static void main(String[] args) {
         try {
             //Pedindo os 3 lados do triangulo

              int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado:"));

              int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado:"));

              int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado:"));

            // Verificando as condições para formar um triângulo

            if (ladoA > 0 && ladoB > 0 && ladoC > 0 &&
                ladoA + ladoB > ladoC &&
                ladoA + ladoC > ladoB &&
                ladoB + ladoC > ladoA) {
                JOptionPane.showMessageDialog(null, "Os lados formam um triângulo.");
            } else {
                JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite apenas números inteiros positivos.");
        }
    }
}
