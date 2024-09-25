//PRATICA 02 parte 2 == Exercicio 5)

import javax.swing.JOptionPane;

public class ExercicioCincoPraticaDoisParteD {
                   public static void main(String[] args) {
                    //pedindo os numeros para o usuario 
                    String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");

                    String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

                    String num3Str = JOptionPane.showInputDialog("Digite o terceiro número:");
            
                    // Converter as strings para números inteiros
                    int num1 = Integer.parseInt(num1Str);

                    int num2 = Integer.parseInt(num2Str);

                    int num3 = Integer.parseInt(num3Str);
            
                    // Lógica de ordenação (usando if-else encadeados)
                    int maior, intermediario, menor;
            
                    // Encontrar o maior número
                    maior = Math.max(num1, Math.max(num2, num3));
            
                    // Encontrar o menor número
                    menor = Math.min(num1, Math.min(num2, num3));
            
                    // O número restante é o intermediário
                    intermediario = num1 + num2 + num3 - maior - menor;
            
                    //Exibindo os resultados
                    JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor);
                }
            }