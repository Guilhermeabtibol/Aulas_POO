package application;

import entity.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno();
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do Aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a primeira  nota: ");
        aluno.n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        aluno.n3 = sc.nextDouble();

        aluno.calcMedia();

        System.out.println("O nome do aluno é: " + aluno.nome);
        System.out.printf("A média do aluno é: %.1f\n", aluno.media);
        System.out.print("O status do aluno é: " + aluno.status);
    }
}
