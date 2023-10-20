package uniderp.escola.repositorio;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.dominio.Disciplina;
import uniderp.escola.fakeDB.DisciplinaFakeDB;

public class DisciplinaRepositorio 
extends BaseGenericaRepositorio<DisciplinaFakeDB, Disciplina> {
    
    public DisciplinaRepositorio(){
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.gettabela();
    }

    @Override
    public Disciplina Create(Disciplina item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public Disciplina Read(int codigo) {
        for (Disciplina disciplina : this.dataset) {
            if (disciplina.getCodigo() == codigo)
            return disciplina;
        }
        return null;
    }

    @Override
    public Disciplina Update(Disciplina item) {
        Disciplina alvo = this.Read(item.getCodigo());
        alvo.setCodigo(item.getCodigo());
        alvo.setNome(item.getNome());
        alvo.setEmenta(item.getEmenta());
        return alvo;
    }

    @Override
    public Disciplina Delete(int codigo) {
        Disciplina alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
