//EXERCICIO PRATICA 01/PARTE 2 -- EXERCICIO 8)
 
import javax.swing.JOptionPane; 

public class ExercicioOito {
               public static void main (String [] args) { 
               //Digitando um o numero
               String numeroS = JOptionPane.showInputDialog("Digite um numero:");
               
               //converter a entrada para um numero double 
               double numero = Double.parseDouble(numeroS);

               //Calcular o logaritmo na base 10
               double logaritmoS = Math.log10(numero);

               //Saída (Exibir o resultado)
               JOptionPane.showMessageDialog(null, "O logaritmo na base 10 de " + numero + " é: " + logaritmoS);
            }   
          }























