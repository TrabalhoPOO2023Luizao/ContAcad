
import java.time.LocalDate;

import javax.net.ssl.TrustManager;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.fakeDB.AlunoFakeDB;
import uniderp.escola.fakeDB.DisciplinaFakeDB;
import uniderp.escola.fakeDB.NotaTrabalhoFakeDB;
import uniderp.escola.fakeDB.ProfessorFakeDB;
import uniderp.escola.fakeDB.TrabalhoFakeDB;
import uniderp.escola.fakeDB.TurmaFakeDB;
import uniderp.escola.servico.AlunoServico;


public class App {
    public static void main(String[] args) {
        // AlunoServico serv = new AlunoServico();
        // Aluno aluno = new Aluno(02, "Allan", LocalDate.of(2000, 02, 10), "allan 02", "1234", 2);

        // serv.Inserir(aluno);

        //     for (Aluno listaAluno : serv.Listar()) {
        //     System.out.println("-----------------------------------");
        //     listaAluno.Imprimir();
        // }
        // DisciplinaFakeDB disciplina = new DisciplinaFakeDB();

        // TurmaFakeDB turma = new TurmaFakeDB();

        // TrabalhoFakeDB trab = new TrabalhoFakeDB();

        NotaTrabalhoFakeDB  nota = new NotaTrabalhoFakeDB();

        int i;
        for(i=0;i<nota.gettabela().size();i++){
            if(nota.gettabela().get(i).getAluno().getCodigo() == 1){
                System.out.println(" - Notas do Eber: " + nota.gettabela().get(i).getNota());
            }
        }
    }
}