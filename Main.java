import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.AlunoController;
import Controller.ProfessorController;
import Model.Aluno;
import Model.Professor;
import View.ProfessorView;
import View.AlunoView;

public class Main {
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Menu Principal:");
            System.out.println("1 - Cadastrar um Aluno");
            System.out.println("2 - Cadastrar um Professor");
            System.out.println("3 - Exibir todos os Alunos");
            System.out.println("4 - Exibir todos os Professores");
            System.out.println("5 - Sair");
            System.out.print("Digite a sua escolha: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    cadastrarProfessor(scanner);
                    break;
                case 3:
                    exibirAlunos();
                    break;
                case 4:
                    exibirProfessores();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }

    private static void cadastrarAluno(Scanner scanner) {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do aluno:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();

        Aluno aluno = new Aluno(nome, cpf, matricula);
        alunos.add(aluno);
        AlunoView alunoView = new AlunoView();
        AlunoController alunoController = new AlunoController(aluno, alunoView);
        alunoController.updateView();
    }

    private static void cadastrarProfessor(Scanner scanner) {
        System.out.println("Digite o nome do professor:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do professor:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o departamento do professor:");
        String departamento = scanner.nextLine();

        Professor professor = new Professor(nome, cpf, departamento);
        professores.add(professor);
        ProfessorView professorView = new ProfessorView();
        ProfessorController professorController = new ProfessorController(professor, professorView);
        professorController.updateView();
    }

    private static void exibirAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    private static void exibirProfessores() {
        System.out.println("Lista de Professores:");
        for (Professor p : professores) {
            System.out.println(p);
        }
    }
}
