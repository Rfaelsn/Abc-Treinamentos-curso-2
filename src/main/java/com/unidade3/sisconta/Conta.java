package com.unidade3.sisconta;

public class Conta {
    private long numeroConta;
    private double saldo;
    private double limite;
    private String nome;

    public boolean saca(){
        return false;
    }

    public void depositar(){

    }

    public void transferir (Conta contaOrigem,Conta contaDestino,double valor){
        if (contaOrigem.getSaldo()>=valor) {
            contaOrigem.setSaldo(contaOrigem.getSaldo()-valor);
            contaDestino.setSaldo(valor);
        }
        
    }


    public Conta() {
    }

    public Conta(long numeroConta, double saldo, double limite, String nome) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }

    public long getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
