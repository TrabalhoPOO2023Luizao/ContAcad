package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.Trabalho;
import uniderp.escola.repositorio.TrabalhoRepositorio;

public class TrabalhoSevico extends BaseGenericaServico<TrabalhoRepositorio, Trabalho> {

    public TrabalhoSevico(){
        this.repo = new TrabalhoRepositorio();
        
    }

    @Override
    public Trabalho Inserir(Trabalho dados) {
       return this.repo.Create(dados);
    }

    @Override
    public Trabalho Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Trabalho> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Trabalho Atualizar(Trabalho dados) {
        return this.repo.Update(dados);
    }

    @Override
    public Trabalho Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
