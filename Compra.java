import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Compra {
    
    private Produto item;
    private int qntCompra;
    private String[] pagamento = {"cartao", "cheque", "dinheiro"};
    private static List<Produto> carrinho = new ArrayList<Produto> (); 
    
    public Produto getItem() {
        return item;
    }
    public void setItem(Produto item) {
        this.item = item;
    }

    public String[] getPagamento() {
        return pagamento;
    }
    public void setPagamento(String[] pagamento) {
        this.pagamento = pagamento;
    }

    public int getQntCompra() {
        return qntCompra;
    }
    public void setQntCompra(int qntCompra) {
        this.qntCompra = qntCompra;
    }
    
    public void addCarrinho(Produto item){
        carrinho.add(item);
    }
    
    public static List<Produto> getCarrinho(){
        return carrinho;
    }
    
    public void pag (String formaPag){
        boolean verifica = false;
        for(int i = 0; i<3 ; i++){
            if(formaPag.equalsIgnoreCase(pagamento[i]) && (verifica == false)){
            JOptionPane.showMessageDialog(null, "Forma de pagamento aceita.");
            verifica = true;
            }else if((i == 2) && (verifica == false )){
                JOptionPane.showMessageDialog(null, "Forma de pagamento nao aceita");
            }
        }
    }
}
