//PRATICA 3 == Exercicio 21)
import javax.swing.JOptionPane;

public class ExercicioVinteUmPraticaTres {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome + ":"));
            String sexo = JOptionPane.showInputDialog("Digite o sexo de " + nome + " (M/F):");

            if (sexo.equalsIgnoreCase("M") && idade > 21) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome);
            }
        }
    }
}