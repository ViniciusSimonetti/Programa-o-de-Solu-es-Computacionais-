//PRATICA 3 == EXERCICIO 7)

import javax.swing.JOptionPane;

public class ExercicioSetePraticaTres {
             public static void main(String[] args) {
            String mensagem = "Múltiplos de 5 entre 1 e 500:\n";

                for (int i = 5; i <= 500; i += 5) {
                      mensagem += i + "\n";
            }  

              JOptionPane.showMessageDialog(null, mensagem);
      }
}