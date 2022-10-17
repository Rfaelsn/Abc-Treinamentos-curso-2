package com.unidade3;

import javax.swing.JOptionPane;

public class DesafioString {
    public static void main(String[] args) {
        String nome = "O curso de java";
        String avaliacao = " é ótimo !";

        JOptionPane.showMessageDialog(null, nome+avaliacao);
        JOptionPane.showMessageDialog(null, nome.substring(11));
    }
}
