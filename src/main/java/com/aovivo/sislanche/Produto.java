package com.aovivo.sislanche;

public class Produto {
    private long idProduto;
    private String nomeProduto;
    private String imagem;
    private double preco;
    private double peso;
    private static int qtdVendida = 0;

    public String relatorioPedido(Pedido pedido){
        String result = "";
        
        return "";
    }

    public Produto(String nomeProduto, double preco, double peso) {
        this.idProduto++;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.peso = peso;
        qtdVendida++;
    }
    
    
    public long getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    
}
