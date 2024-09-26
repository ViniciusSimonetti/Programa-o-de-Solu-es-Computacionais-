//PRATICA 3 == Exercicio 6)

import javax.swing.JOptionPane;

public class ExercicioSeisPraticaTres {
                 public static void main(String[] args) {
                      String input;
                      int numero;

               for (;;) {
               input = JOptionPane.showInputDialog("Digite um número (digite -999 para parar):");
               numero = Integer.parseInt(input);

                     if (numero != -999) {
                           if (numero >= 0) {
                               double raizQuadrada = Math.sqrt(numero);
                               double inverso = 1.0 / numero;
                               JOptionPane.showMessageDialog(null, "Número: " + numero + "\n" +
                                                                                   "Raiz quadrada: " + raizQuadrada + "\n" +
                                                                                    "Inverso: " + inverso);
                } else {
                    JOptionPane.showMessageDialog(null, "Número inválido (deve ser não negativo).");
                }
            } else {
                break;
            }
        }
    }
}