package br.com.java.exercicios.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        double number;
        double total = 0;
        double maior=0;
        int i=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            number = scan.nextInt();
            total+=number;

            if(number>maior)
                maior=number;
            i++;

        }while (i<5);

        System.out.println("O maior numero é " + maior);
        System.out.println("A media é " + total/5);


    }




}
