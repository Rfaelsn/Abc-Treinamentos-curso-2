package com.aovivo.sisrestaurante;

public enum MetodPagamento {
    DEBITO(0.02f),CREDITO(0),PIX(0.12f),AVISTA(0.11f);

    float porcentDescont;


    MetodPagamento(float porcentDescont) {
        this.porcentDescont = porcentDescont;
    }
    

    public float getPorcentDescont() {
        return this.porcentDescont;
    }
}
