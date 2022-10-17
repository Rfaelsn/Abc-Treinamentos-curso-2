package com.aovivo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class DesafioValidarEmail {
    public static void main(String[] args) {
        String regex = "([A-Za-z0-9\\._-])+@([A-Za-z])+(\\.([A-Za-z])+)+";
        String email = JOptionPane.showInputDialog("Digite seu Email");
        String emailValidacao = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        while (matcher.find()) {
            emailValidacao = matcher.group();
        }

        if (email == emailValidacao) {
            JOptionPane.showMessageDialog(null,"Email válido");
        }else{
            JOptionPane.showMessageDialog(null,"Email inválido");
        }
        

        /*Solução utilizando método matches*/
        /* if (email.matches(regex)) {
            JOptionPane.showMessageDialog(null,"Email válido");
        }else{
            JOptionPane.showMessageDialog(null,"Email inválido");
        } */
    }
}
