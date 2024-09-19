//PRATICA 01/PARTE 2 -- EXERCICIO 11)

import javax.swing.JOptionPane;

public class ExercicioOnze {
                      public static void main (String [] args) {
                        // Obter a data do usuário no formato ddmmaa
        String dataString = JOptionPane.showInputDialog("Digite a data no formato ddmmaa :");

        // Converter a string para um número inteiro
        int data = Integer.parseInt(dataString);

        // Separar os componentes da data
        int dia = data / 10000;  // Primeiros dois dígitos (dia)
        int mes = (data / 100) % 100 ;// Próximos dois dígitos (mês)
        int ano = data % 100;  // Últimos dois dígitos (ano)

        // Exibir os resultados em uma caixa de diálogo no formato dd/mm/aa
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}