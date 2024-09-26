//PRATICA 3 == EXERCICIO 14)
import javax.swing.JOptionPane;

public class ExercicioQuatorzerPraticaTres {
          public static void main(String[] args) {
   
   
            int num, contPrimos = 0;



         do {
           String entrada = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou negativo para parar):");
           num = Integer.parseInt(entrada);

          if (num > 0 && ehPrimo(num) == 1) {
              contPrimos++;
        }
            } while (num > 0);

               JOptionPane.showMessageDialog(null, "A quantidade de números primos é: " + contPrimos);
}

             public static int ehPrimo(int num) {
                 if (num <= 1) {
                    return 0; // Não é primo
             }

              for (int i = 2; i <= Math.sqrt(num); i++) {
               if (num % i == 0) {
                   return 0; // Não é primo
        }
    }

              return 1; // É primo
  }
}