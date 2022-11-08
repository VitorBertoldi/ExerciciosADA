package ExerciciosAula02;

import java.util.Map;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.println("Digite a quantidade de meses: ");
        double qtdeMeses = sc.nextDouble();

        double M = valorEmprestimo * Math.pow(1 + 0.02, qtdeMeses);

        System.out.println("Voce ira pagar: " + M);
    }
}
