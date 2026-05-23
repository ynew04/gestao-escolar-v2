package service;


import java.util.ArrayList;
import model.Aluno;
import model.Professor;
import model.Turma;


public class SistemaService {
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList <>();
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

    public void cadastrarTurma(Turma turma){
    turmas.add(turma);

    }

    public void listarTurmas(){
        if(turmas.isEmpty()){
            System.out.println("Nenhuma turma cadastrada.");
        } else {
            for (Turma turma : turmas){
                System.out.println(turma);
            }
        }
    }

    public Turma buscarTurma(String nomeTurma){

    for(Turma turma : turmas){

        if(turma.getNomeTurma().equalsIgnoreCase(nomeTurma)){
            return turma;
        }
    }

    return null;
}
    public Aluno buscarAluno(String matricula){

    for(Aluno aluno : alunos){

        if(aluno.getMatricula().equalsIgnoreCase(matricula)){
            return aluno;
        }
    }

    return null;
    }  

    
    

}
    
    


    
  

