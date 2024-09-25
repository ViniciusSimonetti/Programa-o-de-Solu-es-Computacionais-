//PRATICA 02 == Exercicio 24) ======> ESTUDAR ESSE EXERCICIO POR COMPLETO (Muitas duvidas)

import javax.swing.JOptionPane;

public class ExercicioVinteQuatroPraticaDois {
          public static void main(String[] args) {
                int[] numeros = new int[5];

             //Lendo os números

               for (int i = 0; i < numeros.length; i++) {

               String valor = JOptionPane.showInputDialog("Digite o " + (i+1) + "º número:");
                numeros[i] = Integer.parseInt(valor);
        }

                  // Encontrando o maior e menor
                  int maior = numeros[0];

                  int menor = numeros[0];

                  for (int i = 1; i < numeros.length; i++) {

                  if (numeros[i] > maior) {
                      maior = numeros[i];
                }  
                if (numeros[i] < menor) {
                    menor = numeros[i];
               }
            }

              //Exibindo os resultados
              JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}
