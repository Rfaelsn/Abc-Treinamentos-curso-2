package com.unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral {
    public static void main(String[] args) {
        double fatJaneiro; //= 15_000f;
        double fatFevereiro; //= 23_000f;
        double fatMarco; //= 17_000f;

        fatJaneiro = Double.parseDouble(
            JOptionPane.showInputDialog("digite o faturamento de Janeiro")
        );

        fatFevereiro = Double.parseDouble(
            JOptionPane.showInputDialog("digite o faturamento de Fevereiro")
        );

        fatMarco = Double.parseDouble(
            JOptionPane.showInputDialog("digite o faturamento de Março")
        );

        double fatTrimestral = (fatJaneiro+fatFevereiro+fatMarco);

        JOptionPane.showMessageDialog(
            null,"o Faturamento Trimistral doi de "+fatTrimestral+"R$"
        );
    }
}
