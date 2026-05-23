import java.util.Scanner;

import menu.MenuTurma;
import menu.MenuProfessor;
import menu.MenuAluno;
import model.Aluno;
import service.SistemaService;
import model.Professor;
import model.Turma;

public class Main {
    
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        SistemaService sistema = new SistemaService();
        MenuAluno menualuno = new MenuAluno();
        MenuProfessor menuProfessor = new MenuProfessor();
        MenuTurma menuTurma = new MenuTurma();

        int opcao;

        do {
            System.out.println("\n ==== SISTEMA ====");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Turma");
            System.out.println("0 - Sair..");
            System.out.println("Escolha: ");

            opcao = Integer.parseInt(entradaUsuario.nextLine());

            

            

            
         if (opcao==1) {
            
            menualuno.abrirMenu(entradaUsuario, sistema);
         }

         if(opcao == 2){

    menuProfessor.abrirMenu(entradaUsuario, sistema);
         }

         if (opcao==3) {

            menuTurma.abrirMenu(entradaUsuario, sistema);
         }

        } while ( opcao != 0);

        entradaUsuario.close(); 
    }

    
}
