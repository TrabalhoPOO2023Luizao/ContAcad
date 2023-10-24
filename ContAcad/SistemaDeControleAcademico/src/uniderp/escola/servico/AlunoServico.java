package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.repositorio.AlunoRepositorio;

public class AlunoServico extends BaseGenericaServico<AlunoRepositorio, Aluno>{

    public AlunoServico(){
        this.repo = new AlunoRepositorio();
    }

    @Override
    public Aluno Inserir(Aluno dados) {
        return this.repo.Create(dados);
    }

    @Override
    public Aluno Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Aluno> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Aluno Atualizar(Aluno dados) {
        return this.repo.Update(dados);
    }

    @Override
    public Aluno Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
