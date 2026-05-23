package menu;

import java.util.Scanner;
import model.Professor;
import service.SistemaService;

public class MenuProfessor {
    public void abrirMenu(Scanner entradaUsuario, SistemaService sistema){

        System.out.println("\n===MENU PROFESSOR===");

        int opcao;
        do {
             System.out.println("3 - Cadastrar Professor");
             System.out.println("4 - Listar Professores");
             System.out.println("0 - Voltar");

             opcao = Integer.parseInt(entradaUsuario.nextLine());

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
        } while (opcao !=0); 
    }
}
