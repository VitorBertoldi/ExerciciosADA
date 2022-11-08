package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        double idade = sc.nextDouble();

        double dias = idade * 365.25;

        System.out.printf("Voce ja viveu %.2f dias", dias);
    }
}
