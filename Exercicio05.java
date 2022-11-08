package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = sc.nextDouble();

        double reajuste = salario * 0.07;

        System.out.println("O valor do seu salario antes do reajuste é: "+ salario);
        System.out.println("O valor do seu salario após do reajuste é: "+ (salario + reajuste));


    }
}
