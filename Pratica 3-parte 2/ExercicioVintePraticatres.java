//Pratica 3 == Exercicio 20)
import javax.swing.JOptionPane;

public class ExercicioVintePraticatres {
    public static void main(String[] args) {
           //Obtendo o limite superior e o incremento do usuário
            String limiteSuperiorStr = JOptionPane.showInputDialog("Digite o limite superior:");
            String incrementoStr = JOptionPane.showInputDialog("Digite o incremento:");

           //Convertendo as entradas para números
           int limiteSuperior = Integer.parseInt(limiteSuperiorStr);
           int incremento = Integer.parseInt(incrementoStr);

          //Construindo a string com a sequência
        String sequencia = "Sequência: ";
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            sequencia += i + " ";
        }

         //Exibindo a sequência
         JOptionPane.showMessageDialog(null, sequencia);
    }
}