//PRATICA 02 == EXERCICIO 19)

import javax.swing.JOptionPane;
public class ExercicioDezenovePraticaDois {
    public static void main(String[] args)  {
                   //Obtendo os 2 numeros do usuario
                   String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");

                   String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

                //Convertendo as strings para números inteiros
                   int num1 = Integer.parseInt(num1Str);

                   int num2 = Integer.parseInt(num2Str);

                    //Ordena os números em ordem decrescente ultilizando IF/Else
                    if (num1 < num2) {
                        num1 = num1 + num2;
                        num2 = num1 - num2;
                        num1 = num1 - num2;
                   }

               //Mostrando os números ordenados
               
                JOptionPane.showMessageDialog(null, "Os números em ordem decrescente são: " + num1 + ", " + num2);      


    }
}
