public class Usuario {
    private String nome;
    private int matricula;

    public Usuario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void emprestarLivros(String livro) {
        System.out.println(nome + " emprestou o livro: " + livro);
    }
}
