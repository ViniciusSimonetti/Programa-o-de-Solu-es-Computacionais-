//PRATICA 3 == Exercicio 10)
import javax.swing.JOptionPane;

public class ExercicioDezPraticaTres {
            public static void main(String[] args) {
                int numero;
                String divisores = "";

        do {
                 String input = JOptionPane.showInputDialog("Digite um número (ou -999 para sair):");
                 numero = Integer.parseInt(input);

            if (numero != -999 && numero > 0) {
                divisores = "Divisores de " + numero + ": ";
                for (int i = 1; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        divisores += i + " ";
                    }
                }
                divisores += numero; // Adiciona o próprio número como divisor

                JOptionPane.showMessageDialog(null, divisores);
            }
        } while (numero != -999);
    }
}