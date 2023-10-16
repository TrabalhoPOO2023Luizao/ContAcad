package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Disciplina>();
    }
    public DisciplinaFakeDB(){
        super();
    }
}
