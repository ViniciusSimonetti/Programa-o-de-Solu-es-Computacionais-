import java.util.Scanner;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Inserir uma nota");
            System.out.println("2. Remover uma nota");
            System.out.println("3. Alterar uma nota");
            System.out.println("4. Listar todas as notas");
            System.out.println("5. Sair do sistema");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nota: ");
                    String novaNota = scanner.nextLine();
                    bloco.inserirNota(novaNota);
                    break;
                case 2:
                    System.out.print("Digite o índice da nota a ser removida: ");
                    int indiceRemocao = scanner.nextInt();
                    bloco.removerNota(indiceRemocao);
                    break;
                case 3:
                    System.out.print("Digite o índice da nota a ser alterada: ");
                    int indiceAlteracao = scanner.nextInt();
                    System.out.print("Digite a nova nota: ");
                    String novaNotaAlteracao = scanner.nextLine();
                    bloco.removerNota(indiceAlteracao);
                    bloco.inserirNota(indiceAlteracao, novaNotaAlteracao);
                    break;
                case 4:
                    bloco.imprimirNotas();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}