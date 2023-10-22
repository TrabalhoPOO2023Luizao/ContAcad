package uniderp.escola.repositorio;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.dominio.NotaTrabalho;
import uniderp.escola.fakeDB.NotaTrabalhoFakeDB;

public class NotaTrabalhoRepositorio 
extends BaseGenericaRepositorio<NotaTrabalhoFakeDB, NotaTrabalho> {
    
    public NotaTrabalhoRepositorio(){
        this.db = new NotaTrabalhoFakeDB();
        this.dataset = this.db.gettabela();
    }

    @Override
    public NotaTrabalho Create(NotaTrabalho item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public NotaTrabalho Read(int codigo) {
         for (NotaTrabalho notaTrabalho : this.dataset) {
            if (notaTrabalho.getCodigo() == codigo)
            return notaTrabalho;
        }
        return null;
    }

    @Override
    public NotaTrabalho Update(NotaTrabalho item) {
        NotaTrabalho alvo = this.Read(item.getCodigo());
        alvo.setCodigo(item.getCodigo());
        alvo.setAluno(item.getAluno());
        alvo.setTrabalho(item.getTrabalho());
        alvo.setNota(item.getNota());
        return alvo;
    }

    @Override
    public NotaTrabalho Delete(int codigo) {
        NotaTrabalho alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }


}
