package br.com.java.desafios.desafio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        double x;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:

        for ( int i=0; i<6; i++) {
            x = scan.nextDouble();

            if(x>0){
                media+=x;
                cont++;
                }
        }

        media = media/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

    }
}



