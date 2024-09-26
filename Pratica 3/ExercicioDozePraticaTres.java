//Pratica 3 == Exercicio 12
import javax.swing.JOptionPane;

public class ExercicioDozePraticaTres {
             public static void main(String[] args) {
              int idade, memos21 = 0, mais50 = 0;

        for (;;) {
            try {
                String idadeStr = JOptionPane.showInputDialog("Digite a idade (0-120):");
                idade = Integer.parseInt(idadeStr);

                if (idade < 0 || idade > 120) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Saindo do programa.");
                    return;
                }

                if (idade < 21) {
                    memos21++;
                } else if (idade > 50) {
                    mais50++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.");
            }
        }
    }
}
