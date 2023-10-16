package uniderp.escola.dominio;

import java.util.ArrayList;

public class RendimentoEscola {
    private Aluno aluno;
    private Turma turma;
    private double notaPrimeiraProva;
    private double notaSegundaProva;
    private ArrayList<NotaTrabalho> trabalhos;
    private double mediaTrabalhos;
    private double mediaGeral;

    private double calcularMediaTrabalhos(){
        double soma = 0.0;
        for(NotaTrabalho trabalho : trabalhos){
            soma += trabalho.getNota();
        }
        return soma / trabalhos.size();
    }
    
    private double calcularMediaGeral(){
        double media = (notaPrimeiraProva + notaSegundaProva) / 2.0;
        return (media + mediaTrabalhos) / 2.0;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNotaPrimeiraProva() {
        return notaPrimeiraProva;
    }

    public void setNotaPrimeiraProva(double notaPrimeiraProva) {
        this.notaPrimeiraProva = notaPrimeiraProva;
    }

    public double getNotaSegundaProva() {
        return notaSegundaProva;
    }

    public void setNotaSegundaProva(double notaSegundaProva) {
        this.notaSegundaProva = notaSegundaProva;
    }

    public ArrayList<NotaTrabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(ArrayList<NotaTrabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }

    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public RendimentoEscola(Aluno aluno, Turma turma, double notaPrimeiraProva, double notaSegundaProva,
            ArrayList<NotaTrabalho> trabalhos, double mediaTrabalhos, double mediaGeral) {
        this.aluno = aluno;
        this.turma = turma;
        this.notaPrimeiraProva = notaPrimeiraProva;
        this.notaSegundaProva = notaSegundaProva;
        this.trabalhos = trabalhos;
        this.mediaTrabalhos = calcularMediaTrabalhos();
        this.mediaGeral = calcularMediaGeral();
    }
    
}
