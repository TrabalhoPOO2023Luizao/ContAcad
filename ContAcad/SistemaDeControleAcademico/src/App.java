
import java.time.LocalDate;

import uniderp.escola.dominio.Aluno;


import uniderp.escola.servico.AlunoServico;


public class App {
    public static void main(String[] args) {
        AlunoServico serv = new AlunoServico();
        Aluno aluno = new Aluno(02, "Allan", LocalDate.of(2000, 02, 10), "allan 02", "1234", 2);

        serv.Inserir(aluno);

            for (Aluno listaAluno : serv.Listar()) {
            System.out.println("-----------------------------------");
            listaAluno.Imprimir();
        }

    }
}