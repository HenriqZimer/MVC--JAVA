package Controller;

import Model.Aluno;
import View.AlunoView;

public class AlunoController extends PessoaController {
    public AlunoController(Aluno model, AlunoView view) {
        super(model, view);
    }

    public void setAlunoMatricula(String matricula) {
        ((Aluno) getModel()).setMatricula(matricula);
    }

    public String getAlunoMatricula() {
        return ((Aluno) getModel()).getMatricula();
    }

    @Override
    public void updateView() {
        Aluno model = (Aluno) getModel();
        AlunoView view = (AlunoView) getView();
        view.printAlunoDetails(model.getNome(), model.getCpf(), model.getMatricula());
    }
}
