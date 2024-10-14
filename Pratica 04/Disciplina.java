import javax.swing.JOptionPane;

public class Disciplina {
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    //Construtor padrão
    public Disciplina() {
    }

    //Construtor com todos os atributos
    public Disciplina(String nome, String professor, int semestre, boolean ofertada) {
        this.nome = nome;
        this.professor = professor;
        this.semestre = semestre;
        this.ofertada = ofertada;
    }

    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    //Método para exibir as informações da disciplina
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Disciplina: " + nome + "\n" +
                                            "Professor: " + professor + "\n" +
                                            "Semestre: " + semestre + "\n" +
                                            "Ofertada: " + ofertada);
    }
}