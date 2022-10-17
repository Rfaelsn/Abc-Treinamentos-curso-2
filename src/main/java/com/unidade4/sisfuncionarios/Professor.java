package com.unidade4.sisfuncionarios;

public class Professor extends Funcionario implements Contribuinte,Cidadao,Autenticavel{

    @Override
    public void getBonificacao() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getCpf() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void pagaIR() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getRg() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void vota() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean autentica(String senha) {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
