//PRATICA 02 == EXERCICIO 20)

import javax.swing.JOptionPane;
public class ExercicioVintePraticaDois {
                 public static void main(String[] args)  {
              //Entrada dos números
              String numero1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
              String numero2Str = JOptionPane.showInputDialog("Digite o segundo número:");
  
             //Conversão para números inteiros
                int numero1 = Integer.parseInt(numero1Str);
                int numero2 = Integer.parseInt(numero2Str);
  
               //Encontrando o maior e o menor número
               int maior = Math.max(numero1, numero2);
               int menor = Math.min(numero1, numero2);
  
               //Calculando o quadrado do menor número
               int quadradoMenor = menor * menor;
  
               //Calculando a raiz quadrada do maior número (se for positivo)
                double raizMaior = 0;
                 if (maior >= 0) {
                     raizMaior = Math.sqrt(maior);
                 }
  
               //Imprimindo os resultados
               JOptionPane.showMessageDialog(null, "O quadrado do menor número é: " + quadradoMenor +
                                             "\n A raiz quadrada do maior número é: " + raizMaior);
      }
    }

