public class Preco implements Comparador<Produto>{
    
    public boolean crescente(Produto a, Produto b) {
        return a.getPreco() < b.getPreco();
    }
}