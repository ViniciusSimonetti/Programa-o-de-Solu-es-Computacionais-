//PRATICA 01/PARTE 2 -- EXERCICIO 9) 

import javax.swing.JOptionPane;
public class ExercicioNove {
               public static void main(String [] args) { 
              // Obtendo o numero e base do usuario 
              String numeroS = JOptionPane.showInputDialog("Digite um numero:");
              String baseS   = JOptionPane.showInputDialog("Digite a base:");
             //.................................................................

                                         //Convertendo para double
                                          double numeroD = Double.parseDouble(numeroS);
                                          double baseD  = Double.parseDouble(baseS);
                                         //..........................................

              // Validando a base (deve ser maior que 0 e diferente de 1) -----> Deixa o programa mais interativo 
                if (baseD <= 0 || baseD == 1) {
                JOptionPane.showMessageDialog(null, "A base deve ser maior que zero e diferente de 1.");
                return;
                }
              //............................................................................................           
                                            //Calcular o logaritmo
                                            double logaritmo = Math.log(numeroD) / Math.log(baseD);
                                            //................................................................

                     // Mostrar o resultado
                     JOptionPane.showMessageDialog(null, "O logaritmo de " + numeroS + " na base " + baseS + " é: " + logaritmo);
                     }
                  }                                   
                //...................................................................................................................................                        





















