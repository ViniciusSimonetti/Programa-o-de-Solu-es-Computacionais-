public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 30, "Rua das Flores, 123", "(11) 98765-4321");

        // Assert: Nome
        if (!"João".equals(pessoa.getNome())) {
            System.out.println("Erro: Nome incorreto. Esperado: João, Obtido: " + pessoa.getNome());
        
        }

        // Assert: Idade
        if (pessoa.getIdade() != 30) {
            System.out.println("Erro: Idade incorreta. Esperado: 30, Obtido: " + pessoa.getIdade());
        }

        // ... outros asserts

        // Modificando o nome
        pessoa.setNome("Maria");

        // Assert: Nome após modificação
        if (!"Maria".equals(pessoa.getNome())) {
            System.out.println("Erro: Nome não foi alterado corretamente. Esperado: Maria, Obtido: " + pessoa.getNome());
        }
    }
}