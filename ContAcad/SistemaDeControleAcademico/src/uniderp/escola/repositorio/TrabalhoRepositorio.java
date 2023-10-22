package uniderp.escola.repositorio;


import uniderp.escola.dominio.Trabalho;
import uniderp.escola.fakeDB.TrabalhoFakeDB;

public class TrabalhoRepositorio 
extends BaseGenericaRepositorio<TrabalhoFakeDB, Trabalho> {
    
    public TrabalhoRepositorio(){
        this.db = new TrabalhoFakeDB();
        this.dataset = this.db.gettabela();
    }

    @Override
    public Trabalho Create(Trabalho item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public Trabalho Read(int codigo) {
         for (Trabalho trabalho : this.dataset) {
            if (trabalho.getCodigo() == codigo)
            return trabalho;
        }
        return null;
    }

    @Override
    public Trabalho Update(Trabalho item) {
        Trabalho alvo = this.Read(item.getCodigo());
        alvo.setCodigo(item.getCodigo());
        alvo.setDisciplina(item.getDisciplina());
        alvo.setDescricao(item.getDescricao());
        return alvo;
    }

    @Override
    public Trabalho Delete(int codigo) {
        Trabalho alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }    
}
