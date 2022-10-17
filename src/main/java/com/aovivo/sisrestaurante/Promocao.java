package com.aovivo.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class Promocao extends Produto {
    private static List <Promocao> produtosPromocao = new ArrayList<>();
    
    static{
        produtosPromocao.add(new Promocao(
            "Combo promo 01 (15 peças)",
            "10 hol de salmao gerlhado com batata palha doce, 3 niguiris",
            40.90,
            "combo_promo_01.jpg"
        ));

        produtosPromocao.add(new Promocao(
            "Combo promo 02 (15 peças)",
            "4 sashimi de salmão, 2 Gunkas Maçaricado com molho de manga",
            53.90,
            "combo_promo_02.jpg"
        ));
    }
     
    
    public Promocao(String nomeProduto, String descricaoProduto, double precoProduto, String imgProduto) {
        super(nomeProduto, descricaoProduto, precoProduto, imgProduto);
        
    }


    public Promocao() {
    }

    public List<Promocao> getProdutosPromocao() {
        return this.produtosPromocao;
    }


}
