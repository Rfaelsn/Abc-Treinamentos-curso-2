package com.unidade2;

import javax.swing.JOptionPane;

public class AplicacaoFibonacci {
    public static void main(String[] args) {
        int s1 = 1;
        int s2 = 1;
        int s = (s1+s2);
        System.out.print(s1+","+s2+","+s+",");
        int somaFibonacci = (s1+s2+s);
        double mediaFibonacci = 0;
        int elemento;

        elemento = Integer.parseInt(
            JOptionPane.showInputDialog("digite qual elemento você deseja saber da sequência de fibonacci")
        );

        if (elemento == 1 || elemento == 2) {
            s = 1;
            mediaFibonacci = 1;
        }else if (elemento <= 0) {
            JOptionPane.showMessageDialog(null,"valor inválido");
            AplicacaoFibonacci.main(null);
        }else{
            for (int i = 4; i <= elemento; i++) {
                s1 = s2;
                s2 =  s;
                s = (s1+s2);
                somaFibonacci += s;
                System.out.print(s+",");
            }
            mediaFibonacci = (somaFibonacci/elemento);
        }

        JOptionPane.showMessageDialog(null, "o valor do elemento "+elemento+" da sequência de fibonacci é igual a: "+s+"(sequência completa no terminal)"+"\n a média desta sequência é igual a "+mediaFibonacci);
    }
}
