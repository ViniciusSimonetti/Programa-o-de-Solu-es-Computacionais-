//PRATICA 3 == Exercicio 18
import javax.swing.JOptionPane;

public class ExercicioDezoitoPraticaTres {
     public static void main(String[] args) {
            //Obtendo os limites e o incremento do usuário
            String limiteInferiorStr = JOptionPane.showInputDialog("Digite o limite inferior em Celsius:");
            String limiteSuperiorStr = JOptionPane.showInputDialog("Digite o limite superior em Celsius:");
            String incrementoStr = JOptionPane.showInputDialog("Digite o incremento:");

            //Convertendo as entradas para números em double
            double limiteInferior = Double.parseDouble(limiteInferiorStr);
            double limiteSuperior = Double.parseDouble(limiteSuperiorStr);
            double incremento = Double.parseDouble(incrementoStr);

           //Construindo a tabela
             String tabela = "Celsius\tFahrenheit\n";
             for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
                  double fahrenheit = (celsius * 9/5) + 32;
                 tabela += celsius + "\t\t" + fahrenheit + "\n";
        }

           //Exibindo  a tabela
           JOptionPane.showMessageDialog(null, tabela, "Tabela de Conversão", JOptionPane.INFORMATION_MESSAGE);
    }
}