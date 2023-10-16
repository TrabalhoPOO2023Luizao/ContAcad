package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Aluno>();
    }
    public AlunoFakeDB(){
        super();
    }
}
