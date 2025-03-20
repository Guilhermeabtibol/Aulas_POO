import java.util.Locale;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando objetos de veículos e marcas
        Veiculo vei = new Veiculo();
        Moto m = new Moto();
        Caminhao cam = new Caminhao();

        Marca m1 = new Marca("Honda");
        Marca m2 = new Marca("Mercedes");
        Marca m3 = new Marca("Toyota");

        int a, b;

        do {
            // Entrada para a moto
            System.out.println("\nDigite o modelo da moto: ");
            m.modelo = sc.next();
            System.out.println("Digite a cor da moto: ");
            m.cor = sc.next();
            System.out.println("Digite o valor da moto: ");
            m.valor = sc.nextDouble();  // Atribuindo o valor à moto
            m.calcIpva();  // Calculando o IPVA da moto

            // Entrada para o veículo
            System.out.println("Digite o modelo do veiculo: ");
            vei.modelo = sc.next();
            System.out.println("Digite a cor do veiculo: ");
            vei.cor = sc.next();
            System.out.println("Digite o valor do veiculo: ");
            vei.valor = sc.nextDouble();  // Atribuindo o valor ao veículo
            vei.calcIpva();  // Calculando o IPVA do veículo

            // Exibição das marcas
            System.out.println("A marca 1: " + m1.nome);
            System.out.println("A marca 2: " + m2.nome);
            System.out.println("A marca 3: " + m3.nome);

            // Escolha da marca
            System.out.println("Escolha uma marca pelo número correspondente: ");
            b = sc.nextInt();

            // Atribuindo a marca selecionada ao veículo
            if (b == 1) {
                vei.marca = m1.nome;
            } else if (b == 2) {
                vei.marca = m2.nome;
            } else if (b == 3) {
                vei.marca = m3.nome;
            } else {
                System.out.println("Opção inválida! Escolha um número entre 1 e 3.");
            }

            // Exibindo as informações do veículo
            System.out.println("O veiculo: " + vei.modelo);
            System.out.println("O valor do veiculo: R$ " + vei.valor);
            System.out.printf("O valor do IPVA do veículo: R$ %.2f%n", vei.calcIpva());

            // Exibindo as informações da moto
            System.out.println("A moto: " + m.modelo);
            System.out.println("O valor da moto: R$ " + m.valor);
            System.out.printf("O valor do IPVA da moto: R$ %.2f%n", m.calcIpva());

            // Pergunta se deseja continuar
            System.out.println("Digite 1 para continuar ou 0 para parar: ");
            a = sc.nextInt();

        } while (a != 0);

        sc.close();  // Fechando o scanner ao final
    }
}

