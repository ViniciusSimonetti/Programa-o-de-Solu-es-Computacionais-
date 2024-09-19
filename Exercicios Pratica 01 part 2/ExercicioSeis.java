// PRATICA 01/PARTE 2 -- EXERCICIO 6)

import javax.swing.JOptionPane;

public class ExercicioSeis {
    public static void main(String[] args) {
        try {
            // Solicitando o numero 
            String numeroS = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
            int numero = Integer.parseInt(numeroS);

            // Validando se o número tem 3 dígitos ultilizando (IF) certificando se o numero está entre 100 e 999
            if (numero >= 100 && numero <= 999) {  

            // Extraindo o algarismo das dezenas 
            int algDezenas = (numero / 10) % 10;

           //Tornando o programa mais dinamico---> Exibindo o resultado ultilizando If ---> Caso o usuario digite mais que 3 numero ou não digite um numero inteiro

            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é: " + algDezenas);
            } else {

            JOptionPane.showMessageDialog(null, "O número digitado não tem 3 dígitos.");
            }

            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro.");
        }
    }
}

    
                      
                  
                 
             
              
                        
























