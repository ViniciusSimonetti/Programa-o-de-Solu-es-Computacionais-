//PRATICA 01/PARTE 2 --- EXERCICIO 4)

import javax.swing.JOptionPane;

public class ExercicioQuatro {
                 public static void main (String [] args) {
                 //Lendo as 3 strings
                     String string1 = JOptionPane.showInputDialog ("Digite a primeira String");

                    String string2 = JOptionPane.showInputDialog ("Digite a segunda String");

                    String string3 = JOptionPane.showInputDialog ("Digite a terceira String");
                    
                //Calcular o comprimento de cada String (ou quantidade de letras)
                    int comprimento1 = string1.length();

                    int comprimento2 = string1.length();

                    int comprimento3 = string1.length();

                 //Calcular a soma do comprimento
                    
                    int SomaC = comprimento1 + comprimento2 + comprimento3;
                    
                 //Saida (Resultado)
                     javax.swing.JOptionPane.showMessageDialog(null, "A soma dos comprimentos das String é: " + SomaC);
                    }     
                } 























