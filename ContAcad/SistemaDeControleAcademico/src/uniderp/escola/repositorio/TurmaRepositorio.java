package uniderp.escola.repositorio;

import uniderp.escola.dominio.Turma;
import uniderp.escola.fakeDB.TurmaFakeDB;

public class TurmaRepositorio 
extends BaseGenericaRepositorio<TurmaFakeDB, Turma>{
    
    public TurmaRepositorio(){
        this.db = new TurmaFakeDB();
        this.dataset = this.db.gettabela();
    }

    @Override
    public Turma Create(Turma item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public Turma Read(int codigo) {
        for (Turma turma : this.dataset) {
            if (turma.getCodigo() == codigo)
            return turma;
        }
        return null;
    }    

    @Override
    public Turma Update(Turma item) {
        Turma alvo = this.Read(item.getCodigo());
        alvo.setCodigo(item.getCodigo());
        alvo.setCapacidadeTurma(item.getCapacidadeTurma());
        alvo.setDisciplina(item.getDisciplina());
        alvo.setProfessor(item.getProfessor());
        return alvo;
    }

    @Override
    public Turma Delete(int codigo) {
        Turma  alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
