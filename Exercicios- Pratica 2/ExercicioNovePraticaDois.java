//PRATICA 02 == EXERCICIO 9)

import javax.swing.JOptionPane;

public class ExercicioNovePraticaDois {
                      public static void main(String[] args)  {
                 //Obtendo o número do usuário
                 String numStr = JOptionPane.showInputDialog("Digite um número:");

                 //Convertendo a string para um número inteiro
                 int num = Integer.parseInt(numStr);

                 //Verificar se o número é múltiplo de 3 ultilizando if/else
                 if (num % 3 == 0) {
                 JOptionPane.showMessageDialog(null, "O número é múltiplo de 3.");
                 } else {
                    
                JOptionPane.showMessageDialog(null, "O número não é múltiplo de 3.");
                                                                                
        }
    }
}
