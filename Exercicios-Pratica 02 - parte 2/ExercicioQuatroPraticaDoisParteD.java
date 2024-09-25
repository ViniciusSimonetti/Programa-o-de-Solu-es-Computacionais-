//PRATICA 02 parte 2 == exercicio 4

import javax.swing.JOptionPane;

public class ExercicioQuatroPraticaDoisParteD {
    public static void main(String[] args) {
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");

        char primeiraLetra = nomeAluno.charAt(0);

        if (primeiraLetra >= 'A' && primeiraLetra <= 'K') {
            JOptionPane.showMessageDialog(null, "O aluno " + nomeAluno + " está na divisão D1.");
        } else if (primeiraLetra >= 'L' && primeiraLetra <= 'N') {
            JOptionPane.showMessageDialog(null, "O aluno " + nomeAluno + " está na divisão D2.");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno " + nomeAluno + " está na divisão D3.");
        }
    }
}