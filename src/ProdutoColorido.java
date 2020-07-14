import java.awt.Color;
import java.awt.color.*;

public class ProdutoColorido implements Produto{
    private Produto decorado;
    private Color cor;

    public ProdutoColorido(Produto decorado, Color cor){
        this.decorado = decorado;
        this.cor = cor;
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
        int r = cor.getRed();
        int g = cor.getGreen();
        int b = cor.getBlue();
        String corFinal = r + "," + g + "," + b;
        return "<span style='color: rgb(" + corFinal + ")'>" + decorado.formataParaImpressao() + "</span>";
    }
}