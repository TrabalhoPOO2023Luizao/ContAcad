package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.NotaTrabalho;
import uniderp.escola.repositorio.NotaTrabalhoRepositorio;

public class NotaTrabalhoServico  
extends BaseGenericaServico<NotaTrabalhoRepositorio, NotaTrabalho>{
    
    public NotaTrabalhoServico(){
        this.repo = new NotaTrabalhoRepositorio();
    }

    @Override
    public NotaTrabalho Inserir(NotaTrabalho dados) {
        return this.repo.Create(dados);
    }

    @Override
    public NotaTrabalho Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<NotaTrabalho> Listar() {
        return this.repo.ReadAll(); 
    }

    @Override
    public NotaTrabalho Atualizar(NotaTrabalho dados) {
        return this.repo.Update(dados);
    }

    @Override
    public NotaTrabalho Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

}
