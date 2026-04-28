package service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.Aluno;


public class SistemaService {
    
    private ArrayList<Aluno>alunos = new ArrayList <>();

    public void cadastrarAluno(Aluno Aluno) {
        alunos.add(Aluno);
    }

    public void listarAlunos () {
        if (alunos.isEmpty()){
           System.out.println("Nenhum Aluno Cadastrado.");
        } 
        else {
            for (Aluno a : alunos){
                System.out.println(a);
            }
        }
    }
}
