import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Pessoa p = new Pessoa();
        PessoaED ed = new PessoaED();
        ed.criarLista();

        int a = 0, b = 0;

        do {
            System.out.println("### CRUD VETORES ###");
            System.out.println("\n1 - Cadastrar");
            System.out.println("\n2 - Listar");
            System.out.println("\n3 - Deletar");
            System.out.println("\n0 - Sair");
            System.out.println("\n*** ESCOLHA UMA OPCAO ***");
            b = sc.nextInt();

            switch (b) {
                case 1:
                    System.out.println("METODO CADASTRAR");
                    ed.salvar(p);
                    break;
                case 2:
                    System.out.println("METODO LISTAR");
                    ed.listar();
                default:
                    break;
            }

            System.out.println("\nDIGITE 1 PARA CONTINUAR OU 0 PRA SAIR");
            a = sc.nextInt();
        } while (a != 0);
    }
}