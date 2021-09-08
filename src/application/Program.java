package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario fun = new Funcionario();
        System.out.print("Nome: ");
        fun.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        fun.salarioBruto = sc.nextDouble();
        System.out.print("imposto: ");
        fun.imposto = sc.nextDouble();
        System.out.println();
        System.out.println("Funcionario: " + fun);
        System.out.println();
        System.out.print("Qual percentual para aumentar o salário? ");
        double percentual = sc.nextDouble();
        fun.increaseSalary(percentual);
        System.out.println();
        System.out.println("Salario atualizados: " + fun);
        sc.close();
    }
}
