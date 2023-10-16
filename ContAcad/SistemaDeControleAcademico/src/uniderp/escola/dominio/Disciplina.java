package uniderp.escola.dominio;

public class Disciplina extends BaseNome{
    
    private String ementa;

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Disciplina(int codigo, String nome, String ementa) {
        super(codigo, nome);
        this.ementa = ementa;
    } 
}
