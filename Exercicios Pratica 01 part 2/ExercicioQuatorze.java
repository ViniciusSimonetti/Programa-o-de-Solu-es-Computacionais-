//PRATICA 01/PARTE 2 -- EXERCICIO 14)

import javax.swing.JOptionPane;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        //Declarando a constante PI
        final double PI = 3.14159;

        //Obtendo o raio que o usuario desejar
        String raioString = JOptionPane.showInputDialog("Digite o raio do círculo:");

        //Convertendo o raio para um número real (double)
        double raio = Double.parseDouble(raioString);

        //Calculando a área
        double area = PI * raio * raio;

        //saida (resultado da conta)
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}






















