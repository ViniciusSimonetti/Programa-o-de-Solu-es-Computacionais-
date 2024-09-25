//PRATICA 02 parte 2 === exercicio 3

import javax.swing.JOptionPane;

public class ExercicioTresPraticaDoisParteD {
                    public static void main(String[] args) {
                     //Obtendo o verbo   
                    String verbo = JOptionPane.showInputDialog("Digite um verbo no infinitivo:");

        //Remove espaços em branco e converte para minúsculas para facilitar a comparação
        verbo = verbo.trim().toLowerCase();

        String ultimaLetra = verbo.substring(verbo.length() - 1);

        if (ultimaLetra.equals("ar")) {
            JOptionPane.showMessageDialog(null, "O verbo " + verbo + " pertence à 1ª conjugação.");
        } else if (ultimaLetra.equals("er")) {
            JOptionPane.showMessageDialog(null, "O verbo " + verbo + " pertence à 2ª conjugação.");
        } else if (ultimaLetra.equals("ir")) {
            JOptionPane.showMessageDialog(null, "O verbo " + verbo + " pertence à 3ª conjugação.");
        } else if (ultimaLetra.equals("r")) {
            JOptionPane.showMessageDialog(null, "O verbo " + verbo + " não está no infinitivo.");
        } else {
            JOptionPane.showMessageDialog(null, "Provavelmente \"" + verbo + "\" não é um verbo no infinitivo.");
        }
    }
}