
public class Pessoa 
{ 
    private String nome; 
    private int idade;
    private String endereco;
    private String telefone;

    //Método construtor 
    public Pessoa(String nome, int idade , String endereco, String telefone)
    {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }   


//Método getters 
    public String getNome()
 {   return nome;
 }
 
    public int getIdade()
   { return idade;
   }
   public String getEndereco()
 {   return endereco;
 }
 
    public String getTelefone()
   { return telefone;
   }

    public void setNome(String string) {
       
    }

}