public interface Produto {

	public void setQtdEstoque(int qtdEstoque);
	public void setPreco(double preco);
	
	public int getId();
	public String getDescricao();
	public String getCategoria();
	public int getQtdEstoque();	
	public double getPreco();

	public String formataParaImpressao();
}
