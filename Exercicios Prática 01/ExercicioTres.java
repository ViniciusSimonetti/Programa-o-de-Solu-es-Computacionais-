//PRATICA 01- Exercicio 3)
import javax.swing.JOptionPane;

public class ExercicioTres {
           public static void main(String[] args) {
               //leitura dos números ---> Data/Mês/Ano
 
               String diaS = JOptionPane.showInputDialog("Digite o dia");
               String mesS = JOptionPane.showInputDialog("Digite o mês");
               String anoS = JOptionPane.showInputDialog("Digite o ano") ; 
               
               //Conversão para inteiros
               int dia = Integer.parseInt(diaS);
               int mes = Integer.parseInt(mesS);
               int ano = Integer.parseInt(anoS);
               
               // Transformando em formato de data
                   
                   String FormatoData = dia + "/" + mes + "/" + ano;
               
               //Saída 
               JOptionPane.showMessageDialog(null, "O formato em data é: " + FormatoData); 

           }
        }    
                
               
            









