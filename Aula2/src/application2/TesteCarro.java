package application2;

import java.util.Locale;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Carro car1 = new Carro();
        Carro car2 = new Carro();

        System.out.println("Digite o modelo: ");
        car1.modelo = sc.next();
        System.out.println("Digite a marca: ");
        car1.marca = sc.next();
        System.out.println("Digite o ano: ");
        car1.ano = sc.nextInt();
        System.out.println("Digite o valor: ");
        car1.valor = sc.nextDouble();
        car1.calcValor();

        System.out.println("O modelo: " + car1.modelo);
        System.out.println("A marca: " + car1.marca);
        System.out.println("O ano: " + car1.ano);
        System.out.println("O valor: " + car1.valor);
        System.out.println("O valor do IPVA: R$ "+ car1.ipva);
    }
}
