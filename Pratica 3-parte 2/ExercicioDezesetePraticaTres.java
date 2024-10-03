//PRATICA 3 == EXERCICIO 17)
import javax.swing.JOptionPane;

public class ExercicioDezesetePraticaTres {
            public static void main(String[] args) {
              String tabela = "Polegadas\tCentímetros\n";

             for (int polegadas = 1; polegadas <= 20; polegadas++) {
                  double centimetros = polegadas * 2.54;
                  tabela += polegadas + "\t\t" + centimetros + "\n";
        }

        JOptionPane.showMessageDialog(null, tabela, "Tabela de Conversão", JOptionPane.INFORMATION_MESSAGE);
    }
}