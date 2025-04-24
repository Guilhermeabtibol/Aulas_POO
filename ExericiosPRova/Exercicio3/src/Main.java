public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Como Explicar Manaus?","Adagobberto", 1999);
        Usuario usuario = new Usuario("Roberto", 2402970);

        System.out.println("O aluno: " + usuario.getNome());
        System.out.println("Matricula: " + usuario.getMatricula());
        System.out.println("Emprestou o livro: " + livro.getTitulo() + ", " + livro.getAutor() + ", " + livro.getAnoPublicacao());
    }
}