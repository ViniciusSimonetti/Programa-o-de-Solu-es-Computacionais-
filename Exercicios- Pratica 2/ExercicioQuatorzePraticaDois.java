//PRATICA 2 == EXERCICIO 14

import javax.swing.JOptionPane;
public class ExercicioQuatorzePraticaDois {
                  public static void main(String[] args)  {
                        //Obtendo o número do usuário
                        String numeroStr = JOptionPane.showInputDialog("Digite um número de 4 dígitos:");
                       int numero = Integer.parseInt(numeroStr);

                 //Isolando os dígitos das unidades de milhar e centenas
                 int unidadesMilhar = numero / 1000;
                 int centenas = (numero % 1000) / 100;

                 //Formando o número com os dois dígitos
                 int novoNumero = unidadesMilhar * 10 + centenas;

                //Verificando a divisibilidade por 4
                 if (novoNumero % 4 == 0) {
                     JOptionPane.showMessageDialog(null, "O número formado pelos dois primeiros dígitos é divisível por 4.");
               } else {
                JOptionPane.showMessageDialog(null, "O número formado pelos dois primeiros dígitos não é divisível por 4.");
         }
     }
 }
