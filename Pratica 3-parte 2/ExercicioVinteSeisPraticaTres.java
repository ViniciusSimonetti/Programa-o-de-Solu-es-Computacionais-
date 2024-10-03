import javax.swing.JOptionPane;

public class ExercicioVinteSeisPraticaTres {
    public static void main(String[] args) {
        double num1, num2, resultado = 0; // Inicializa resultado com 0
        int opcao;

        do {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String menu = "Operações Disponíveis:\n" +
                    "1. Adição\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n" +
                    "9. Sair do Programa\n" +
                    "Digite o número da opção desejada:";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

            // Exibir o resultado apenas se for uma operação válida e o divisor for diferente de zero
            if (opcao >= 1 && opcao <= 4 && num2 != 0) {
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }
        } while (opcao != 9);
    }
}