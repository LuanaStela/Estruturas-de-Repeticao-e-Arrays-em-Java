package Desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        for (int i = 0; i < nomesFila.length; i++) {
            nomesFila[i] = nome.next();

            System.out.format("%s - está na posição: %d%n", nomesFila[i], (i + 1));
        }
    }
}
