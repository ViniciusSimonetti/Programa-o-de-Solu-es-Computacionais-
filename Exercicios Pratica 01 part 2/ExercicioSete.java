//PRATICA 01/PARTE 2 --- EXERCICIO 7)

import javax.swing.JOptionPane;
 
public class ExercicioSete {
                public static void main(String[] args) {
                 // Solicitando ao usuário para inserir o ângulo em graus.
                 String anguloString = JOptionPane.showInputDialog("Digite o angulo em graus");
                
                 // Convertendo a entrada do usuário para um número double
                 double anguloEmGraus = Double.parseDouble(anguloString);

                 // Convertendo o ângulo para radianos, pois as funções trigonométricas em Java usam radianos
                 double anguloEmRadianos = Math.toRadians(anguloEmGraus);

                  // Calculando as funções trigonométricas
                  double seno = Math.sin (anguloEmRadianos);
                  double cosseno = Math.cos (anguloEmRadianos);
                  double tangente = Math.tan (anguloEmRadianos);
                  double secante = 1 
                  / cosseno; //Secante é o inverso do cosseno
                  double cossecante = 1 / seno; // Cossecante é o inverso do seno
                  double cotangente = 1 / tangente; // Cotangente é o inverso da tangente

                  // Exibindo os resultados em uma caixa de diálogo
                   String resultado = "Para o ângulo de " + anguloEmGraus + " graus:\n" +
                   "Seno: " + seno + "\n" +
                   "Cosseno: " + cosseno + "\n" +
                   "Tangente: " + tangente + "\n" +
                   "Secante: " + secante + "\n" +
                   "Cossecante: " + cossecante + "\n" +
                   "Cotangente: " + cotangente;

                   JOptionPane.showMessageDialog(null, resultado);
                }   
            }


                   
                 
              
                            











            

    

























