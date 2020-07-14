public class Descricao implements Comparador<Produto>{
    
    public boolean crescente(Produto a, Produto b) {

        if(a.getDescricao().compareToIgnoreCase(b.getDescricao()) < 0){
            return true;
        } else {
            return false;
        }
    }
}