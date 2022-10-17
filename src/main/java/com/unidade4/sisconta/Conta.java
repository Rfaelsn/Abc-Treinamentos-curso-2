package com.unidade4.sisconta;

import javax.swing.JOptionPane;

public class Conta {
    private long numeroConta;
    protected double saldo;
    private double limite;
    /* Reuso Agregação */
    private Cliente clientes [] = new Cliente[5];

    public void atualiza (double taxa){
        this.saldo += (this.saldo*taxa);
    }

    public boolean saca(double valorSacado){
        if (valorSacado <= saldo) {
            this.saldo -= valorSacado;
            return true;
        }else{
            return false;
        }
    }

    public boolean depositar(double deposito){
        if (deposito >= 0) {
            this.saldo += deposito;
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir (Conta contaDestino,double valor){
        if (this.saldo>=valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            return true;
        }else{
            return false;
        }
        
    }


    public Conta() {
    }


    public long getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente[] getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

}
