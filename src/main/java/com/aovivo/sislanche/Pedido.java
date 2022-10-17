package com.aovivo.sislanche;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long idPedido;
    List <Produto>produtosPedido = new ArrayList<>();
    Cliente cliente = new Cliente();
    private double valorTotal;
    private int numParcelas;
    private String formaPagamento;
    private String observacoes;


    public String descricaoPedido(Pedido pedido){
        String infoPedido= "Cliente: "+pedido.getCliente().getNome()+"\n";
        infoPedido += "Endereço de entrega: "+pedido.getCliente().getEndereco()+"\n";
        infoPedido += "Telefone: "+pedido.getCliente().getTelefone()+"\n";
        infoPedido += "Itens:\n";

        for (int i = 0; i < this.produtosPedido.size(); i++) {
            infoPedido += (i+1)+"º Produto:\n";
            infoPedido += "Nome: " + produtosPedido.get(i).getNomeProduto()+"\n";
            infoPedido += "Preço: " + produtosPedido.get(i).getPreco()+"\n";
            infoPedido += "peso: " + produtosPedido.get(i).getPeso()+"g\n";
        }

        infoPedido += "----------------------------------Pagamento-----------------------------------------\n";

        infoPedido += (this.getFormaPagamento() == "CREDITO") ? 
        "Forma de Pagamento: "+this.getFormaPagamento()+"\n Valor Pacelado("+
        this.getNumParcelas()+"): "+ (this.getValorTotal()/this.getNumParcelas())+"\n"
        :"Forma de Pagamento: "+this.getFormaPagamento()+"\n";

        infoPedido += "Total do Pedido: "+this.getValorTotal()+"\n";
        infoPedido += "Observações: "+this.getObservacoes()+"\n";
        

        return infoPedido;
    }

    public Pedido() {
    }


    public Pedido(List<Produto> produtosPedido, Cliente cliente,double valorTotal, String formaPagamento,int numParcelas,String observacoes) {
        this.idPedido++;
        this.produtosPedido = produtosPedido;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.numParcelas = numParcelas;
        this.observacoes = observacoes;
    }



    public long getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


    public List getProdutosPedido() {
        return this.produtosPedido;
    }

    public void setProdutosPedido(List produtosPedido) {
        this.produtosPedido = produtosPedido;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public int getNumParcelas() {
        return this.numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    
}
