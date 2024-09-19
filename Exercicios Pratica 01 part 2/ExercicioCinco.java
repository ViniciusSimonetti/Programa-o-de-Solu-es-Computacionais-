//PRATICA 01/PARTE 2 -- EXERCICIO 5)

import javax.swing.JOptionPane; 
import java.text.DecimalFormat;

public class ExercicioCinco {
                        public static void main (String [] args) { 
                       //Entrada dos Dados
                       double valorS = 100.0;
                       double taxaJ = 10.0;
                       int mesesS = 8;
                       
                       
                       //calculo do valor final 
                       double valorF = valorS * Math.pow(1 + (taxaJ / 100) , mesesS);
                       
                       //Transformando os valores em casas decimais

                       DecimalFormat df = new DecimalFormat("#,##0.00");
                       
                       //Saída(Exibir o resultado)
                        JOptionPane.showMessageDialog(null," O valor inicial após " + mesesS + " meses será de R$ " +  df.format(valorF));
                        }  
                    }      















