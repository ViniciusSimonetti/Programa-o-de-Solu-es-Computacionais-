import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Adicionar caixa\n" +
                    "2. Remover caixa\n" +
                    "3. Procurar caixa\n" +
                    "4. Mudar caixa\n" +
                    "5. Listar caixas mais pesadas\n" +
                    "6. Sair"
            ));

            switch (opcao) {
                case 1:
                    adicionarCaixa(deposito);
                    break;
                // ... outros casos ...
            }
        } while (opcao != 6);
    }

    // Métodos para cada opção do menu
    private static void adicionarCaixa(Deposito deposito) {
        // ... código para adicionar uma caixa
    }
    // ... outros métodos ...
}