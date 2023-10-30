package uniderp.escola.fakeDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import uniderp.escola.dominio.NotaTrabalho;
import uniderp.escola.dominio.RendimentoEscola;


public class RendimentoEscolaFakeDB  extends BaseGenericaFakeDB<RendimentoEscola>{

    AlunoFakeDB aluno = new AlunoFakeDB();
    TurmaFakeDB turma = new TurmaFakeDB();
    NotaTrabalhoFakeDB notas = new NotaTrabalhoFakeDB();
    ArrayList<NotaTrabalho> trabalhos;
    ArrayList<NotaTrabalho> trabalhosMat = new ArrayList<>();
    ArrayList<NotaTrabalho> trabalhosPort = new ArrayList<>();
    ArrayList<NotaTrabalho> trabalhosIng = new ArrayList<>();
    ArrayList<NotaTrabalho> trabalhosGeo = new ArrayList<>();

    Map<Integer,ArrayList<NotaTrabalho>> trabsmat = new HashMap<Integer,ArrayList<NotaTrabalho>>();

    public RendimentoEscolaFakeDB(){
        super();
        aluno.CarregarDados();
        turma.CarregarDados();
        notas.CarregarDados();
        trabalhos = notas.gettabela();
        CarregarDados();
    }

    Random random = new Random();
    int i;

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<RendimentoEscola>();
        // this.trabsmat.put(this.tabela., trabalhos)
        for(NotaTrabalho trab : trabalhos){
            if(trab.getTrabalho().getDisciplina().getCodigo() == 1){
                trabalhosMat.add(trab);
            }
            if(trab.getTrabalho().getDisciplina().getCodigo() == 2){
                trabalhosPort.add(trab);
            }
            if(trab.getTrabalho().getDisciplina().getCodigo() == 3){
                trabalhosIng.add(trab);
            }
            if(trab.getTrabalho().getDisciplina().getCodigo() == 4){
                trabalhosGeo.add(trab);
            }
        }
        
        int idturma = 0;
        // int qntdTurma = turma.gettabela().size();

        for(i=0; i < aluno.gettabela().size(); i++){

                    // Random random = new Random();
                    // int turmaAleatoria = random.nextInt(qntdTurma);

                    RendimentoEscola RendMat = new RendimentoEscola(i+1, aluno.gettabela().get(i), turma.gettabela().get(idturma), random.nextDouble(11), random.nextDouble(11), trabalhosMat);
                    tabela.add(RendMat);
                   
                    RendimentoEscola RendPort = new RendimentoEscola(i+1, aluno.gettabela().get(i), turma.gettabela().get(idturma), random.nextDouble(11), random.nextDouble(11), trabalhosPort);
                    tabela.add(RendPort);
                   
                    RendimentoEscola RendIng = new RendimentoEscola(i+1, aluno.gettabela().get(i), turma.gettabela().get(idturma), random.nextDouble(11), random.nextDouble(11), trabalhosIng);
                    tabela.add(RendIng);
                    
                    RendimentoEscola RendGeo = new RendimentoEscola(i+1, aluno.gettabela().get(i), turma.gettabela().get(idturma), random.nextDouble(11), random.nextDouble(11), trabalhosGeo);
                    tabela.add(RendGeo);
                    if(idturma == turma.gettabela().size() - 1){
                        idturma = 0;
                    } else idturma++;
        }
            
            
            
            
    }
    
}
