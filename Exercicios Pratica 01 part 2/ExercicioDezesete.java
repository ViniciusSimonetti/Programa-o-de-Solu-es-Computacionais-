//PRATICA 01/parte 2 -- EXERCICIO 17

import javax.swing.JOptionPane;

public class ExercicioDezesete {
    public static void main(String[] args) {
       
            //lendo a base do triangulo
            String baseString = JOptionPane.showInputDialog("Digite o valor da base do triângulo:");
            double base = Double.parseDouble(baseString);

            //lendo a altura do triangulo
            String alturaString = JOptionPane.showInputDialog("Digite o valor da altura do triângulo:");
            double altura = Double.parseDouble(alturaString);

            //calculando a area
            double area = (base * altura) / 2;

            //exibindo o resultado
            JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
         
    }   
}       
    
