package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Disciplina;

public class DisciplinaFakeDB extends BaseGenericaFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Disciplina>();
        Disciplina matematica = new Disciplina(1, "Matematica", "Aprende-se sobre lógica e matemática");
        Disciplina portugues = new Disciplina(2, "Português", "Aprende-se sobre a lingua portuguesa");
        Disciplina ingles = new Disciplina(3, "Inglês", "Aprende-se sobre lingua inglesa");
        Disciplina geografia = new Disciplina(4, "Geografia", "Aprende-se sobre geografia");
        
        tabela.add(matematica);
        tabela.add(portugues);
        tabela.add(ingles);
        tabela.add(geografia);
    }
    
    public DisciplinaFakeDB(){
        super();
        CarregarDados();
    }
}
