package uniderp.escola.fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.escola.dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Aluno>();
        Aluno eber = new Aluno(1, "Eber", LocalDate.of(2004, 02, 22), "eberrennan", "1234", 01);
        Aluno allan = new Aluno(2, "Allan", LocalDate.of(2004, 9, 02), "AllanAugusto", "1234", 01);
        Aluno diogo = new Aluno(3, "Diogo", LocalDate.of(2003, 02, 22), "Diogo", "1234", 01);
        Aluno breno = new Aluno(4, "Breno", LocalDate.of(2004, 02, 22), "Brenin", "1234", 01);
        
        tabela.add(eber);
        tabela.add(allan);
        tabela.add(diogo);
        tabela.add(breno);
       
    }
    public AlunoFakeDB(){
        super();
        CarregarDados();
    }
}
