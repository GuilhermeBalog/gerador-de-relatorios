public class CriterioQuantidade implements Comparador<Produto>{
    
    public boolean crescente(Produto a, Produto b) {
        return a.getQtdEstoque() < b.getQtdEstoque();
    }
}