package com.aovivo.desafiogarcomenumswitch;

import javax.swing.JOptionPane;

public class AppGarcom {
    static GorjetaGarcom qualidadeServico;

    public static void main(String[] args) {
        double valorGorjeta;
        double valorConta = Double.parseDouble(
            JOptionPane.showInputDialog("digite o total da conta")
        );
    
        Object opcaoSelecionada = JOptionPane.showInputDialog(
                null, "Selecione uma avaliação para o garçom",
                null, JOptionPane.INFORMATION_MESSAGE, null,    
                qualidadeServico.values(), qualidadeServico.EXCELENTE
        );

        qualidadeServico = (GorjetaGarcom) opcaoSelecionada;

        valorGorjeta = switch (qualidadeServico) {
            case RUIM ->  (valorConta*qualidadeServico.getPorcentGorjeta());
            case REGULAR -> (valorConta*qualidadeServico.getPorcentGorjeta());
            case BOM -> (valorConta*qualidadeServico.getPorcentGorjeta());
            case EXCELENTE -> (valorConta*qualidadeServico.getPorcentGorjeta());
            default -> 0;
        };

        JOptionPane.showMessageDialog(null,"o Total da conta é de: "+(valorConta+valorGorjeta)+"\n valor consumido: "+valorConta+"\n valor Gorjeta: "+valorGorjeta);

    }
}
