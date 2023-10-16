package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Trabalho>();
    }
    public TrabalhoFakeDB(){
        super();
    }
}
