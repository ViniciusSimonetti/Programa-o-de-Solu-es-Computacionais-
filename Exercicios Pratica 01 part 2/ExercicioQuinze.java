//PRATICA 01/ parte 2 -- EXERCICIO 15)

import javax.swing.JOptionPane;
public class ExercicioQuinze {
 
    

    public static void main(String[] args)  {
        
       //Digitando os numeros 
       String dividendoStr = JOptionPane.showInputDialog("Digite o dividendo:");
       String divisorStr = JOptionPane.showInputDialog("Digite o divisor:");

       //Convertendo para números inteiros
       int dividendo = Integer.parseInt(dividendoStr);
       int divisor = Integer.parseInt(divisorStr);

       //Realizando a divisão e obtendo o quociente e o resto 
       int quociente = dividendo / divisor;
       int resto = dividendo % divisor;

       // Exibindo os  resultados 
       JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo +
                                                           "\nDivisor: " + divisor +
                                                            "\nQuociente: " + quociente +
                                                             "\nResto: " + resto);
   }
}

















    

