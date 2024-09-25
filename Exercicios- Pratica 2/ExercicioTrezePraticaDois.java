//PRATICA 02 == EXERCICIO 13)

import javax.swing.JOptionPane;

public class ExercicioTrezePraticaDois {
    public static void main(String[] args)  {
           //Obtendo o número do usuário
           String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
           int numero = Integer.parseInt(numeroStr);
  
                 //Validando se o número tem 3 dígitos utilizando IF/Else
                  if (numero < 100 || numero > 999) {
                      JOptionPane.showMessageDialog(null, "O número deve ter 3 dígitos.");
              return;
          }

                //Isolar o algarismo das dezenas =====> Estudar sobre 
                 int algarismoDezenas = (numero / 10) % 10;
  
                 // Verificando se é par ou ímpar e apresentando os resultados
                    if (algarismoDezenas % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "O algarismo das dezenas é par.");
                 } else {
                   JOptionPane.showMessageDialog(null, "O algarismo das dezenas é ímpar.");
          }
    }
}
