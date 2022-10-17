package com.unidade2;

import javax.swing.JOptionPane;

public class AplicacaoExpoente {
    public static void main(String[] args) {
        double e = 0;

        JOptionPane.showMessageDialog(null,"programa para calcular a sequência e^x = (x^1)/1+(x^2)/2 .... (50 elementos)");
        double x = Double.parseDouble(
            JOptionPane.showInputDialog("digite o valor de x")
        );
        
        for (int i = 1; i <= 50; i++) {
            e += (Math.pow(x, i)/i);
        }

        JOptionPane.showMessageDialog(null, "o resultado da sequência é: "+e);
    }
}
