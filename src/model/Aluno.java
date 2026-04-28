package model;

public class Aluno {
    private String nome;
     private int idade;
     private String matricula;

     public Aluno (String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
     }


     public String getnome () {
        return nome;
     }

     public String getMatricula () {

        return matricula;
     }

     
     

    @Override 
     public String toString (){
        return "Aluno: " + nome + " | Matrícula: " + matricula;
     }
}

     