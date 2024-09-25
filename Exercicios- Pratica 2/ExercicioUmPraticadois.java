//PRATICA 02 -- Exercicio 1

import javax.swing.JOptionPane;

public class ExercicioUmPdois {
                     public static void main(String[] args) {
                      int numero1, numero2, soma;

                      
                         //Perguntando numero para o usuario
                         String numero1Str = JOptionPane.showInputDialog("Digite o primeiro numero");
                     String numero2Str= JOptionPane.showInputDialog("Digite o segundo numero"); 

                     //Transformando os numeros em inteiro 
                     numero1 = Integer.parseInt(numero1Str);
                     numero2 = Integer.parseInt(numero2Str);
                     
                     //Calculando os numeros 
                     soma = numero1 + numero2;

                     //Caso o resultado seja 10
                     if (soma > 10) { 
                          JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
                     }     
                    } 
}    
              

                    