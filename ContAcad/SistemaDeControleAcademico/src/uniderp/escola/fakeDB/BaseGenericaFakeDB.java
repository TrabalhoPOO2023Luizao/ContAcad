package uniderp.escola.fakeDB;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDom> {
    public ArrayList<TDom> tabela;
    
    public ArrayList<TDom> gettabela(){
        if(this.tabela == null){
            this.tabela = new ArrayList<TDom>();
        }
        return this.tabela;
    }
    
    protected abstract void CarregarDados();

    public BaseGenericaFakeDB(){
        this.tabela = new ArrayList<TDom>();
    }
}
