package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       float valor1;
       float valor2;
       Scanner leitor=new Scanner(System.in);
       System.out.println("Digite o valor da doação em dólar");
       valor1= leitor.nextFloat();
       valor2= (float) (valor1*4.91);
       System.out.println("o valor doado em reais é de " + valor2);
       leitor.close();
    }
}
