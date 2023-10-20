package uniderp.escola.repositorio;

import uniderp.escola.dominio.NotaTrabalho;
import uniderp.escola.fakeDB.NotaTrabalhoFakeDB;

public class NotaTrabalhoRepositorio 
extends BaseGenericaRepositorio<NotaTrabalhoFakeDB, NotaTrabalho> {
    
    public NotaTrabalhoRepositorio(){
        this.db = new NotaTrabalhoFakeDB();
        this.dataset = this.db.gettabela();
    }


}
