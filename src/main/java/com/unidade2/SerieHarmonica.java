package com.unidade2;

import javax.swing.JOptionPane;

public class SerieHarmonica {
    public static void main(String[] args) {
        double resultHarmonic = 0;
        int n = Integer.parseInt(
            JOptionPane.showInputDialog("digite quantas posições da serie harmônica você deseja calcular")
        );

        for (int i = 1; i <= n; i++) {
            resultHarmonic += (1/i);
        }

        JOptionPane.showMessageDialog(null, "o resultado é igual a: "+resultHarmonic);

    }
}
