public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Guilherme", "1234567891-1", "gui@gmail.com");
        Endereco end1 = new Endereco("Itagimirim", 15, "Manaus", "Cidade Nova", "Amazonas", "690977654");

        cliente1.cadastrarEndereco(end1);


        cliente1.exibirCliente();
    }
}