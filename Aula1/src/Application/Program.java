package Application;

import entity.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nomeAluno = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        aluno.n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        aluno.n2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        aluno.n3 = sc.nextDouble();

        aluno.calculoMedia();

        System.out.println("O nome do aluno é: " + aluno.nomeAluno);
        System.out.printf("A sua média é: %.1f", aluno.media);
        System.out.println();
        System.out.println("O seu status é: " + aluno.status);
    }
}
