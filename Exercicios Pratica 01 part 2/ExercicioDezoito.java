//PRATICA 01/PARTE 2 --- EXERCICIO 18)

import javax.swing.JOptionPane;


public class ExercicioDezoito {
    public static void main(String[] args) {
        try {
                 //Lendo as diagonais
                   String diagonalMaiorString = JOptionPane.showInputDialog("Digite o valor da diagonal maior do losango:");
                    double diagonalMaior = Double.parseDouble(diagonalMaiorString);

                   String diagonalMenorString = JOptionPane.showInputDialog("Digite o valor da diagonal menor do losango:");
                    double diagonalMenor = Double.parseDouble(diagonalMenorString);

                  //calculando a area
                 double area = (diagonalMaior * diagonalMenor) / 2;

                 //Exibindo o resultado
                 JOptionPane.showMessageDialog(null, "A área do losango é: " + area);


                 } catch (NumberFormatException e) {

                 JOptionPane.showMessageDialog(null, "Por favor, digite valores numéricos válidos.");
          }
     }
 }
