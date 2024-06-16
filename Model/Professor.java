package Model;

public class Professor extends Pessoa {
    private String departamento;

    public Professor(String nome, String cpf, String departamento) {
        super(nome, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Departamento: " + departamento;
    }
}
