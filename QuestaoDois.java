import javax.swing.JOptionPane;

public class QuestaoDois {

    public static void main(String[] args){

        Produto sabao = new Produto();
        sabao.setNomeProduto("sabao");
        sabao.setPrecoProduto(2.99);
        sabao.setQntEstoque(50);

        Produto escova = new Produto();
        escova.setNomeProduto("escova");
        escova.setPrecoProduto(30);
        escova.setQntEstoque(23);

        Produto refrigerante = new Produto();
        refrigerante.setNomeProduto("refrigerante");
        refrigerante.setPrecoProduto(5.5);
        refrigerante.setQntEstoque(80);

        Compra compra = new Compra();
        
        JOptionPane.showMessageDialog(null, "Itens disponiveis:\nSabao estoque: " + sabao.getQntEstoque() + ".\nEscova estoque: " + escova.getQntEstoque() + ".\nRefrigerante estoque: " + refrigerante.getQntEstoque()+".");
        
        int contadorSabao = 0;// nao consegui trabalhar com arrays por isso fiz dessa forma
        double valorSabao = 0;

        int contadorEscova = 0;
        double valorEscova = 0;

        int contadorRefrigerante = 0;
        double valorRefrigerante = 0;

        double totalCompra = 0;

        boolean continuar = false;  
        while (continuar != true){
            String entrada = JOptionPane.showInputDialog("Digite o nome do item que deseja comprar:");
            
            if(entrada.equalsIgnoreCase("sabao")){
                String quantidade = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
                int qnt = Integer.parseInt(quantidade);
                if(qnt <= sabao.getQntEstoque() && (qnt > 0)){
                    sabao.setQntEstoque(sabao.getQntEstoque() - qnt);
                    contadorSabao = contadorSabao + qnt;
                    valorSabao = valorSabao + (sabao.getPrecoProduto()*qnt);
                }else{
                    JOptionPane.showMessageDialog(null, "Quantidade indisponivel.");
                }
            }else if(entrada.equalsIgnoreCase("escova")){
                String quantidade = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
                int qnt = Integer.parseInt(quantidade);
                if(qnt <= escova.getQntEstoque() && (qnt > 0)){
                    escova.setQntEstoque(escova.getQntEstoque() - qnt);
                    contadorEscova = contadorEscova + qnt;
                    valorEscova = valorEscova + (escova.getPrecoProduto()*qnt);
                }else{
                    JOptionPane.showMessageDialog(null, "Quantidade indisponivel.");
                }
            }else if(entrada.equalsIgnoreCase("refrigerante")){
                String quantidade = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
                int qnt = Integer.parseInt(quantidade);
                if((qnt <= refrigerante.getQntEstoque()) && (qnt > 0)){
                    refrigerante.setQntEstoque(refrigerante.getQntEstoque() - qnt);
                    contadorRefrigerante = contadorRefrigerante + qnt;
                    valorRefrigerante = valorRefrigerante + (refrigerante.getPrecoProduto()*qnt);
                }else{
                    JOptionPane.showMessageDialog(null, "Quantidade indisponivel.");
                }
            }

            String perguntaCont = JOptionPane.showInputDialog("Deseja continuar comprando? [s/n]");
            if(perguntaCont.equalsIgnoreCase("n")){
                continuar = true;
            }
        }
        if(contadorSabao > 0){
            JOptionPane.showMessageDialog(null, sabao.getNomeProduto()+":\nQuantidade: " +contadorSabao+"\nR$"+valorSabao);
        }
        if(contadorEscova > 0){
            JOptionPane.showMessageDialog(null, escova.getNomeProduto()+"\nQuantidade: " +contadorEscova+"\nR$"+valorEscova);
        }
        if(contadorRefrigerante > 0){
            JOptionPane.showMessageDialog(null, refrigerante.getNomeProduto()+"\nQuantidade: " +contadorRefrigerante+"\nR$"+valorRefrigerante);
        }

        totalCompra = valorSabao+valorEscova+valorRefrigerante;
        if((contadorSabao > 0) || (contadorEscova > 0) || (contadorRefrigerante > 0)){
            String formaPagamento = JOptionPane.showInputDialog("Qual a forma de pagamento");        
            compra.pag(formaPagamento);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto foi comprado.");
        }
        JOptionPane.showMessageDialog(null, "Itens que sobraram no estoque:\nSabao estoque: " + sabao.getQntEstoque() + ".\nEscova estoque: " + escova.getQntEstoque() + ".\nRefrigerante estoque: " + refrigerante.getQntEstoque()+".");
    }
    
}