//PRATICA 02 == EXERCICIO 17) 

import javax.swing.JOptionPane;

public class ExercicioDezesetePraticaDois {
               public static void main(String[] args)  {
               //Entrada dos 2 numeros
               String numero1String = JOptionPane.showInputDialog("Digite o primeiro numero");
               String numero2String = JOptionPane.showInputDialog("Digite o segundo numero");

               //Transformando em Int
               int numero1 = Integer.parseInt(numero1String);

               int numero2 = Integer.parseInt(numero2String);

               //encontrando o menor numero 
               int menor = (numero1 < numero2) ? numero1 : numero2; 

               //Exibindo o resultado 
              JOptionPane.showMessageDialog(null, "O menor numero é :" + menor); 
            
    }
}
