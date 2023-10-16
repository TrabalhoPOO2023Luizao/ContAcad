package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.NotaTrabalho;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<NotaTrabalho>();
    }
    public NotaTrabalhoFakeDB(){
        super();
    }
}
