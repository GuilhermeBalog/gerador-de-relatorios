public class QuickSort implements Ordenacao {
    private Produto[] produtos;
    private Comparador<Produto> comparador;

    public void ordenar(Produto[] produtos, Comparador<Produto> comparador){
        this.produtos = produtos;
        this.comparador = comparador;

        quick(0, produtos.length - 1);
    }

    private void quick(int ini, int fim){
        if(ini < fim) {

            int q = particiona(ini, fim);
            
            quick(ini, q);
            quick(q + 1, fim);
        }
    }

    private int particiona(int ini, int fim){

		Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

            do{ 
                j--;

            } while(! comparador.crescente(produtos[j], x));
        
            do{
                i++;

            } while(comparador.crescente(produtos[i], x));

			if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
                produtos[j] = temp;
                
			} else {
                return j;
            }
		}
	}
}