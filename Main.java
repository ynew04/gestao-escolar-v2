import java.util.Scanner;

import model.Aluno;
import service.SistemaService;

public class Main {
    
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        SistemaService sistema = new SistemaService();

        int opcao;

        do {
            System.out.println("\n ==== Menu ====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("0 - Sair..");
            System.out.println("Escolha: ");

            opcao = Integer.parseInt(entradaUsuario.nextLine());

            if (opcao ==1){if (opcao == 1) {
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
}}
            if (opcao ==2) {
                sistema.listarAlunos();
            }

        } while ( opcao != 0);

        entradaUsuario.close(); 
    }

    
}
