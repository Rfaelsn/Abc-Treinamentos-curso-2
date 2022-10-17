package com.unidade2;

import javax.swing.JOptionPane;

public class AplicacaoMedia {
    public static void main(String[] args) {
        int somMedia = 0;
        int contMedia = 0;
        double media;
        int maior,menor;
        int valor = Integer.parseInt(
            JOptionPane.showInputDialog("digite um valor (digite -1 para finalizar o programa)")
        );
        menor = maior = valor;
        
        while (valor != -1){
            somMedia += valor;
            contMedia++;
            
            if (maior<valor) {
                maior = valor;
            }else if (valor<menor) {
                menor = valor;
            }

            valor = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "digite um valor para calcular a média (-1 para finalizar o programa)"
                )
            );
        }

        if (contMedia > 0){
            media = (somMedia/contMedia);
    
            JOptionPane.showMessageDialog(null, "a média dos valores digitados é de :"+media+"\no maior valor digitado foi: "+maior+"\n e o menor valor digitado foi: "+menor);
        }else{
            JOptionPane.showMessageDialog(null,"Programa encerrado");
        }
        
        

        

    }
}
