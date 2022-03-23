package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        float valor1;
        float valor2;
        float valor3;
        float res;
        System.out.println("Olá, vamos lhe mostrar quantos quilômetros seu carro faz por litro de gasolina. ");
        System.out.println("Para isso digite quantos quilômetros marca em seu painel no ínicio da viagem. ");
        valor1= leitor.nextFloat();
        System.out.println("Certo, agora digite quantos quilômetros marca em seu painel ao chegar no posto de combustível ");
        valor2= leitor.nextFloat();
        System.out.println("Agora informe quantos litros de gasolina foram reabastecidos.");
        valor3= leitor.nextFloat();
        res= (valor2 - valor1) / valor3;
        System.out.println("O seu carro está fazendo " + res + " quilômetros em média por litro. ");
        leitor.close();
    }
}
