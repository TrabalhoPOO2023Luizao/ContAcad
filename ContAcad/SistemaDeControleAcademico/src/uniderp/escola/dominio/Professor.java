package uniderp.escola.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa {
    
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void IImprimir(){
        System.err.println(getCodigo());
        System.err.println(getNome());
        System.err.println(getDataNascimento());
        System.err.println(getCargo());
    }

    public Professor(int codigo, String nome, LocalDate dataNascimento, String nomeUsuario, String senha,
            String cargo) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.cargo = cargo;
    }
        
}
