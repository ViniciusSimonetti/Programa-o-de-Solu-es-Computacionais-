//PRATICA 02 == Exercicio 8)
import javax.swing.JOptionPane;

public class ExercicioOitoPraticaDois {
                 public static void main(String[] args)  {
                //Obtendo os números do usuário
                String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");

                String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

               //Convertendo as strings para números inteiros
               int num1 = Integer.parseInt(num1Str);

               int num2 = Integer.parseInt(num2Str);

               //Encontrando o maior número ====> Math.max  retorna o maior valor entre num1 e num2
              int maiorNumero = Math.max(num1, num2);

              //Exibindo o resultado
              JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }
}
