import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            Marca marca = new Marca();
            Marca m1 = new Marca("Yamaha");
            Marca m2 = new Marca("Honda");
            Marca m3 = new Marca("Bmw");

            Veiculo vei = new Veiculo();
            Moto m = new Moto();

            m.setModelo("CG");
            m.setAno(2000);
            m.setCilindradas(160);
            m.setValor(10000.0);
            m.setMarca(m2);

            m.calcIpva();

            System.out.println("O modelo: " + m.getModelo());
            System.out.println("A marca: " + m.getMarca());
            System.out.println("O valor: R$" + m.getValor());
            System.out.println("O valor do IPVA: R$" + m.getIpva());

            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            opcao = sc.nextInt();
        } while (opcao == 1);

    }
}