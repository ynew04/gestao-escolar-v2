import java.util.Scanner;

import model.Aluno;
import service.SistemaService;
import model.Professor;

public class Main {
    
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        SistemaService sistema = new SistemaService();

        int opcao;

        do {
            System.out.println("\n ==== Menu ====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Listar Professores");
            System.out.println("0 - Sair..");
            System.out.println("Escolha: ");

            opcao = Integer.parseInt(entradaUsuario.nextLine());

            if (opcao ==1) {
    System.out.print("Nome: ");
    String nome = entradaUsuario.nextLine();

    System.out.print("Idade: ");
    String idadeTexto = entradaUsuario.nextLine();
    int idade = Integer.parseInt(idadeTexto);

    System.out.print("Matrícula: ");
    String matricula = entradaUsuario.nextLine();

    Aluno aluno = new Aluno(nome, idade, matricula);
    sistema.cadastrarAluno(aluno);

    System.out.println("\nAluno cadastrado com sucesso!");
}
            if (opcao ==2) {
                sistema.listarAlunos();
            }

            if (opcao ==3){
                System.out.println("Nome: ");
                String nome = entradaUsuario.nextLine ();

                System.out.println("Matéria: ");
                String materia = entradaUsuario.nextLine ();

                System.out.println("Registro: ");
                String registro = entradaUsuario.nextLine ();

                Professor professor = new Professor(nome, materia, registro);
                sistema.cadastrarProfessor(professor);

                System.out.println("\nProfessor cadastrado com sucesso!");
            }

            if (opcao ==4) {
                sistema.listarProfessores();
                
            }

        } while ( opcao != 0);

        entradaUsuario.close(); 
    }

    
}
