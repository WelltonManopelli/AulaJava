package br.com.java.exercicios.arrays;

import javax.swing.*;

public class Ex_OrdemInversa {

    public static void main(String[] args) {
        int [] numeros = new int[5];


        for (int i=0; i<numeros.length;i++){
           numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }
        for (int i= numeros.length-1; i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
