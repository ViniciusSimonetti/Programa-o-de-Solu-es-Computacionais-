//PRATICA 02 == EXERCICIO 21)


import javax.swing.JOptionPane;
public class ExercicioVinteUmPraticaDois {
               public static void main(String[] args) {
                   //Pedindo ao usuário para digitar os três números
                   String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");

                   String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

                   String num3Str = JOptionPane.showInputDialog("Digite o terceiro número:");

                    //Convertendo as strings para números inteiros
                    int num1 = Integer.parseInt(num1Str);

                    int num2 = Integer.parseInt(num2Str);
                    
                    int num3 = Integer.parseInt(num3Str);

                  //Encontrando o maior número usando if-else aninhados
                    int maior;
                    if (num1 > num2 && num1 > num3) {
                        maior = num1;
                   } else if (num2 > num1 && num2 > num3) {
                             maior = num2;
                    } else {
                  maior = num3;
          }

                //Mostrando o maior número
                JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}