package com.unidade2;

import javax.swing.JOptionPane;

public class MatrizIdentidade {
    public static void main(String[] args) {
        int matriz_identidade [] [] = new int [3] [3];
        String result_matriz = "";
        for (int i = 0; i < matriz_identidade.length; i++) {
            for (int j = 0; j < matriz_identidade.length; j++) {
                if (i == j) {
                    matriz_identidade [i] [j] = 1;
                }else{
                    matriz_identidade [i] [j] = 0;
                }
                result_matriz += "("+matriz_identidade[i][j]+")  ";
            }
            result_matriz += "\n";
        }

        JOptionPane.showMessageDialog(null,"Matriz identidade:\n"+result_matriz);
    }
}
