public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco; // Cliente pode ter um único endereço

    // Construtor sem endereço (deixa para cadastrar depois)
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = null; // Inicialmente, não tem endereço
    }

    // Método para cadastrar o endereço depois
    public void cadastrarEndereco(Endereco endereco) {
        this.endereco = endereco;
        System.out.println("Endereço cadastrado para " + nome);
    }

    // Exibir informações do cliente e endereço
    public void exibirCliente() {
        System.out.println("\n👤 Cliente: " + nome);
        System.out.println("📌 CPF: " + cpf);
        System.out.println("📧 Email: " + email);

        if (endereco == null) {
            System.out.println("🚨 Nenhum endereço cadastrado!");
        } else {
            System.out.println("🏠 Endereço: " + endereco);
        }
    }
}
