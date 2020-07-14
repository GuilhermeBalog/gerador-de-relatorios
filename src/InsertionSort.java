public class InsertionSort implements Ordenacao{
    private int ordem;

    public InsertionSort(int ordem){
        this.ordem = ordem;
    }
    
    public void ordenar(Produto[] produtos, Comparador<Produto> comparador){
        for(int i = 0; i < produtos.length; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= 0){
                if(ordem >= 0){
                    if(comparador.crescente(x, produtos[j])){
    
                        produtos[j + 1] = produtos[j];
                        j--;
                        
                    } else {
                        break;
                    }
                }else{
                    if(comparador.crescente(produtos[j], x)){
    
                        produtos[j + 1] = produtos[j];
                        j--;
                        
                    } else {
                        break;
                    }
                }
                
            }

            produtos[j + 1] = x;
        }
    }
}