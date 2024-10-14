public class Turma {
    private String nome;
    private int numeroAlunos;

    // Construtor
    public Turma(String nome, int numeroAlunos) {
        this.nome = nome;
        this.numeroAlunos = numeroAlunos;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    // Método para exibir os dados da turma
    public void exibirDados() {
        System.out.println("Nome da turma: " + nome);
        System.out.println("Número de alunos: " + numeroAlunos);
    }
}