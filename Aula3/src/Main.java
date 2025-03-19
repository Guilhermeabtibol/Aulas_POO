import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AlunoTec alunoT = new AlunoTec();

        System.out.println("Digite o nome do Aluno Tec: ");
        alunoT.nome = sc.nextLine();

        System.out.println("Digite a n1: ");
        alunoT.n1 = sc.nextDouble();

        System.out.println("Digite a n2: ");
        alunoT.n2 = sc.nextDouble();

        alunoT.calcMedia();

        System.out.printf("A media do " + alunoT.nome + " é: %.2f ", alunoT.media);
        System.out.println();
        System.out.println("Status: " + alunoT.status);

        sc.nextLine(); //aparentemente tem q limpar o buffer

        AlunoFacul alunoF = new AlunoFacul();

        System.out.println("Digite o nome do Aluno Facul: ");
        alunoF.nome = sc.nextLine();

        System.out.println("Digite a n1: ");
        alunoF.n1 = sc.nextDouble();

        System.out.println("Digite a n2: ");
        alunoF.n2 = sc.nextDouble();

        System.out.println("Digite a n3: ");
        alunoF.n3 = sc.nextDouble();

        alunoF.calcMedia();

        System.out.printf("A media do " + alunoF.nome + " é: %.2f ", alunoF.media);
        System.out.println();
        System.out.println("Status: " + alunoF.status);
    }
}