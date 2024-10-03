//PRATICA 3 == Exercicio 23) 
import javax.swing.JOptionPane;

public class ExercicioVinteTresPraticaTres {
       public static void main(String[] args) {
         // Obter a quantidade de números pares a serem impressos
         String quantidadeString = JOptionPane.showInputDialog("Digite a quantidade de números pares a imprimir:");
         int quantidade = Integer.parseInt(quantidadeString);

        //Imprimimdo os números pares
        String numerosPares = "";
        int numeroPar = 2;
        for (int i = 0; i < quantidade; i++) {
            numerosPares += numeroPar + " ";
            numeroPar += 2;
        }

        //Exibindo o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Números pares: " + numerosPares);
    }
}