package Controller;

import Model.Professor;
import View.ProfessorView;

public class ProfessorController extends PessoaController {
    public ProfessorController(Professor model, ProfessorView view) {
        super(model, view);
    }

    public void setProfessorDepartamento(String departamento) {
        ((Professor) getModel()).setDepartamento(departamento);
    }

    public String getProfessorDepartamento() {
        return ((Professor) getModel()).getDepartamento();
    }

    @Override
    public void updateView() {
        Professor model = (Professor) getModel();
        ProfessorView view = (ProfessorView) getView();
        view.printProfessorDetails(model.getNome(), model.getCpf(), model.getDepartamento());
    }
}
