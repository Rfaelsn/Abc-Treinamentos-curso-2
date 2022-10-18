package com.aovivo.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();
    private double totalPedido = 0;

    public void editaProduto(String nomeProduto,Produto novoProduto){
        for (int i = 0; i < this.produtos.size(); i++) {
            if (produtos.get(i).getNomeProduto() == nomeProduto) {
                produtos.add(i, novoProduto);
            }
        }
    }
    

    public void adicionaProduto(Produto produto){
        this.produtos.add(produto);
        this.totalPedido += produto.getPrecoProduto();
    }

    public void removerProduto(String nomeProduto){
        for (int i = 0; i < this.produtos.size(); i++) {
            if (produtos.get(i).getNomeProduto() == nomeProduto) {
                produtos.remove(i);
            }
        }
    }

    public String listarPedido(){
        String descPedido = "Informações do cliente: \n";
        descPedido += "nome: "+ this.cliente.getNome()+"\n" ;
        descPedido += "cpf: "+ this.cliente.getCpf()+"\n";
        descPedido += "Endereco: "+ this.cliente.getEndereco()+"\n";
        descPedido += "Telefone: "+ this.cliente.getTelefone()+"\n";
        descPedido += "produtos: \n";
        for (int i = 0; i < this.getProdutos().size(); i++) {
            descPedido += (i+1)+"º Produto:\n";
            descPedido += "Nome do Produto: "+this.getProdutos().get(i).getNomeProduto()+"\n";
            descPedido += "descrição do Produto: "+this.getProdutos().get(i).getDescricaoProduto()+"\n";
            descPedido += "Preço do Produto: "+this.getProdutos().get(i).getPrecoProduto()+"\n";
        }
        descPedido += "\n Total do pedido: "+this.totalPedido;


        return descPedido;
    }

    



    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Produto> produtos, double totalPedido) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.totalPedido = totalPedido;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotalPedido() {
        return this.totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }


}
