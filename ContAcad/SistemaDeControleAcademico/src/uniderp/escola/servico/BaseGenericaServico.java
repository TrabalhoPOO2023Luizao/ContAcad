package uniderp.escola.servico;

import java.util.ArrayList;


public abstract class BaseGenericaServico<TRepositorio, TDominio> {
    
    protected TRepositorio repo;

    public abstract TDominio Inserir(TDominio dados);

    public abstract TDominio Obter(int codigo);

    public abstract ArrayList<TDominio> Listar();

    public abstract TDominio Atualizar(TDominio dados);

    public abstract TDominio Excluir(int codigo);

    public BaseGenericaServico(){}
}
