//PRATICA 01/parte 2 -- EXERCICIO 13)

import javax.swing.JOptionPane;

public class ExercicioTreze {
                     public static void main(String [] args) { 
                        //Obtendo os valores de  a , b , c 
                        String aString = JOptionPane.showInputDialog( "Digite o valor de A");

                        String bString = JOptionPane.showInputDialog("Digite o valor de B");
                     
                        String cString = JOptionPane.showInputDialog("Digite o valor de C") ;

                         //Convertendo para numeros reais ----> (Double)
                        
                         double a = Double.parseDouble(aString);
                         double b = Double.parseDouble(bString);
                         double c = Double.parseDouble(cString);

                         //Calculando ultilizando a fórmula passada no enunciado
                        

                          double x = 2 * ((a - c) / 8) - b * 5;
                          

                         // Exibir o resultado
                          JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + x);

                         }


                }

























