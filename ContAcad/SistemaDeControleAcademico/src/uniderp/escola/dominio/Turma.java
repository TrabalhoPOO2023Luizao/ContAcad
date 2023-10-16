package uniderp.escola.dominio;

public class Turma extends BaseIdentificador {
    private int capacidadeTurma;
    private Disciplina disciplina;
    private Professor professor;
    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }
    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public Turma(int codigo, int capacidadeTurma, Disciplina disciplina, Professor professor) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.disciplina = disciplina;
        this.professor = professor;
    }
    
    
}
