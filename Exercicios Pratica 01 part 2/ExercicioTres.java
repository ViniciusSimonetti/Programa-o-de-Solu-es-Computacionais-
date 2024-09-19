//PRATRICA 01/PARTE 2 --- EXERCICIO 3)

import javax.swing.JOptionPane;

public class ExercicioTres {
                 public static void main (String [] args) {

                    //Digitando o numero
                  String numeroS = JOptionPane.showInputDialog("Digite um número: ");
                  
                  //Transformando em int 
                  int numero = Integer.parseInt (numeroS);
                  
                  //Elevando ao Quadrado usando Math.pow 
                  double quadrado = Math.pow(numero, 2);
                  
                  //Saída do resultado
                  JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é: " + quadrado);
                 }  
           } 




























