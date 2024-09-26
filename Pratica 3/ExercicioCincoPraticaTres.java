//PRATICA 3 == Exercicio 5)

import javax.swing.JOptionPane;

public class ExercicioCincoPraticaTres {
    
          public static void main(String[] args) {
                    String nome;

            for (;;) { //Loop infinito
            nome = JOptionPane.showInputDialog("Digite um nome (ou FIM para parar):");

            if (nome.equalsIgnoreCase("FIM")) {
                break; // Sai do loop quando o nome for "FIM" 
            }

            JOptionPane.showMessageDialog(null, "Você digitou: " + nome);
        }
    }
}