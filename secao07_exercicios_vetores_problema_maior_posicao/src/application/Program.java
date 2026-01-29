/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		System.out.println();
		double maiorValor = 0;
		int maiorPosicao = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				maiorPosicao = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + maiorPosicao);

		sc.close();

	}

}
