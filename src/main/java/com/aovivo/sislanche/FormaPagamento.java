package com.aovivo.sislanche;

public enum FormaPagamento {
    DEBITO(0.02f),CREDITO(0),PIX(0.12f),AVISTA(0.11f);

    float porcentDescont;


    FormaPagamento(float porcentDescont) {
        this.porcentDescont = porcentDescont;
    }
    

    public float getPorcentDescont() {
        return this.porcentDescont;
    }


    
}