package com.ada;

public class Calculadora {

    public int qtdeOperacoes = 0;

    public int somar(int x, int y){
        qtdeOperacoes++;
        return x + y;
    }

    public int subtrair(int x, int y){
        qtdeOperacoes++;
        return x - y;
    }

    public float dividir(int x, int y){
        qtdeOperacoes++;
        return x / y;
    }
}