package br.com.java.desafios.desafio01;
import java.util.Scanner;

public class Desafio1Bootcamp {




        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int custoFabrica = scan.nextInt();
            int porcentagemDistribuidor = scan.nextInt();
            int percentualImpostos = scan.nextInt();

            int custoConsumidor;

            int distribuidor;
            int valorImpostos;

            // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

            distribuidor = ((custoFabrica * porcentagemDistribuidor) / 100);
            valorImpostos = ((custoFabrica * percentualImpostos) / 100);
            custoConsumidor = distribuidor + valorImpostos + custoFabrica;



            System.out.println(custoConsumidor);
        }
    }
