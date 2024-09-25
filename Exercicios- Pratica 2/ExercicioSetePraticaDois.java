//PRATICA 2 == EXERCICIO 7)

import javax.swing.JOptionPane;

public class ExercicioSetePraticaDois {

                 public static void main(String[] args)  {
                 //Entrada de dados
                 String nome = JOptionPane.showInputDialog("Digite o nome:");
                 String sexo = JOptionPane.showInputDialog("Digite o sexo (f ou m):").toLowerCase();
                 String idadeStr = JOptionPane.showInputDialog("Digite a idade:");
        
                  //Convertendo a idade para inteiro
                  int idade = Integer.parseInt(idadeStr);

                 // Verificação das condições
                 String mensagem;
                if (sexo.equals("f") && idade < 25) {
                mensagem = nome + ", ACEITA.";
                } else {
                mensagem = nome + ", NÃO ACEITA.";
                }

               //Exibindo o resultado
               JOptionPane.showMessageDialog(null, mensagem);

    }
}
