package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.Turma;
import uniderp.escola.repositorio.TurmaRepositorio;

public class TurmaServico extends BaseGenericaServico<TurmaRepositorio, Turma> {
    
    public TurmaServico(){
        this.repo = new TurmaRepositorio();
    }

    @Override
    public Turma Inserir(Turma dados) {
        return this.repo.Create(dados); 
    }

    @Override
    public Turma Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Turma> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Turma Atualizar(Turma dados) {
        return this.repo.Update(dados);
    }

    @Override
    public Turma Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
