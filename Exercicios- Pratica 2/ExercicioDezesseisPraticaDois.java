//PRATICA 02 == EXERCICIO 16)
import javax.swing.JOptionPane;

public class ExercicioDezesseisPraticaDois {
               public static void main(String[] args)  {
                //Obtendo os numeros do usuario 
             String numero1Str = JOptionPane.showInputDialog("Digite o primeiro numero"); 
             String numero2Str = JOptionPane.showInputDialog("Digite o segundo numero");   
        
             //Transformando em Int
             int numero1 = Integer.parseInt(numero1Str);
             int numero2 = Integer.parseInt(numero2Str);

            //Comparando os numeros 
            if (numero1 == numero2) {
                JOptionPane.showMessageDialog(null, "Os numeros são iguais ");
            } else { 
                   //se o numero por diferente 
               JOptionPane.showMessageDialog(null, "Os numeros são diferentes");                     
            }   
    }

}
