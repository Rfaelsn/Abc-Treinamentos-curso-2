package com.unidade2;

public class VetorAB {
    public static void main(String[] args) {
        float a [] =  new float [50];
        float b [] = new float [50];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;

            b[i] = (i%2==0) ? (2*a[i]) : (a[i]/2);
        }

        for (float i : a) {
           System.out.print(i+"|"); 
        }

         System.out.println("\n");

        for (float i : b) {
            System.out.print(i+"|");
        }

    }
}
