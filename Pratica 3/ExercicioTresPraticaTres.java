//PRATICA 3 == Exercicio 3
import javax.swing.JOptionPane;

public class ExercicioTresPraticaTres {
               public static void main(String[] args) {
                   int quantidadeNumeros = 0;
                   int soma = 0;
                   double media;

              //Loop para entrada de números
             for (int i = 1; ; i++) {
                  String entrada = JOptionPane.showInputDialog("Digite o " + i + "º número positivo (ou um número negativo para sair):");
                  int numero = Integer.parseInt(entrada);

            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }

                soma += numero;
                quantidadeNumeros++;
        }

          //Cálculo da média e exibição do resultado
            if (quantidadeNumeros > 0) {
                media = (double) soma / quantidadeNumeros;
            JOptionPane.showMessageDialog(null, "A média dos números positivos é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número positivo foi digitado.");
        }
    }
}