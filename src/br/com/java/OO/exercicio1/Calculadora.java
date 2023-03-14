package br.com.java.OO.exercicio1;

;

class Calculadora implements OperacaoMatematica {

@Override
public void soma(double num1, double num2) {
    System.out.println("Soma "+ num1+num2);
    
    throw new UnsupportedOperationException("Unimplemented method 'soma'");
}

@Override
public void subtracao(double num1, double num2) {
    System.out.println("subtracao "+ (num1-num2));
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subtracao'");
}

@Override
public void multiplicacao(double num1, double num2) {
    System.out.println("Multiplicacao "+ num1*num2);
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'multiplicacao'");
}

@Override
public void divisao(double num1, double num2) {
    System.out.println("Divisao "+ num1/num2);
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'divisao'");
}
}