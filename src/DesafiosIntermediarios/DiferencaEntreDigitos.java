package DesafiosIntermediarios;

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int soma = 0;
        int multiplicacao = 1;
        int diferenca = 0;

        for (int i = 0; i < split.length; i ++){
            int item = Integer.parseInt(split[i]);
            soma = soma + item;
            multiplicacao = multiplicacao * item;
        }

        diferenca = multiplicacao - soma;
        System.out.println(diferenca);
    }
}
