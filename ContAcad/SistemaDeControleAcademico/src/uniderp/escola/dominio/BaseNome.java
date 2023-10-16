package uniderp.escola.dominio;

public abstract class BaseNome extends BaseIdentificador{
    
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BaseNome(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }
     
}