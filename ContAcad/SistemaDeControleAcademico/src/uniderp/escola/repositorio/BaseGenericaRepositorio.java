package uniderp.escola.repositorio;

import java.util.ArrayList;

public abstract class BaseGenericaRepositorio<TFakeDB, TDom> {
    
    protected TFakeDB db;

    protected ArrayList<TDom> dataset;

    public abstract TDom Create(TDom item);

    public abstract TDom Read(int codigo);

    public ArrayList<TDom> ReadAll(){
        return this.dataset;
    }

    public abstract TDom Update(TDom item);

    public abstract TDom Delete(int codigo);
}
