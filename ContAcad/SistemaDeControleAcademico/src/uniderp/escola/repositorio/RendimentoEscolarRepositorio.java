package uniderp.escola.repositorio;

import uniderp.escola.dominio.RendimentoEscola;
import uniderp.escola.fakeDB.RendimentoEscolaFakeDB;

public class RendimentoEscolarRepositorio 
extends BaseGenericaRepositorio<RendimentoEscolaFakeDB, RendimentoEscola> {
    
    public RendimentoEscolarRepositorio(){
        this.db = new RendimentoEscolaFakeDB();
        this.dataset = this.db.gettabela();
    }

    @Override
    public RendimentoEscola Create(RendimentoEscola item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public RendimentoEscola Read(int codigo) {
        for (RendimentoEscola rendimento : this.dataset) {
            if (rendimento.getCodigo() == codigo)
            return rendimento;
        }
        return null;
    }

    @Override
    public RendimentoEscola Update(RendimentoEscola item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public RendimentoEscola Delete(int codigo) { 
        RendimentoEscola alvo = this.Read(codigo);
            this.dataset.remove(alvo);
            return alvo;
    }   
}
