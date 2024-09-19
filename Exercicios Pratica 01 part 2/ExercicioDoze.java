//PRATICA 01/parte 2 -- EXERCICIO 12

import javax.swing.JOptionPane;



public class ExercicioDoze {
    public static void main(String[] args) {
        // Obtendo a data do usuário
        String dataS = JOptionPane.showInputDialog("Digite a data no formato dd/mm/aa (ex: 25/12/98):");

        // Separando os componentes da data utilizando split <--- pesquisar sobre split
        String[] partesData = dataS.split("/");

        // Convertendo as partes para inteiros
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);  


        // Exibindo os resultados na tela
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
  












   

