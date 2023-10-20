package uniderp.escola.repositorio;

import uniderp.escola.dominio.Aluno;
import uniderp.escola.fakeDB.AlunoFakeDB;

public class AlunoRepositorio 
extends BaseGenericaRepositorio <AlunoFakeDB, Aluno>{

    @Override
    public Aluno Create(Aluno item) {
        int tam = this.dataset.size()-1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        item.setCodigo(proxCodigo);
        this.dataset.add(item);
        return item;
    }

    @Override
    public Aluno Read(int codigo) {
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo)
            return aluno;
        }
        return null;
    }

    @Override
    public Aluno Update(Aluno item) {
        Aluno alvo = this.Read(item.getCodigo());
        alvo.setCodigo(item.getCodigo());
        alvo.setNome(item.getNome());
        alvo.setDataNascimento(item.getDataNascimento());
        alvo.setNomeUsuario(item.getNomeUsuario());
        alvo.setSenha(item.getSenha());
        alvo.setPeriodo(item.getPeriodo());
        return alvo;
    }    

    @Override
    public Aluno Delete(int codigo) {
        Aluno alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
