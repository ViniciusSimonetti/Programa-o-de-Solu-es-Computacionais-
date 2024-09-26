//PRATICA 3 == Exercicio 11)
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ExercicioOnzePraticaTres {
             public static void main(String[] args) {
                int codigo, tipo;
                 double kWh, custoTotal = 0, custoComercial = 0, custoIndustrial = 0, totalResidencial = 0, totalComercial = 0;
                     DecimalFormat df = new DecimalFormat("0.00");

            for (codigo = 1; codigo != 0; codigo++) {
                 kWh = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
                 tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1-residencial, 2-comercial, 3-industrial):"));

            while (tipo < 1 || tipo > 3) {
                   JOptionPane.showMessageDialog(null, "Tipo de consumidor inválido! Digite 1, 2 ou 3.");
                   tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1-residencial, 2-comercial, 3-industrial):"));
            }

            switch (tipo) {
                case 1:
                    custoTotal = kWh * 0.3;
                    break;
                case 2:
                    custoTotal = kWh * 0.5;
                    break;
                case 3:
                    custoTotal = kWh * 0.7;
                    break;
            }

            custoComercial += custoTotal;
            custoIndustrial += custoTotal;
            //Mostrando o resulado
            JOptionPane.showMessageDialog(null, "O custo total para o consumidor " + codigo + " é: R$" + df.format(custoTotal));
        }

       
    }
}