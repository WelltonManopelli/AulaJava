package br.com.java.exercicios.arrays;

import javax.swing.*;
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        int numeroTabuada = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para tabuada"));

        System.out.println("Tabuada de "+ numeroTabuada);

        for (int i=0; i<=10; i++){
            System.out.println(numeroTabuada+ " x " + i + " = " + (i*numeroTabuada));
        }
    }

}
