//PRATICA 02 / EXERCICIO 4)
import javax.swing.JOptionPane;

public class ExercicioQuatroPraticaDois {
        public static void main(String[] args)  {
                //Pedindo para o usuario os 3 numeros
                String numero1String = JOptionPane.showInputDialog("Digite o primeiro numero");

                String numero2String = JOptionPane.showInputDialog("Digite o segundo numero");

                String numero3String = JOptionPane.showInputDialog("Digite o terceiro numero");
                
                //Convertendo as strings para numeros inteiros
                int numero1 = Integer.parseInt(numero1String);
                int numero2 = Integer.parseInt(numero2String);
                int numero3 = Integer.parseInt(numero3String);
                
                //Ordenando os numeros usando If
                if (numero1 > numero2) {
                    int temp = numero1;
                    numero1 = numero2;
                    numero2 = temp;
                }
        
                if (numero1 > numero3) {
                    int temp = numero1;
                    numero1 = numero3;
                    numero3 = temp;
                }
        
                if (numero2 > numero3) {
                    int temp = numero2;
                    numero2 = numero3;
                    numero3 = temp; 

                }

                //Mostrando os números ordenados
                JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);
            }
}
                                    

                