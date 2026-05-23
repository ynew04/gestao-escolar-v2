package model;

import java.util.ArrayList;

public class Turma{

    private String nomeTurma;
    private ArrayList<Aluno> alunos;

    public Turma (String nomeTurma){

        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();


    }

    public void adicionarAluno( Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public String getNomeTurma(){
        return nomeTurma;
    }

    @Override
    public String toString (){
        return "Turma: " + nomeTurma;
    }
}