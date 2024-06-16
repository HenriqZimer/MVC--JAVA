package View;

public class AlunoView extends PessoaView {
    public void printAlunoDetails(String nome, String cpf, String matricula) {
        printPessoaDetails(nome, cpf);
        System.out.println("Matrícula: " + matricula);
    }
}
