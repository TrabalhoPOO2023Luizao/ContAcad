package uniderp.escola.fakeDB;

import java.util.ArrayList;
import java.util.Random;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.dominio.NotaTrabalho;
import uniderp.escola.dominio.Trabalho;

public class NotaTrabalhoFakeDB extends BaseGenericaFakeDB<NotaTrabalho> {

    private AlunoFakeDB aluno = new AlunoFakeDB();
    private TrabalhoFakeDB trabalho = new TrabalhoFakeDB();
    ArrayList<Aluno> alunos;
    ArrayList<Trabalho> trabalhos;

    public NotaTrabalhoFakeDB(){
        super();
        aluno.CarregarDados();
        trabalho.CarregarDados();
        alunos = aluno.gettabela();
        trabalhos = trabalho.gettabela();
        CarregarDados();
    }

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<NotaTrabalho>();
        ArrayList<Trabalho> trabalhosMat = new ArrayList<>();
        ArrayList<Trabalho> trabalhosPort = new ArrayList<>();
        ArrayList<Trabalho> trabalhosIng = new ArrayList<>();
        ArrayList<Trabalho> trabalhosGeo = new ArrayList<>();
        Random random = new Random();
        int i, j;

        for(Trabalho trab : trabalhos){
            if(trab.getDisciplina().getCodigo() == 1){
                trabalhosMat.add(trab);
            }
            if(trab.getDisciplina().getCodigo() == 2){
                trabalhosPort.add(trab);
            }
            if(trab.getDisciplina().getCodigo() == 3){
                trabalhosIng.add(trab);
            }
            if(trab.getDisciplina().getCodigo() == 4){
                trabalhosGeo.add(trab);
            }
        }
       
        this.tabela = new ArrayList<NotaTrabalho>();

        for(i=0; i < alunos.size(); i++){
            for(j = 0; j < trabalhosMat.size(); j++){
                    NotaTrabalho NotaMat = new NotaTrabalho(i, alunos.get(i), trabalhosMat.get(j), random.nextDouble(11));
                    tabela.add(NotaMat);
            }
            for(j = 0; j < trabalhosPort.size(); j++){
                    NotaTrabalho NotaPort = new NotaTrabalho(i, alunos.get(i), trabalhosPort.get(j), random.nextDouble(11));
                    tabela.add(NotaPort);
            }
            for(j = 0; j < trabalhosIng.size(); j++){
                
                    NotaTrabalho NotaIng = new NotaTrabalho(i, alunos.get(i), trabalhosIng.get(j), random.nextDouble(11));
                    tabela.add(NotaIng);
            }    
            for(j = 0; j < trabalhosGeo.size(); j++){
                    NotaTrabalho NotaGeo = new NotaTrabalho(i, alunos.get(i), trabalhosGeo.get(j), random.nextDouble(11));
                    tabela.add(NotaGeo);
            }
        }
    }
  
}
