//Pratica 3 == Exercicio 24) ====> estudar este programa 
import javax.swing.JOptionPane;

public class ExercicioVinteQuatroPraticaTres {
                    public static void main(String[] args) {
                             double total = 0;
                             int quantidade;
                             double preco;

        do {
            String quantidadeString = JOptionPane.showInputDialog("Digite a quantidade de itens comprados (0 para finalizar):");
            quantidade = Integer.parseInt(quantidadeString);

            if (quantidade < 0) {
                JOptionPane.showMessageDialog(null, "Quantidade inválida. Digite um valor positivo ou zero para finalizar.");
                continue;
            }

            if (quantidade > 0) {
                String precoString = JOptionPane.showInputDialog("Digite o preço unitário do item:");
                preco = Double.parseDouble(precoString);

                while (preco < 0) {
                    JOptionPane.showMessageDialog(null, "Preço inválido. Digite um valor positivo.");
                    precoString = JOptionPane.showInputDialog("Digite o preço unitário do item:");
                    preco = Double.parseDouble(precoString);
                }

                total += quantidade * preco;
            }
        } while (quantidade != 0);

        JOptionPane.showMessageDialog(null, "O valor total a ser pago é: R$" + total);
    }
}