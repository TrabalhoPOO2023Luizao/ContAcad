import java.util.Scanner;

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

            System.out.println("Escolha uma das opcoes para navegar");
            System.out.println("1. Professor");
            System.out.println("2. Aluno");
            System.out.println("3. Sair");
            cont = this.scan.nextInt();

            switch(cont){
                case 1:

                case 2:

                case 3:

                default:
            }
        }while(cont!=0);

    }
}
