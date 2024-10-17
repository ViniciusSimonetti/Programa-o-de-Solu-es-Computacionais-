public class Atribuicao { 

     //Atributos do objeto 
     private Professor professor;
     private Disciplina disciplina;
     
     //Construtor 
     public Atribuicao (Professor professor, Disciplina disciplina){
                this.professor = professor;
                this.disciplina = disciplina; 
    
     }  
     //Método de acesso 
     public Professor getProfessor(){
           return professor;
     } 
     //Método de acesso 
     public Disciplina getDisciplina(){ 
            return disciplina;
     } 
     //Metodo modificador 
     public void setProfessor(Professor professor){ 
        this.professor = professor;
    }
    public void setDisciplina(Disciplina disciplina){  
        this.disciplina = disciplina; 
    } 
    //Metodo getdados 
    public String getDados() {  
        return"Disciplina[professor=" +professor+", disciplina=" + disciplina + "]";  
}     
   
     



    
}
