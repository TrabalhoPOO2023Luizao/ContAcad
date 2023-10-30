
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
        Menu menu = new Menu();
        menu.Executar();
    }
}