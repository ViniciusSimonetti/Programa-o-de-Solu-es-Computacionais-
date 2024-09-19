//PRATICA 01/ PARTE 2 -- EXERCICIO 10)

import javax.swing.JOptionPane;

public class ExercicioDez { 
                   public static void main (String [] args) { 
                   //Obtendo as 3 frases 
                   String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
                    String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
                     String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");
                  //.................................................................................
                    
                    // Dividindo cada frase ao meio
                        int meio1 = frase1.length() / 2;
                            int meio2 = frase2.length() / 2;
                               int meio3 = frase3.length() / 2; 
                
                          String parte1_frase2 = frase2.substring(0, meio2);

                           String parte2_frase3 = frase3.substring(meio3);

                            String parte2_frase2 = frase2.substring(meio2);

                              String parte1_frase1 = frase1.substring(0, meio1);

                               String parte1_frase3 = frase3.substring(0, meio3);

                                  String parte2_frase1 = frase1.substring(meio1);
                               
                    //...................................................................................
                    
               
                    // Concatenar as partes na ordem especificada
                    String fraseEmbaralhada = parte1_frase2 + parte2_frase3 + parte2_frase2 + parte1_frase1 + parte1_frase3 + parte2_frase1;
                    //........................................................................................................................
                            // Exibir o resultado
                             String resultado = "Frases originais:\n" + frase1 + "\n" + frase2 + "\n" + frase3 + "\nFrase embaralhada:\n" + fraseEmbaralhada;
                             JOptionPane.showMessageDialog(null, resultado);
                     //........................................................................................................................................        
    }
}
                     

                

























