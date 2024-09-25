//PRATICA 02 === EXERCICIO 15)
import javax.swing.JOptionPane;

public class ExercicioQuinzePraticaDois{
            public static void main(String[] args)  {
               try {         
                     //Obtendo o ano de nascimento e o ano atual do usuário
                        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
                        int anoNascimento = Integer.parseInt(anoNascimentoStr);  


                       String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual:");
                       int anoAtual = Integer.parseInt(anoAtualStr);  


                    //Validando o ano de nascimento
                    if (anoNascimento <= 0 || anoNascimento > anoAtual) {
                        JOptionPane.showMessageDialog(null, "Ano de nascimento inválido.");
                     return;
                    }

                    //Calculando a idade
                    int idade = anoAtual - anoNascimento;

                   //Exibindo a idade
                   JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade + " anos.");
                  } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "Você deve digitar um número válido para o ano.");
             }
    }
   }   
