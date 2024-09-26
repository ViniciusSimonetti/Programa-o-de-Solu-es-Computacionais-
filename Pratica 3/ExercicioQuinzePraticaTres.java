//PRATICA 3 == EXERCICIO 15
import javax.swing.JOptionPane;

public class ExercicioQuinzePraticaTres {
         public static void main(String[] args) {
           int numero, maior = Integer.MIN_VALUE;
           String entrada;

        do {
            entrada = JOptionPane.showInputDialog("Digite um número inteiro (ou -9999 para parar):");
            numero = Integer.parseInt(entrada);

            if (numero > maior && numero != -9999) {
                maior = numero;
            }
        } while (numero != -9999);

        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
    }
}