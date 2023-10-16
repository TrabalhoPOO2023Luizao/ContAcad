package uniderp.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa {
    
    private int periodo;

    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public Aluno(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha, int periodo) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.periodo = periodo;
    }
    @Override
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Nome de Usuário: " + this.nomeUsuario);
        System.out.println("Período: " + this.periodo);
    }
    
}
