package com.unidade3.sisalucar;

public class Cliente {
    private long idCliente;
    private String cpf;
    private String nome;
    private String cnh;

    public Cliente() {
        this.idCliente++;
    }

    public Cliente(long idCliente, String cpf, String nome, String cnh) {
        this.idCliente = idCliente;
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
    }


    public long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    
}
