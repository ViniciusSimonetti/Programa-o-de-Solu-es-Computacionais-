//PRATICA 01/part 2 Operadores Aritmeticos- EXERCICIO 1

import javax.swing.JOptionPane;

public class ExercicioUm{
        public static void main (String [] args) {
            //Idade como String
            String idadeS = JOptionPane.showInputDialog("Digite a sua idade em anos:");
            
            //Convertendo Idade para Int(Numero inteiro)
            
            int idade = Integer.parseInt(idadeS);

           //Calculando os Dias vividos

           double dias = idade * 365.25;
          
           //Arredondando o resultado para int
           int resultFinal = (int) Math.round(dias);
         
           //Saída
        
           JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + resultFinal + " dias.");
        





        }
    } 
        




















