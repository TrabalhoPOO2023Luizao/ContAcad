
import uniderp.escola.dominio.Aluno;
import uniderp.escola.servico.AlunoServico;

public class App {
    public static void main(String[] args) {
        AlunoServico serv = new AlunoServico();
            for (Aluno aluno : serv.Listar()) {
            System.out.println("-----------------------------------");
            aluno.Imprimir();
        }

    }
}