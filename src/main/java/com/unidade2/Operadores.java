package com.unidade2;

import javax.swing.JOptionPane;

public class Operadores {
    public static void main(String[] args) {
        float valor1, valor2;

        valor1 = Float.parseFloat(
            JOptionPane.showInputDialog("Digite o primeiro valor")
        );

        valor2 = Float.parseFloat(
            JOptionPane.showInputDialog("Digite o Segundo valor")
        );

        JOptionPane.showMessageDialog(
            null,"O primeiro valor é maior que o segundo valor ?\n"+(valor1>valor2)
        );

        JOptionPane.showMessageDialog(
            null,"O primeiro valor é igual ao segundo valor ?\n"+(valor1==valor2)
        );

        JOptionPane.showMessageDialog(
            null,"O primeiro valor é menor que o segundo valor ?\n"+(valor1<valor2)
        );

        /* float soma = (valor1 + valor2);
        float subtracao = (valor1 - valor2);
        float multiplicacao = (valor1 * valor2);
        float divisao = (valor1 / valor2);

        JOptionPane.showMessageDialog(
            null, "Diferentes operações com os valores digitados:\nSoma:"+soma+"\nsubtração: "+subtracao+"\n multiplicação: "+multiplicacao+"\n divisão: "+divisao
        ); */
    }
}
