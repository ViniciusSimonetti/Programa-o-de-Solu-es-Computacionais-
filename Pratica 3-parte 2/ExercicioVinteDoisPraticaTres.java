//PRATICA 3 == Exercicio 22)
import javax.swing.JOptionPane;

    public class ExercicioVinteDoisPraticaTres {
         public static void main(String[] args) {
          //Obtendo o limite superior do usuário
          String limiteString = JOptionPane.showInputDialog("Digite o limite superior:");
          int limite = Integer.parseInt(limiteString);

        //Imprimindo os números ímpares
         String numerosImpares = "";
         for (int i = 1; i < limite; i++) {
            if (i % 2 != 0) {
                numerosImpares += i + " ";
            }
        }

        //Exibindo o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Números ímpares até " + limite + ": " + numerosImpares);
    }
}