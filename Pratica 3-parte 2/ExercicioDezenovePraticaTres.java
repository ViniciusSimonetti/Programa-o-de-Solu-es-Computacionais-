//Pratica 3 == EXERCICIO 19)
import javax.swing.JOptionPane;

public class ExercicioDezenovePraticaTres {
         public static void main(String[] args) {
          //Obtendo o número do usuário
          String numeroStr = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
          int numero = Integer.parseInt(numeroStr);

        //Calculando o fatorial
          long fatorial = 1;
         for (int i = 1; i <= numero; i++) {
              fatorial *= i;
        }

        //Exibindo o resultado
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}