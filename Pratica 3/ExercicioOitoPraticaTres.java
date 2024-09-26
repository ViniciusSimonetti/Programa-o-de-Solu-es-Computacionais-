//PRATICA 3 == Exercicio 8)

import javax.swing.JOptionPane;

public class ExercicioOitoPraticaTres {
          public static void main(String[] args) {
              long produto = 1;

            for (int i = 120; i <= 300; i++) {
                 produto *= i;
        }  
         //Apresentando o resultado na tela
        JOptionPane.showMessageDialog(null, "O produto dos números de 120 a 300 é: " + produto);
    }
}

