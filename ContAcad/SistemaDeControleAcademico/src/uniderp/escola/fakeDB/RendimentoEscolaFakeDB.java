package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.RendimentoEscola;

public class RendimentoEscolaFakeDB  extends BaseGenericaFakeDB<RendimentoEscola>{

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<RendimentoEscola>();
    }
    public RendimentoEscolaFakeDB(){
        super();
    }
}
