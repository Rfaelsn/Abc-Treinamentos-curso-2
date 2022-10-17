package com.unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {
   private long idLocacao=0;
   private long idCarroLocado;
   private long idCliente; 
   private float valorLocado;
   private LocalDate dataInicio;
   private LocalDate dataFim;

    public Locacao() {
        this.idLocacao++;
    }


    public Locacao(long idCarroLocado, long idCliente, float valorLocado, LocalDate dataInicio, LocalDate dataFim){
        this.idLocacao++;
        this.idCarroLocado = idCarroLocado;
        this.idCliente = idCliente;
        this.valorLocado = valorLocado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public long getIdLocacao() {
        return this.idLocacao;
    }

    public void setIdLocacao(long idLocacao) {
        this.idLocacao = idLocacao;
    }

    public long getIdCarroLocado() {
        return this.idCarroLocado;
    }

    public void setIdCarroLocado(long idCarroLocado) {
        this.idCarroLocado = idCarroLocado;
    }

    public long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public float getValorLocado() {
        return this.valorLocado;
    }

    public void setValorLocado(float valorLocado) {
        this.valorLocado = valorLocado;
    }

    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return this.dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }


}
