//PRATICA 3 == EXERCICIO 9)
import javax.swing.JOptionPane;

public class ExercicioNovePraticaTres {
             public static void main(String[] args) {
                  int soma = 0;
                 String numeros = "";

             for (int i = 1; i <= 100; i++) {
                 soma += i;
                numeros += i + " ";
        }
        //Apresentando o resultado 
        JOptionPane.showMessageDialog(null, "Números de 1 a 100:\n" + numeros + "\n\nSoma total: " + soma);
    }
}