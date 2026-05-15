package service;


import java.util.ArrayList;
import model.Aluno;
import model.Professor;


public class SistemaService {
    
    private ArrayList<Aluno>alunos = new ArrayList <>();
    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
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

    public void cadastrarProfessor (Professor professor){
        professores.add(professor);
    }

        public void listarProfessores() {
    if (professores.isEmpty()) {
        System.out.println("Nenhum professor cadastrado.");
    } else {
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }
}
    
    
}
