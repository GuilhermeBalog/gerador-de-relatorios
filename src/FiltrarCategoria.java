import java.util.LinkedList;
import java.util.List;

public class FiltrarCategoria implements Filtragem {
    private String categoria;

    public FiltrarCategoria(String categoria){
        this.categoria = categoria;
    }

    public Produto[] filtrar(Produto[] produtos){
        List<Produto> produtosFiltrados = new LinkedList<>();

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i].getCategoria().equals(categoria)){
                produtosFiltrados.add(produtos[i]);
            }
        }

        Produto[] produtosFinais = new Produto[produtosFiltrados.size()];
        int i = 0;
        for(Produto p : produtosFiltrados){
            produtosFinais[i] = p;
            i++;
        }

        return produtosFinais;
    }
}