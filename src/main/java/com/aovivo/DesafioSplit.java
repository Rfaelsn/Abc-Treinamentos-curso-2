package com.aovivo;

import javax.swing.JOptionPane;

public class DesafioSplit {
    public static void main(String[] args) {
        String data = "18/04/2001";
        String dataMesAno[] = new String [3];

        dataMesAno = data.split("/");

        for (String split : dataMesAno) {
            JOptionPane.showMessageDialog(null, split);
        }
    }
}
