import java.util.Scanner;

public class PessoaED {
    Scanner sc = new Scanner(System.in);

    Pessoa[] vetor;
    int cont = 0;

    void criarLista() {
        vetor = new Pessoa[5]; // dizendo q vai guardar dados de 5 pessoas

    }

    void salvar(Pessoa pes) {
        if (cont == 5) {
            System.out.println("Lista cheia !!");
        } else {
            vetor[cont] = new Pessoa();
            System.out.println("\nDigite o nome: ");
            vetor[cont].setNome(sc.next());
            System.out.println("Digite a idade: ");
            vetor[cont].setIdade(sc.nextInt());
            System.out.println("Digite o salario da pessoa: ");
            vetor[cont].setSalario(sc.nextDouble());


            cont++;
            System.out.println("Objeto Salvo com Sucesso");
        }
    }

    void listar() {
        for (int i =0;i<cont;i++) {
            if (cont == 0) {
                System.out.println("Lista Vazia!!");
            } else {
                System.out.println("O nome: "+ vetor[i].getNome() + "\nA idade: "
                        + vetor[i].getIdade() + "\nSalário: " + vetor[i].getSalario());
            }
        }
    }
}
