//PRATICA 01/PARTE 2 -- EXERCICIO 2)

import javax.swing.JOptionPane;


public class ExercicioDois {
    public static void main(String[] args) {
         //Obter a base do retângulo como uma string
         String baseRet = JOptionPane.showInputDialog("Digite a medida da base do retângulo:");

        //Converter a base para double (para permitir números decimais)
        double base = Double.parseDouble(baseRet);

        //Obter a altura do retângulo
         String alturaS = JOptionPane.showInputDialog("Digite a medida da altura do retângulo:");

        //Converter a altura para um número double
        double altura = Double.parseDouble(alturaS);

         //Calcular a área do retângulo
          double area = base * altura;

        //Saída
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}