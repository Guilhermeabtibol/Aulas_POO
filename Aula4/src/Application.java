import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo vei = new Veiculo();
        Moto m = new Moto();
        Caminhao cam = new Caminhao();

        Marca m1 = new Marca("Honda");
        Marca m2 = new Marca("Mercedes");
        Marca m3 = new Marca("Toyota");

        m3.nome = "Toyota";

        int a, b, c;

        do {
            System.out.println("\nDigite 1 p continuar ou 0 p sair: ");
            a = sc.nextInt();
        } while(a != 0);
    }
}


