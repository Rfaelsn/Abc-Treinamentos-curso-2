package com.unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {
    public static void main(String[] args) {
        float notaAluno = Float.parseFloat(
            JOptionPane.showInputDialog("digite a nota do aluno (0 a 100)")
        );

        if (notaAluno < 0 || notaAluno > 100){
            JOptionPane.showMessageDialog(null,"Valor inválido ! digite numero de 0 a 100");
            Avaliacao.main(null);
        }

        if (notaAluno < 50) {
            JOptionPane.showMessageDialog(null,"Conceito Insuficiente");
        }else if (notaAluno < 70){
            JOptionPane.showMessageDialog(null,"Conceito Regular");
        }else if (notaAluno < 90) {
            JOptionPane.showMessageDialog(null,"Conceito Bom");
        }else{
            JOptionPane.showMessageDialog(null,"Conceito Excelente");
        }
    }
}
