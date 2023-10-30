package uniderp.escola.fakeDB;

import java.util.ArrayList;

import uniderp.escola.dominio.Disciplina;
import uniderp.escola.dominio.Trabalho;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    private DisciplinaFakeDB disciplina = new DisciplinaFakeDB();
    private ArrayList<Disciplina> disciplinas;

    public TrabalhoFakeDB(){
        super();
        disciplina.CarregarDados();
        disciplinas = disciplina.gettabela();
        CarregarDados();
    }

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Trabalho>();
        // disciplina.CarregarDados();
        // disciplinas = disciplina.gettabela();
        Trabalho TrabMat1 = new Trabalho(1, disciplinas.get(0), "Trabalho 1");
        Trabalho TrabMat2 = new Trabalho(2, disciplinas.get(0), "Trabalho 2");
        Trabalho TrabMat3 = new Trabalho(3, disciplinas.get(0), "Trabalho 3");
        Trabalho TrabMat4 = new Trabalho(4, disciplinas.get(0), "Trabalho 4");

        Trabalho TrabPort1 = new Trabalho(1, disciplinas.get(1), "Trabalho 1");
        Trabalho TrabPort2 = new Trabalho(2, disciplinas.get(1), "Trabalho 2");
        Trabalho TrabPort3 = new Trabalho(3, disciplinas.get(1), "Trabalho 3");
        Trabalho TrabPort4 = new Trabalho(4, disciplinas.get(1), "Trabalho 4");

        Trabalho TrabIng1 = new Trabalho(1, disciplinas.get(2), "Trabalho 1");
        Trabalho TrabIng2 = new Trabalho(2, disciplinas.get(2), "Trabalho 2");
        Trabalho TrabIng3 = new Trabalho(3, disciplinas.get(2), "Trabalho 3");
        Trabalho TrabIng4 = new Trabalho(4, disciplinas.get(2), "Trabalho 4");

        Trabalho TrabGeo1 = new Trabalho(1, disciplinas.get(3), "Trabalho 1");
        Trabalho TrabGeo2 = new Trabalho(2, disciplinas.get(3), "Trabalho 2");
        Trabalho TrabGeo3 = new Trabalho(3, disciplinas.get(3), "Trabalho 3");
        Trabalho TrabGeo4 = new Trabalho(4, disciplinas.get(3), "Trabalho 4");

        tabela.add(TrabMat1);
        tabela.add(TrabMat2);
        tabela.add(TrabMat3);
        tabela.add(TrabMat4);

        tabela.add(TrabPort1);
        tabela.add(TrabPort2);
        tabela.add(TrabPort3);
        tabela.add(TrabPort4);

        tabela.add(TrabIng1);
        tabela.add(TrabIng2);
        tabela.add(TrabIng3);
        tabela.add(TrabIng4);

        tabela.add(TrabGeo1);
        tabela.add(TrabGeo2);
        tabela.add(TrabGeo3);
        tabela.add(TrabGeo4);
        
    }
        
   
}
