package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Disciplina;
import uniderp.escola.dominio.Professor;
import uniderp.escola.dominio.Turma;

public class TurmaFakeDB extends BaseGenericaFakeDB<Turma>{

    
    private DisciplinaFakeDB disc1 = new DisciplinaFakeDB();
    private ProfessorFakeDB professor = new ProfessorFakeDB();
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    
    public TurmaFakeDB(){
        super();
        disc1.CarregarDados();
        professor.CarregarDados();
        disciplinas = disc1.gettabela();
        professores = professor.gettabela();
        CarregarDados();
    }

    @Override
    protected void CarregarDados() {
       
        this.tabela = new ArrayList<Turma>();
        Turma Grifinoria = new Turma(1, 30, disciplinas, professores);
        Turma LufaLufa = new Turma(2, 30, disciplinas, professores);
        Turma Corvinal = new Turma(3, 30, disciplinas, professores);
        Turma Sonserina = new Turma(4, 30, disciplinas, professores);
        

        tabela.add(Grifinoria);
        tabela.add(LufaLufa);
        tabela.add(Corvinal);
        tabela.add(Sonserina);

    }
  
}
