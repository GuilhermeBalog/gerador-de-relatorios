public class ProdutoNegrito implements Produto {
    private Produto decorado;

    public ProdutoNegrito(Produto decorado){
        this.decorado = decorado;
    }

    public void setQtdEstoque(int qtdEstoque){
        decorado.setQtdEstoque(qtdEstoque);
    }

	public void setPreco(double preco){
        decorado.setPreco(preco);
    }
	
	public int getId(){
        return decorado.getId();
    }

	public String getDescricao(){
        return decorado.getDescricao();
    }

	public String getCategoria(){
        return decorado.getCategoria();
    }

	public int getQtdEstoque(){
        return decorado.getQtdEstoque();
    }

	public double getPreco(){
        return decorado.getPreco();
    }

	public String formataParaImpressao(){
        return "<b style=\"font-weight:bold\">" + decorado.formataParaImpressao() + "</b>";
    }
}