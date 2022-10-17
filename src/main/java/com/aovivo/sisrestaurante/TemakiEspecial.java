package com.aovivo.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class TemakiEspecial extends Produto{

    private static List <TemakiEspecial> produtosTemakiEsp = new ArrayList<>();
    
    static{
        produtosTemakiEsp.add(new TemakiEspecial(
            "tamaki exotic",
            "salmão, kani, shimeji fritos na manteiga e cream cheese, arroz e algas",
            41.50,
            "temaki_exotic.jpg"
        ));

        produtosTemakiEsp.add(new TemakiEspecial(
            "tamaki poró",
            "salmão misturado com alho poró na casquinha de massa harukami",
            42.50,
            "temaki_poro.jpg"
        ));
    }

    public TemakiEspecial(String nomeProduto, String descricaoProduto, double precoProduto, String imgProduto) {
        super(nomeProduto, descricaoProduto, precoProduto, imgProduto);
        //TODO Auto-generated constructor stub
    }


    public TemakiEspecial() {
    }
    
    public List<TemakiEspecial> getProdutosTemakiEsp() {
        return this.produtosTemakiEsp;
    }
}
