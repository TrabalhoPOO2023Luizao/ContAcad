package uniderp.escola.repositorio;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.dominio.Professor;
import uniderp.escola.fakeDB.ProfessorFakeDB;

public class ProfessorRepositorio 
extends BaseGenericaRepositorio<ProfessorFakeDB, Professor>{
    
    public ProfessorRepositorio(){
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.gettabela();
    }

    @Override
    public Professor Create(Professor item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public Professor Read(int codigo) {
        for (Professor professor : this.dataset) {
            if (professor.getCodigo() == codigo)
            return professor;
        }
        return null;
    }

    @Override
    public Professor Update(Professor item) {
        Professor alvo = this.Read(item.getCodigo());
        alvo.setCodigo(item.getCodigo());
        alvo.setNome(item.getNome());
        alvo.setDataNascimento(item.getDataNascimento());
        alvo.setNomeUsuario(item.getNomeUsuario());
        alvo.setSenha(item.getSenha());
        alvo.setCargo(item.getCargo());
        return alvo;
    }

    @Override
    public Professor Delete(int codigo) {
        Professor alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
