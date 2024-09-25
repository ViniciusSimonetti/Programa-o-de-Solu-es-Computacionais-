//PRATICA 2 == EXERCICIO 6

import javax.swing.JOptionPane;

public class ExercicioSeisPraticaDois {
                      public static void main(String[] args)  {
                      //Obtendo o número do usuário
                      String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");

                     //Convertendo a string para um número inteiro
                     int numero = Integer.parseInt(numeroStr);

                    //Comparando o número com 20 usando if/else e exibindo os resultados
                    if (numero > 20) {
                    JOptionPane.showMessageDialog(null, "O número " + numero + " é maior que 20.");
                    } else if (numero == 20) { 

                    JOptionPane.showMessageDialog(null, "O número " + numero + " é igual a 20.");
                    } else {

                    JOptionPane.showMessageDialog(null, "O número " + numero + " é menor que 20.");
                    }        
    }
}
