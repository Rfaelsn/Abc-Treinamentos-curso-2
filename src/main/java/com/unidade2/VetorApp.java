package com.unidade2;

import javax.swing.JOptionPane;

public class VetorApp {
    public static void main(String[] args) {
        //vetor de tipos primitivos
        int elementos = Integer.parseInt(
            JOptionPane.showInputDialog("digite até qual numero da sequencia de fibonacci você deseja visualizar")
        );
        int fibo[] = new int [elementos];
        fibo [0] = 1;
        fibo [1] = 1;
        fibo [2] =  fibo [0] + fibo [1];

        for (int i = 3; i < fibo.length; i++) {
            fibo[i] = fibo [i-1] + fibo [i-2];
        }

        for (int f : fibo) {
          System.out.print(f+",");  
        }

        // vetor de objetos
        String vetor[] = new String [10];
        vetor[0] = new String ("Rafael");
        vetor[1] = new String ("Antonio");

        for (String nomes : vetor) {
            System.out.print(nomes+",");
        }

        // matriz 
        int matriz[][] = new int [3][3];
        matriz [0] [0] = 100;

    }
}
