package br.com.java.exercicios.arrays;

import javax.swing.*;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        double qtdNumero = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de numeros "));
        int i=0, qtdPar=0, qtdImpar=0;

        while (i<qtdNumero){
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de numeros "));
            if(numero%2==0){
                qtdPar++;
            }
            else{
                qtdImpar++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Quantidade de numeros pares =  " + qtdPar + "  " +
                "e quantidade de numeros impares =" +
                qtdImpar);



    }
}
