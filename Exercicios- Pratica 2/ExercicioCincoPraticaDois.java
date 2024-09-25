//PRATICA 02 == EXERCICIO 5)

import javax.swing.JOptionPane;

public class ExercicioCincoPraticaDois {
    public static void main(String[] args)  {
           //Obtendo o número do usuário
           String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");

               //Convertendo a string para um número inteiro
               int numero = Integer.parseInt(numeroStr);

               //Verificando se o número está no intervalo usando IF
               if (numero >= 20 && numero <= 90) {


              JOptionPane.showMessageDialog(null, "O número " + numero + " está entre 20 e 90.");
              } else {


            JOptionPane.showMessageDialog(null, "O número " + numero + " não está entre 20 e 90.");
        }






    }
}
