
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import uniderp.escola.servico.AlunoServico;
import uniderp.escola.servico.DisciplinaServico;
import uniderp.escola.servico.NotaTrabalhoServico;
import uniderp.escola.servico.RendimentoEscolaSevico;
import uniderp.escola.servico.TurmaServico;

public class Menu {
    private Scanner scan;
    
    public Menu(){
        this.scan = new Scanner(System.in);
    }

    public void Executar(){
        this.ExibirMenu();
    }

    private void ExibirMenu(){

        int cont = 99;

        do {

            System.out.println("Escolha uma das opcoes para navegar\n");
            System.out.println("1. Professor");
            System.out.println("2. Aluno");
            System.out.println("3. Sair\n");
            cont = this.scan.nextInt();

            switch(cont){
                case 1:
                    this.MenuProf();

                    break;
                case 2:
                    this.MenuAluno();

                    break;
                case 3:
                    System.exit(0);
                default:
            }
        }while(cont!=0);
    }


    private void MenuProf(){

        int prof = 0;
        System.out.println("\ninsira o codigo do respectivo professor: \n");
        prof = this.scan.nextInt();
        int iprof = prof - 1;

        List<String> nomeTurmas = Arrays.asList("Grifinoria", "LufaLufa", "Corvinal", "Sonserina");

        TurmaServico turmas = new TurmaServico();

        System.out.println("\n"+ turmas.Listar().get(0).getProfessor().get(iprof).getNome()+"\n");

        for(int i = 0; i < turmas.Listar().size(); i++){
            if(turmas.Listar().get(0).getProfessor().get(iprof).getCodigo() == prof){
            System.out.println(turmas.Listar().get(i).getCodigo() + " - " + nomeTurmas.get(i)+"\n");
            }
        }

        int selectTurma = 0;

        System.out.println("Selecione uma turma: \n");
        selectTurma = this.scan.nextInt() -1;

        AlunoServico aluno = new AlunoServico();


        System.out.println("\n"+ 1+ "-" + aluno.Listar().get(selectTurma).getNome() +"\n");
        

        //int alunoSelecionado = aluno.Listar().get(selectTurma).getCodigo();


        NotaTrabalhoServico nota = new NotaTrabalhoServico();

        for(int i = 0; i < 4; i++){
            System.out.printf("%s - %.2f - %s\n", 
            aluno.Listar().get(selectTurma).getNome(),
            nota.Listar().get(i).getNota(), 
            turmas.Listar().get(iprof).getDisciplina().get(iprof).getNome());
            }
    }


    private void MenuAluno(){

        int aluno = 0;
        System.out.println("\ninsira o codigo do respectivo aluno: \n");
        aluno = this.scan.nextInt();
        int iAluno = aluno - 1;

        List<String> nomeTurmas = Arrays.asList("Grifinoria", "LufaLufa", "Corvinal", "Sonserina");

        TurmaServico turmas = new TurmaServico();
        AlunoServico aluno2 = new AlunoServico();

        if(turmas.Listar().get(0).getProfessor().get(iAluno).getCodigo() == aluno){
            System.out.println(turmas.Listar().get(iAluno).getCodigo() + " - " +aluno2.Listar().get(iAluno).getNome() +" - "+ nomeTurmas.get(iAluno)+"\n");
        }
        DisciplinaServico disciplinas = new DisciplinaServico();

        for(int i=0; i < 4; i++){
            System.out.println((i+1)+"-"+ disciplinas.Listar().get(i).getNome()+"\n");
        }

        System.out.println("\nSelecione a disciplina: \n");
        int selectDisci = scan.nextInt() - 1;
        
        NotaTrabalhoServico notas = new NotaTrabalhoServico();
        RendimentoEscolaSevico notas2 = new RendimentoEscolaSevico();

        System.out.printf("Primeira Prova - %.2f\n",notas2.Listar().get(selectDisci).getNotaPrimeiraProva());
        System.out.printf("Segunda Prova - %.2f\n",notas2.Listar().get(selectDisci).getNotaSegundaProva());


        System.out.println("\nNotas dos trabalhos\n");

        for(int i=0; i<4;i++){
            System.out.printf("%.2f\n",notas.Listar().get(i).getNota());
        }


        System.out.printf("\nMedia dos trabalhos - %.2f\n",notas2.Listar().get(selectDisci).getMediaTrabalhos());
        System.out.printf("Media Geral - %.2f\n",notas2.Listar().get(selectDisci).getMediaGeral());

    }
}
