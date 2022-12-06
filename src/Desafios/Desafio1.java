package Desafios;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        int soma = (idade1 + idade2 + idade3)/3;


        if (soma < 25) {
            System.out.println("Jovem!");
        } else
            if (soma > 26 && soma < 60) {
                System.out.println("Adultos!");
            
        } else {
                System.out.println("Idosa!");
            }
    }
}
