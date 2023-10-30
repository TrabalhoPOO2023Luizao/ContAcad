package uniderp.escola.dominio;

import java.util.ArrayList;

public class Turma extends BaseIdentificador {
    private int capacidadeTurma;
    private ArrayList<Disciplina> disciplina;
    private ArrayList<Professor> professor;
    
    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }
    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    public ArrayList<Professor> getProfessor() {
        return professor;
    }
    public void setProfessor(ArrayList<Professor> professor) {
        this.professor = professor;
    }
    
    public Turma(int codigo, int capacidadeTurma, ArrayList<Disciplina> disciplina, ArrayList<Professor> professor) {
        super(codigo);
        this.capacidadeTurma = capacidadeTurma;
        this.disciplina = disciplina;
        this.professor = professor;
    }
    
    
}
