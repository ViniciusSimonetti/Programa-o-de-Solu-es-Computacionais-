//PRATICA 01 Exercicio 1)

import javax.swing.JOptionPane;


public class ExercicioUm {
    public static void main(String[] args) {
       //Entrada das palavras 
       String palavra1 = JOptionPane.showInputDialog("digite a primeira palavra");
       String palavra2 = JOptionPane.showInputDialog("digite a segunda palavra");
       String palavra3 = JOptionPane.showInputDialog("digite a terceira palavra");

       //inversão das palavras e impressão

       String palavrasInvertidas = palavra3 + " " + palavra2 + " " + palavra1;
       JOptionPane.showMessageDialog(null,"As palavras na ordem inversa são: " + palavrasInvertidas);
    }








}
