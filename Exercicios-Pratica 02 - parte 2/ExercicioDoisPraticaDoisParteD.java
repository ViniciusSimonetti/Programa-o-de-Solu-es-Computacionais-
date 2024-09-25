//PRATICA 02 parte 2 === exercicio 2)

import javax.swing.JOptionPane;

public class ExercicioDoisPraticaDoisParteD {
                   public static void main(String[] args) {
        try {
                     //Entrada dos lados do triângulo
                    int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado:"));
                    int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado:"));
                    int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado:"));

                //Verificando se forma um triângulo
                 if (ladoA > 0 && ladoB > 0 && ladoC > 0 &&
                     ladoA + ladoB > ladoC &&
                     ladoA + ladoC > ladoB &&
                     ladoB + ladoC > ladoA) {
                // Classificando  o triângulo
                if (ladoA == ladoB && ladoB == ladoC) {
                    JOptionPane.showMessageDialog(null, "O triângulo é equilátero.");
                } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                    JOptionPane.showMessageDialog(null, "O triângulo é isósceles.");
                } else {
                    JOptionPane.showMessageDialog(null, "O triângulo é escaleno.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite apenas números inteiros positivos.");
        }
    }
}