package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = sc.nextDouble();

        System.out.println("A conversao da temperatura em celsius para Kelvin é: " + convK(tempCelsius));
        System.out.println("A conversao da temperatura em celsius para Fahrenheit é: " + convF(tempCelsius));
        System.out.println("A conversao da temperatura em celsius para Rankine é: " + convRa(tempCelsius));
        System.out.println("A conversao da temperatura em celsius para Reamour é: " + convRe(tempCelsius));

    }

    public static double convK(double temp) {
        double conversaoKelvin = temp + 273.15;
        return conversaoKelvin;
    }
    public static double convF(double temp) {
        double conversaoFahrenheit = temp * 1.8 + 32;
        return conversaoFahrenheit;
    }
    public static double convRa(double temp) {
        double conversaoRankine = temp * 1.8 + 32 + 459.67;
        return conversaoRankine;
    }
    public static double convRe(double temp) {
        double conversaoReamour = temp * 0.8;
        return conversaoReamour;
    }
}
