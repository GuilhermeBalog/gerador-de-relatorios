import java.util.List;
import java.util.LinkedList;

public class FiltrarIntervaloPreco implements Filtragem {
    private double precoInferior;
    private double precoSuperior;

    public FiltrarIntervaloPreco(double precoInferior, double precoSuperior) {
        this.precoInferior = precoInferior;
        this.precoSuperior = precoSuperior;
    }

    public Produto[] filtrar(Produto[] produtos) {
        List<Produto> produtosFiltrados = new LinkedList<>();

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getPreco() <= precoSuperior) {
                if (produtos[i].getPreco() >= precoInferior) {
                    produtosFiltrados.add(produtos[i]);
                }
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