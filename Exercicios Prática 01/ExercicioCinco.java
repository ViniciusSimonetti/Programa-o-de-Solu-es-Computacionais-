//PRATICA 01 -- EXERCICIO 5)
import javax.swing.JOptionPane;

public class ExercicioCinco
 {
    public static void main(String[] args) {
        // Definição de valores das variaveis
               char[] caracteres = new char[10];

               String palavra = "";
               
               //Formação de loop 
            for (int i = 0; i < 10; i++) {
            String caractereString = JOptionPane.showInputDialog("Digite o " + (i+1) + "º caractere:");

            caracteres[i] = caractereString.charAt(0);

            palavra += caracteres[i];
        }
            //Saida
        JOptionPane.showMessageDialog(null, "A palavra formada é: " + palavra);
    }
}