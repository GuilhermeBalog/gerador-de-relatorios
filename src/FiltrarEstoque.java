import java.util.LinkedList;
import java.util.List;

public class FiltrarEstoque implements Filtragem {
    private int limite;

    public FiltrarEstoque(int limite){
        this.limite = limite;
    }

    public Produto[] filtrar(Produto[] produtos){
        List<Produto> produtosFiltrados = new LinkedList<>();

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i].getQtdEstoque() <= limite){
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