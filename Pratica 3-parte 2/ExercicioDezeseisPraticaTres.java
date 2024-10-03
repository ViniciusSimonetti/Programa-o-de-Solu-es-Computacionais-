//PRATICA 3 == EXERCICIO 16)

import javax.swing.JOptionPane;

public class ExercicioDezeseisPraticaTres {
            public static void main(String[] args) {
              //Pedindo para o usuário digitar um número inteiro 
               String input = JOptionPane.showInputDialog("Digite um número:");
               int numero = Integer.parseInt(input);

               //Variáveis para calcular a sequência
              int primeiro = 0, segundo = 1, proximo;

               //String para armazenar a sequência
              String sequencia = primeiro + " " + segundo + " ";

              //Loop for para calcular e adicionar os demais números à string
              for (int i = 2; i < numero; i++) {
                  proximo = primeiro + segundo;
                  sequencia += proximo + " ";
                  primeiro = segundo;
                  segundo = proximo;
        }

            //Exibindo a sequência em uma caixa de diálogo
             JOptionPane.showMessageDialog(null, "Sequência de Fibonacci: " + sequencia);
    }
}