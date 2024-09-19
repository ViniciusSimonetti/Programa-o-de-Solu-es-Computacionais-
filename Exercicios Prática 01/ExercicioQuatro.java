//PRATICA 01 - EXERCICIO 4)

import javax.swing.JOptionPane;
public class ExercicioQuatro {
          public static void main(String[] args) {

                  //Leitura de Peso

                   String pesoS = JOptionPane.showInputDialog("Digite o seu peso (em kg):");
                 
                  //Conversão para double 
                  double peso = Double.parseDouble(pesoS);

                  //Saida
                  JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + "kg.");
          }  
        }













