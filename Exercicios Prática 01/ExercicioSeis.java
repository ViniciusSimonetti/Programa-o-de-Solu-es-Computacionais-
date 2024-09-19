//PRATICA 01-- EXERCICIO 6)

import javax.swing.JOptionPane;

public class ExercicioSeis {
                     
            public static void main (String[] args) {
            //Lendo os digitos como caracteres 
            char milhar = JOptionPane.showInputDialog("Digite o digito das milhares").charAt(0);
        
            char centena = JOptionPane.showInputDialog("Digite o digito das centenas").charAt(0);

            char dezena = JOptionPane.showInputDialog("Digite o digito das dezenas").charAt(0);

            char unidade = JOptionPane.showInputDialog("Digite os digitos das unidades").charAt(0);
            
            //Convertendo os caracteres para números e concatenando na string
            String numeroCompleto = "" + milhar + centena + dezena + unidade;

            //Saída 
            JOptionPane.showMessageDialog(null, "O número formado é: " + numeroCompleto);
            }  
        }  

  




















