package menu;

import java.util.Scanner;

import model.Aluno;
import model.Turma;
import service.SistemaService;

public class MenuTurma {

    public void abrirMenu(Scanner entradaUsuario, SistemaService sistema){

        System.out.println("\n=== MENU TURMA ===");

        int opcao;

        do {
            System.out.println("5 - Cadastrar Turma");
            System.out.println("6 - Listar Turmas");
            System.out.println("7 - Adicionar Aluno na turma");
            System.out.println("8 - Listar alunos da turma");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(entradaUsuario.nextLine());

            if (opcao ==5) {
                System.out.println("Nome da turma: "); 
                String nomeTurma = entradaUsuario.nextLine();

                Turma turma = new Turma(nomeTurma);

                sistema.cadastrarTurma(turma);

                System.out.println("Turma cadastrada com sucesso!");
            }

            if (opcao==6) {
                sistema.listarTurmas();
            }

            if (opcao==7) {
                System.out.println("Nome da turma: ");
                 String nomeTurma = entradaUsuario.nextLine();

                 Turma turma = sistema.buscarTurma(nomeTurma);

                 if (turma==null) {
                    System.out.println("Turma não encontrada.");
                    
                 } else {
                    System.out.println("Matríula do aluno");
                    String matricula = entradaUsuario.nextLine();

                    Aluno aluno = sistema.buscarAluno(matricula);

                    if (aluno==null) {
                        System.out.println("Aluno não encontrado");
                        
                    } else {

                        turma.adicionarAluno(aluno);

                        System.out.println("Aluno adicionado a turma com sucesso!");
                    }
                 }
                
            }
            
            if (opcao==8) {
                System.out.println("Nome da turma: ");
                 String nomeTurma = entradaUsuario.nextLine();

                 Turma turma = sistema.buscarTurma(nomeTurma);

                 if (turma==null) {
                    System.out.println("Turma não encontrada.");
            } else {
                
                System.out.println("\n Alunos da turma: " + turma.getNomeTurma());

                turma.listarAlunos();
            }

         }
        } while (opcao != 0);
    }
}