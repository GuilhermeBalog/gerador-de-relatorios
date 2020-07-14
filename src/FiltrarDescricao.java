import java.util.List;
import java.util.LinkedList;

public class FiltrarDescricao implements Filtragem {
    private String descricao;

    public FiltrarDescricao(String descricao) {
        this.descricao = descricao.toLowerCase();
    }

    public Produto[] filtrar(Produto[] produtos) {
        List<Produto> produtosFiltrados = new LinkedList<>();

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getDescricao().toLowerCase().contains(descricao)) {
                produtosFiltrados.add(produtos[i]);
            }
        }

        
        Produto[] produtosFinais = new Produto[produtosFiltrados.size()];
        int i = 0;
        for (Produto p : produtosFiltrados) {
            produtosFinais[i] = p;
            i++;
        }

        return produtosFinais;
    }
}