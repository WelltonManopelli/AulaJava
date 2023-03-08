package br.com.java.exercicios.arrays;

import javax.swing.*;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero :"));
        int fatorial = 1;

        for (int i=numero; i>0; i--){

            fatorial= fatorial * i;


        }
        JOptionPane.showMessageDialog(null,numero+"! = "+fatorial);


    }
}
