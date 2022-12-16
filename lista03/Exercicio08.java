package lista03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c, d, produto, soma;

		System.out.println("Informe o valor de A:");
		a = sc.nextInt();

		System.out.println("Informe o valor de B: ");
		b = sc.nextInt();

		System.out.println("Informe o valor de C: ");
		c = sc.nextInt();

		System.out.println("Informe o valor de D: ");
		d = sc.nextInt();

		produto = a * c;
		soma = b + d;

		System.out.println("O resultado do produto do primeiro com o terceiro valor � igual a: " + produto);
		System.out.println("O resultado da soma do segundo com o quarto valor � igual a: " + soma);

		sc.close();
	}

}