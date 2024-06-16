package Controller;

import Model.Pessoa;
import View.PessoaView;

public class PessoaController {
    private Pessoa model;
    private PessoaView view;

    public PessoaController(Pessoa model, PessoaView view) {
        this.model = model;
        this.view = view;
    }

    public Pessoa getModel() {
        return model;
    }

    public PessoaView getView() {
        return view;
    }

    public void setPessoaNome(String nome) {
        model.setNome(nome);
    }

    public String getPessoaNome() {
        return model.getNome();
    }

    public void setPessoaCpf(String cpf) {
        model.setCpf(cpf);
    }

    public String getPessoaCpf() {
        return model.getCpf();
    }

    public void updateView() {
        view.printPessoaDetails(model.getNome(), model.getCpf());
    }
}
