package View;
public class ProfessorView extends PessoaView {
    public void printProfessorDetails(String nome, String cpf, String departamento) {
        printPessoaDetails(nome, cpf);
        System.out.println("Departamento: " + departamento);
    }
}
