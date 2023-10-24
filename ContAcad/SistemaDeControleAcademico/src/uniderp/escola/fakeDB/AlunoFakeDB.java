package uniderp.escola.fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.escola.dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Aluno>();
        this.tabela.add(new Aluno(1, "eber", LocalDate.of(2001, 02, 22), "eberrennan", "1234", 01));
    }
    public AlunoFakeDB(){
        super();
    }
}
