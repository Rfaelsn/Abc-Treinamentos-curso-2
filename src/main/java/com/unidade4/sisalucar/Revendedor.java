package com.unidade4.sisalucar;

public enum Revendedor {
    ABCVEICULOS("101010/0001","Rua das Perdizes","volkswagen"),
    SIMAOVEICULOS("101012/0002","AV.MORUMBI 2500","BMW"),
    EMANUELVEICULOS("121212/0003","AV.NAÇÕES","FORD");

    String cnpj; 
    String endereco;
    String fabricante;

    private Revendedor (String cnpj, String endereco, String fabricante){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.fabricante = fabricante;
    }

    
}