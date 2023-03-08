package br.com.java.exercicios.arrays;

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main(String[] args) {

        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Digie o Nome: ");
            nome = scan.next();
            if ((nome.equals("Sair")) || (nome.equals("sair")))  break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }


}