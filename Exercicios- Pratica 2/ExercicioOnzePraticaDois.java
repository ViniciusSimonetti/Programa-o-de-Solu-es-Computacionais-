//PRATICA 02 == EXERCICIO 11)

import javax.swing.JOptionPane;

public class ExercicioOnzePraticaDois {
                   public static void main(String[] args)  {
                    //Obtendo o número do usuário
                    String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");
                    int numero = Integer.parseInt(numeroStr);

                   //Verificando a divisibilidade e mostrando o resultado
                     if (numero % 3 == 0 && numero % 7 == 0) {
                         JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3 e por 7.");
                } else if (numero % 3 == 0) {
                           JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3.");
            } else if (numero % 7 == 0) {
                       JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 7.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 3 nem por 7.");
        }


    }
}
