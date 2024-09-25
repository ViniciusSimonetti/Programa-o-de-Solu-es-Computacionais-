//PRATICA 02 == Exercicio 2
import javax.swing.JOptionPane;

public class ExercicioDoisPraticaDois {
   
    public static void main(String[] args) {
          int numero1, numero2, soma, resultado;

          //Obtendo os números do usuário
          String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
          String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

          //Convertendo as strings para inteiros
          numero1 = Integer.parseInt(num1Str);
          numero2 = Integer.parseInt(num2Str);

        //Calculando a soma
        soma = numero1 + numero2;

        //Se for menor que 20 subtrair 5
        if (soma <= 20) {
            resultado = soma - 5;
            JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado);
        } else {
        //Se a soma for maior que 20 encerramos o programa 
        if (soma >= 20) {
        JOptionPane.showMessageDialog(null, "A soma do resultado foi maior que 20, por favor tente novamente");
        }
    }   
} 
}   
     
    

