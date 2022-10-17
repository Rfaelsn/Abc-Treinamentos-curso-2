package com.unidade4.sisconta;

import javax.swing.JOptionPane;

public class SisContaApp {
    public static void main(String[] args) {
        Conta conta1 =  new Conta();
        
        /* Reuso Agregação */
        Cliente clientes [] = new Cliente[5];
        conta1.setClientes(clientes);

        Conta conta2 = new Conta();
        double deposito = Double.parseDouble(
            JOptionPane.showInputDialog("conta 1 : digite o valor que deseja depositar")
        );

        String resultadoDeposito = (conta1.depositar(deposito) == true) ? 
        ("Depositado com sucesso" + deposito) : "Valor inválido";
        JOptionPane.showMessageDialog(null, resultadoDeposito);

        double transferencia = Double.parseDouble(
            JOptionPane.showInputDialog("conta 1 : digite o valor que deseja depositar")
        );

        String resultadoTransferencia = (conta1.transferir(conta2,transferencia) == true) ?
        ("Transferido com sucesso " + transferencia) : "falha na transferencia";

        JOptionPane.showMessageDialog(null, resultadoTransferencia);

        


            
        
    
    }
}
