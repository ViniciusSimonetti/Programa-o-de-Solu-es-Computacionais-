//PRATICA 02 == Exercicio 10)

import javax.swing.JOptionPane;

public class ExercicioDezPraticaDois {

             public static void main(String[] args)  {
           //Pede ao usuário para inserir um número
           String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");

           //Converte a string para um número inteiro
           int numero = Integer.parseInt(numeroStr);
   
           //Verificando se o número é divisível por 5 ultilizando IF/else
           if (numero % 5 == 0) {
               JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 5.");
           } else {
               JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 5.");
           }
    }
}
