package uniderp.escola.servico;

import java.util.ArrayList;

import uniderp.escola.dominio.Professor;
import uniderp.escola.repositorio.ProfessorRepositorio;

public class ProfessorSevico extends BaseGenericaServico<ProfessorRepositorio, Professor>{
    
    public ProfessorSevico(){
        this.repo = new ProfessorRepositorio();
        
    }

    @Override
    public Professor Inserir(Professor dados) {
        return this.repo.Create(dados);
    }

    @Override
    public Professor Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Professor> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Professor Atualizar(Professor dados) {
        return this.repo.Update(dados);
    }

    @Override
    public Professor Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
