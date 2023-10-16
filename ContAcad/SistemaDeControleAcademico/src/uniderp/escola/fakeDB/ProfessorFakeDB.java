package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
    }
    public ProfessorFakeDB(){
        super();
    }
}
