package uniderp.escola.dominio;

public class Trabalho extends BaseIdentificador {
    private Disciplina disciplina;
    private String descricao;
    
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Trabalho(int codigo, Disciplina disciplina, String descricao) {
        super(codigo);
        this.disciplina = disciplina;
        this.descricao = descricao;
    }
    
}
