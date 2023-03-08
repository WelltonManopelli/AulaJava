package br.com.java.exercicios.arrays;

import javax.swing.*;

public class Ex_Consoantes {
    public static void main(String[] args) {
       String[] consoantes = new String[6];
       String letra;
       int cont=0;
       do {
           letra = JOptionPane.showInputDialog("Insira um numero :");


           if ((letra.equalsIgnoreCase("a") |
                   letra.equalsIgnoreCase("e") |
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u"))) {
               consoantes[cont]=letra;
           }
           cont++;

       }while(cont < consoantes.length);

       for(String consoante : consoantes){
           JOptionPane.showMessageDialog(null,consoante);
       }
    }
}
