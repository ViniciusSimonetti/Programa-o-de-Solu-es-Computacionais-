//PRATICA 02 === EXERCICIO 12

import javax.swing.JOptionPane;
public class ExercicioDozePraticaDois {
    public static void main(String[] args)  {

                   //Obtendo o numero do usuario
                   String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");
                   int numero = Integer.parseInt(numeroStr);

                  //Verificando a divisibilidade  ultilizando IF/Else e apresentando os resultados
                   if (numero % 10 == 0) {
                       JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 10.");
                 } else if (numero % 5 == 0) {
                            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 5.");
            } else if (numero % 2 == 0) {
                       JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 2.");
             } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 10, 5 ou 2.");
        }
    }
}
