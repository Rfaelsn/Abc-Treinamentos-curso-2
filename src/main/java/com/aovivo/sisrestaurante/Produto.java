package com.aovivo.sisrestaurante;

public abstract class Produto {
   private String nomeProduto;
   private String descricaoProduto;
   private double precoProduto;
   private String imgProduto;


    public Produto(String nomeProduto, String descricaoProduto, double precoProduto, String imgProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.imgProduto = imgProduto;
    }


    public Produto() {
    }



    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getImgProduto() {
        return this.imgProduto;
    }

    public void setImgProduto(String imgProduto) {
        this.imgProduto = imgProduto;
    }



}
