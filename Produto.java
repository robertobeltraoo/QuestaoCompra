public class Produto {
    
    private String nomeProduto;
    private int qntEstoque;
    private double precoProduto;
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public double getPrecoProduto() {
        return precoProduto;
    }
    
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public int getQntEstoque() {
        return qntEstoque;
    }
    
    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
    
}
