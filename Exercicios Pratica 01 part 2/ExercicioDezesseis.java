//PRATICA 01/Parte 2 --- EXERCICIO 16)

import javax.swing.JOptionPane;

public class ExercicioDezesseis {
    public static void main(String[] args)  {
        try {
            //Entrada do número
            String numeroString = JOptionPane.showInputDialog("Digite um número:");
            int numero = Integer.parseInt(numeroString);


            //Calculando 
            int quadrado = numero * numero;
            double raizQuadrada = Math.sqrt(numero);


            //Saída( exibindo o resultado)
            String resultado = "Número: " + numero + "\n" +
                               "Quadrado: " + quadrado + "\n" +
                               "Raiz quadrada: " + raizQuadrada;


                 JOptionPane.showMessageDialog(null, resultado);
                 } catch (NumberFormatException e) {
            }
         } 
     }