public class Cliente {
    private String nome;
    private String telefone;
    private int id;

    // Construtor
    public Cliente(String nome, String telefone, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // ... outros getters e setters ...

    // Método toString para facilitar a impressão
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}