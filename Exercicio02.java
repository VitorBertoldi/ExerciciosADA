package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double cavalos;

        System.out.println("Digite m: ");
        double m = sc.nextDouble();
        System.out.println("Digite h: ");
        double h = sc.nextDouble();
        System.out.println("Digite t: ");
        double t = sc.nextDouble();

        cavalos = (m * h / t) / 745.6999;

        System.out.printf("O numero de cavalos necessarios para se levantar a massa é: %.2f", cavalos);


    }

}
