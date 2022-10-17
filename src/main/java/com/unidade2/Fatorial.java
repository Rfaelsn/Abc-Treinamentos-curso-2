package com.unidade2;

import javax.swing.JOptionPane;

public class Fatorial {
    public static int fatorial (int numero){
        if (numero == 0) {
            return 1;
        }else{
            return numero * fatorial(numero-1);
        }
    } 
    public static void main(String[] args) {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("digite um valor para calcular seu fatorial")
        ); 

        JOptionPane.showMessageDialog(null,"o fatorial de "+numero+" é igual a "+fatorial(numero));
    }
}
