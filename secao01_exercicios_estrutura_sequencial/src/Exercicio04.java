/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que 
 * recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do 
 * funcionário, com duas casas decimais.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroDoFuncionario, quantidadeHorasTrabalhadas;
		double valorPorHora, salario;

		numeroDoFuncionario = sc.nextInt();
		quantidadeHorasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();

		salario = quantidadeHorasTrabalhadas * valorPorHora;

		System.out.println("NUMBER = " + numeroDoFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
