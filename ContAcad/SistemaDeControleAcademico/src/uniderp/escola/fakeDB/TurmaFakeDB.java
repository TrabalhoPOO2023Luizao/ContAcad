package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Turma;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma>{

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Turma>();
    }
    public TurmaFakeDB(){
        super();
    }
}
