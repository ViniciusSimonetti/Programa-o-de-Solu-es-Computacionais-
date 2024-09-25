//PRATICA 02 == EXERCICIO 18)

import javax.swing.JOptionPane;
public class ExercicioDezoitoPraticaDois {
            public static void main(String[] args)  {
            //obtendo os 2 numeros
            String numero1S = JOptionPane.showInputDialog("Digite o primeiro numero");
            String numero2S = JOptionPane.showInputDialog("Digite o segundo numero");

            //Transformando em Int 
            int numero1 = Integer.parseInt(numero1S);
            int numero2 = Integer.parseInt(numero2S);
             
           //Ordenando os numeros 
           int menor, maior;
           if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
            } else {
            menor = numero2;
            maior = numero1;
            }
         // Exibindo os resultados  em ordem crescente 

         JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + menor + " e " + maior);


        }
}
