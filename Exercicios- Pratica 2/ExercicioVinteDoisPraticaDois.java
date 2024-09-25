import javax.swing.JOptionPane;

public class ExercicioVinteDoisPraticaDois {
    public static void main(String[] args) {
                   //Obtendo os numeros do usuario
                    String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
                    String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
                   String num3Str = JOptionPane.showInputDialog("Digite o terceiro número:");

             //Convertendo as strings para números inteiros
              int numero1 = Integer.parseInt(num1Str);
              int numero2 = Integer.parseInt(num2Str);
              int numero3 = Integer.parseInt(num3Str);

             //Inicializando a variável 'maior' com o primeiro número
              int maior = numero1;

                    //Comparando o segundo número com o maior 
                     if (numero2 > maior) {
                         maior = numero2;
                    }

             //Comparando o terceiro número com o maior 
              if (numero3 > maior) {
                  maior = numero3;
              }

             //Mostrando o maior número
              JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}