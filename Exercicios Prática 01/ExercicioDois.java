//PRATICA 01- Exercicio 2)
import javax.swing.JOptionPane;
public class ExercicioDois {
           
           public static void main(String[] args) { 

        //Leitura do Numero
         
         String numero = JOptionPane.showInputDialog("Digite um numero inteiro");

         //Conversão Para Inteiro 
         int numeroInteiro  = Integer.parseInt(numero);
         
         //Saída 

         JOptionPane.showMessageDialog(null, "O valor do numero digitado é: " + numeroInteiro);
         

           }
          }  
 