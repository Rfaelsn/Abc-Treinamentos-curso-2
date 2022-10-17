package com.unidade2;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * 2) Escreva uma classe Java para criar uma matriz 4x4 de
 * números inteiros. Em seguida, inicialize esta matriz e informe
 * todos os elementos presentes e quantas vezes o mesmo aparece
 * na matriz.
 * */

public class Matriz4x4 {

    public static void main(String[] args) {
	final byte n = 4, posicoesVetor = n * n;
	int[][] matriz = new int[n][n];
	int[] vet_aux = new int[posicoesVetor];
	int cont = 0;

	String message = "";
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++, cont++) {
		matriz[i][j] = Integer.parseInt(
			JOptionPane.showInputDialog("Informe o valor da matriz ["+(i+1)+"] ["+(j+1)+"]")
		);
		message += matriz[i][j] + " ";
		vet_aux[cont] = matriz[i][j];
	    }
	    message += "\n";
	}
	
	Arrays.sort(vet_aux);

	cont = 1;
	for (int i = 0; i < posicoesVetor - 1; i++) {
	    if (vet_aux[i] != vet_aux[i + 1]) {
			message += vet_aux[i] + ": " + cont + "\n";
			cont = 0;
		if (i + 1 == posicoesVetor - 1)
		    message += vet_aux[i + 1] + ": " + 1 + "\n";
	    } else if (i + 1 == posicoesVetor - 1)
			message += vet_aux[i] + ": " + (cont + 1) + "\n";

	    cont++;
	}

	JOptionPane.showMessageDialog(null, message);
    }

}
