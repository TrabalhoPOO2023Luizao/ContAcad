package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.RendimentoEscola;
import uniderp.escola.repositorio.RendimentoEscolarRepositorio;

public class RendimentoEscolaSevico extends BaseGenericaServico<RendimentoEscolarRepositorio, RendimentoEscola> {
    
    public RendimentoEscolaSevico(){
        this.repo = new RendimentoEscolarRepositorio();
    }

    @Override
    public RendimentoEscola Inserir(RendimentoEscola dados) {
        return this.repo.Create(dados);
    }

    @Override
    public RendimentoEscola Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<RendimentoEscola> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public RendimentoEscola Atualizar(RendimentoEscola dados) {
        return this.repo.Update(dados);
    }

    @Override
    public RendimentoEscola Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
