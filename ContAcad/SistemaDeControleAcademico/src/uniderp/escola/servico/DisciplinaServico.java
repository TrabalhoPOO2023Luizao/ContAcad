package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.Disciplina;
import uniderp.escola.repositorio.DisciplinaRepositorio;

public class DisciplinaServico extends BaseGenericaServico<DisciplinaRepositorio, Disciplina>{

    public DisciplinaServico(){
        this.repo = new DisciplinaRepositorio();
    }

    @Override
    public Disciplina Inserir(Disciplina dados) {
        return this.repo.Create(dados);
    }

    @Override
    public Disciplina Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Disciplina> Listar() {
        return this.repo.ReadAll();    
    }

    @Override
    public Disciplina Atualizar(Disciplina dados) {
        return this.repo.Update(dados);
    }

    @Override
    public Disciplina Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
