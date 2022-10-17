package com.unidade4.sisfuncionarios;

import javax.swing.JOptionPane;

public class SisFuncionarioApp {
    public static void main(String[] args) {
        Funcionario rafael = new Diretor();
        ((Diretor)rafael).setDepartamento("Nucelo de desenvolvimento tecnológico"); 
        verificaFuncionario(rafael);

        // ex  obj de interface
        Professor prof = new Professor();
        Autenticavel aut = prof; // objeto recebendo referência de um objeto
        Cidadao cid = prof;
        Contribuinte contrib = prof;
        
    }

    public static void verificaFuncionario(Funcionario funcionario){
        if (funcionario instanceof Diretor) {
            JOptionPane.showMessageDialog(null," O funcionário é um Diretor");
        }else if (funcionario instanceof Administrador){
            JOptionPane.showMessageDialog(null," O funcionário é um Administrador");
        }else{
            JOptionPane.showMessageDialog(null," O funcionário é um Professor");
        }
    }
}
