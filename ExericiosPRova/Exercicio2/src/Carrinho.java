import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos; // lista os produtos

    public Carrinho(List<Produto> produtos) {
        this.produtos = new ArrayList<>();
    }

    // metodo para adicionar produtos
    public void adicionarProdutos(Produto produto) {
        produtos.add(produto); {
            System.out.println(produto.getNome() + " foi adicionado ao carrinho");
        }
    }

    public void removerProduto() {

    }
}
