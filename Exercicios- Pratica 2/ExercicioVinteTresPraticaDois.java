//PRATICA 02 == EXERCICIO 23)

import javax.swing.JOptionPane;

public class ExercicioVinteTresPraticaDois {
    public static void main(String[] args) {
        //Obtendo os numeros do usuario
         String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
         String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
         String num3Str = JOptionPane.showInputDialog("Digite o terceiro número:");

               //Convertendo as strings para números inteiros
               int num1 = Integer.parseInt(num1Str);
               int num2 = Integer.parseInt(num2Str);
               int num3 = Integer.parseInt(num3Str);

        //Variáveis para armazenar os valores ordenados
        int maior, intermediario, menor;

        //Lógica para ordenar os números ======> estudar essa parte do codigo
        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                intermediario = num2;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                intermediario = num1;
                menor = num3;
            } else {
                intermediario = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                intermediario = num1;
                menor = num2;
            } else {
                intermediario = num2;
                menor = num1;
            }
        }

                   //Mostra os números ordenados
                   JOptionPane.showMessageDialog(null, "Os números em ordem decrescente são: " + maior + ", " + intermediario + ", " + menor);
      }
}