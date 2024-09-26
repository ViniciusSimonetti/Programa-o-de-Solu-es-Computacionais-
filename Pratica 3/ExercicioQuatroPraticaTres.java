//PRATICA 3 == Exercicio 4)
import javax.swing.JOptionPane;

public class ExercicioQuatroPraticaTres {
    public static void main(String[] args) {
        int numero, contador = 0;

        for (;;) { // Loop infinito
            String entrada = JOptionPane.showInputDialog("Digite um número (0 para sair):");
            numero = Integer.parseInt(entrada);

            if (numero == 0) {
                break; //Saindo do loop quando o número for 0
            }

            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Foram digitados " + contador + " números entre 100 e 200.");
    }
}