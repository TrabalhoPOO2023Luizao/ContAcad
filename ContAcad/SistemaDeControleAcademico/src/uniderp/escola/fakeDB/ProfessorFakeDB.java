package uniderp.escola.fakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.escola.dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
        Professor Noiza = new Professor(1, "Noiza", LocalDate.of(1970, 10, 10), "ProfNoiza", "1234", "Professor");
        Professor Luizao = new Professor(2, "Luizao", LocalDate.of(1970, 10, 9), "ProfLuizao", "4321", "Professor");
        Professor Paulo = new Professor(3, "Paulo", LocalDate.of(1970, 10, 8), "ProfPaulo", "1324", "Professor");
        Professor Simone = new Professor(4, "Simone", LocalDate.of(1970, 10, 7), "ProfSimone", "1432", "Professor");

        tabela.add(Noiza);
        tabela.add(Luizao);
        tabela.add(Paulo);
        tabela.add(Simone);
        
    }
    public ProfessorFakeDB(){
        super();
    }
}
