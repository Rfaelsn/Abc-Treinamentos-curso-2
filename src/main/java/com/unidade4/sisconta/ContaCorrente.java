package com.unidade4.sisconta;

public class ContaCorrente extends Conta{
    public void atualiza (double taxa){ //anulação
        super.saldo += (super.saldo*(taxa*2));
    }
}
