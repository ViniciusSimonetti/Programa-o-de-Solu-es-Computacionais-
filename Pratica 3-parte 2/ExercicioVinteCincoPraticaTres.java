//PRATICA 3 == Exercicio 25)
import javax.swing.JOptionPane;

public class ExercicioVinteCincoPraticaTres {
              public static void main(String[] args) {
                   int[] votos = new int[4]; //armazenar os votos de cada candidato
                   int totalVotos = 0;
                   int voto;

        do {
            String votoString = JOptionPane.showInputDialog("Digite o número do seu candidato (1-4) ou -1 para encerrar:");
            voto = Integer.parseInt(votoString);

            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++; // Incrementa o voto do candidato escolhido
                totalVotos++;
            } else if (voto != -1) {
                JOptionPane.showMessageDialog(null, "Voto inválido. Digite um número entre 1 e 4 ou -1 para encerrar.");
            }
        } while (voto != -1);

        // Cálculo e exibição dos resultados
        for (int i = 0; i < votos.length; i++) {
            double percentual = (double) votos[i] / totalVotos * 100;
            JOptionPane.showMessageDialog(null, "Candidato " + (i + 1) + ": " + votos[i] + " votos (" + String.format("%.2f", percentual) + "%)");
        }

        JOptionPane.showMessageDialog(null, "Total de alunos que votaram: " + totalVotos);
    }
}