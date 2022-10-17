package com.aovivo.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class HollWassabi extends Produto{
    private static List <HollWassabi> produtosHollWassabi = new ArrayList<>();
    
    static{
        produtosHollWassabi.add(new HollWassabi(
            "Wassabi gol met",
            "5 peças do holl de salmão gerlhado, cream cheese, alga nori, arroz, gergilim e biscoitinho tempurá",
            23.50,
            "wassabi_gol_met.jpg"
        ));

        produtosHollWassabi.add(new HollWassabi(
            "Holl tartar de salmão met",
            "5 peças de holl de salmão, arroz, gergelim, alga nori, cream cheese, a parte de salmão em cima",
            24.50,
            "hol_tartar_de_salmao_met.jpg"
        ));
    }

    public HollWassabi(String nomeProduto, String descricaoProduto, double precoProduto, String imgProduto) {
        super(nomeProduto, descricaoProduto, precoProduto, imgProduto);
        //TODO Auto-generated constructor stub
    }
    

    public HollWassabi() {
    }

    public List<HollWassabi> getProdutosHollWassabi() {
        return this.produtosHollWassabi;
    }

}
