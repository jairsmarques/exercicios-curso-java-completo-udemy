/*
 * Fazer um programa para ler os dados de Nprodutos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de 
 * preço de cada produto na mesma ordem em que foram digitados.
 * 
 * Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados 
 * possuem data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço conforme
 * exemplo (próxima página). Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final 
 * do produto.
 * 
 */

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Datos do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Product(name, price));
			} else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
