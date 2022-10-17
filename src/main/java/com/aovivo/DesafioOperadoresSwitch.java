package com.aovivo;

import javax.swing.JOptionPane;

public class DesafioOperadoresSwitch {
    public static void main(String[] args) {
        
        double valor1,valor2;
        String opcao [] = new String[] {"Soma","Subtração","Divisão","Multiplicação"};

        valor1 = Double.parseDouble(
            JOptionPane.showInputDialog("digite o primeiro valor ")
        );

        valor2 = Double.parseDouble(
            JOptionPane.showInputDialog("digite o segundo valor")
        );

        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
                null, "Seleciona opção de saque",
                null, JOptionPane.QUESTION_MESSAGE, null, 
                opcao, null
        );


        String result = switch(opcaoSelecionada){
            case "Soma" -> String.valueOf(valor1+valor2);
            case "Subtração" -> String.valueOf(valor1-valor2);
            case "Multiplicação" -> String.valueOf(valor1*valor2);
            case "Divisão" -> (valor2==0) ? "erro. não é possivel dividir por 0!":String.valueOf(valor1/valor2);
            default -> "operação inválida";
        };

        JOptionPane.showMessageDialog(null,"Resultado: "+result);
    }
}
