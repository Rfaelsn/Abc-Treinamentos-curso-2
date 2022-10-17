package com.unidade2;

import javax.swing.JOptionPane;

public class IntervaloAB {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B"));
        String resultado = "";
        int somValores = 0;


        for (int i = (a+1); i < b; i++) {
            resultado += (!((i+1)==b)) ? (i+"+") : (i+"= ");
            somValores += i;
        }

        JOptionPane.showMessageDialog(null,resultado+somValores);
    }
}
