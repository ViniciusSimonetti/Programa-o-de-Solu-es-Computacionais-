//PRATICA 02 == Exercicio 3

import javax.swing.JOptionPane;

public class ExercicioTresPraticaDois {
    public static void main(String[] args) {
           //Exibindo o numero do usuario 
           String numeroString = JOptionPane.showInputDialog("Digite um numero");
           
           //Convertendo para double
           double numero = Double.parseDouble(numeroString);
           
           //Verificando se o numero é positivo ou negativo
           
           if(numero > 0) { 

           //calculando a raiz quadrada e exibir o resultado

           double RaizQuadrada = Math.sqrt(numero);
           JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é " + RaizQuadrada);
        } else {

            //Calcular a o quadrado e exibir o resultado
            double quadrado = Math.pow(numero, 2);

            JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é " + quadrado);
        }




        
    }
}
