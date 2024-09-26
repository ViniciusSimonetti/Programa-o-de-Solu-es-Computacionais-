//PRATICA 3 == Exercicio 2

import javax.swing.JOptionPane;

public class ExercicioDoisPraticaTres {
    public static void main(String[] args) {
        String numerosPares = ""; // String para armazenar os números pares

        for (int i = 2; i <= 200; i += 2) {
            numerosPares += i + "\n"; // Adiciona cada número par à string, com uma quebra de linha
        }

        JOptionPane.showMessageDialog(null, numerosPares, "Números Pares", JOptionPane.INFORMATION_MESSAGE);
    }
}