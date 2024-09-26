//PRATICA 3 == Exercicio 13)

import javax.swing.JOptionPane;

public class ExercicioTrezePraticaTres {
              public static void main(String[] args) {
        try {
            //Solicitando o número ao usuário
            String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");
            int numero = Integer.parseInt(numeroStr);

            // Verificando se o número é primo
            outerloop:
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    
                    break outerloop;
                }
            }

            //Se chegou até  aqui enão encontrou nenhum divisor logo ele é primo
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número inteiro válido.");
        }
    }
}