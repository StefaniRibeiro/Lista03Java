package lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		double quadA, quadB, quadC, soma;
		
		System.out.println("Informe o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = sc.nextInt();
		
		System.out.println("Informe o valor de C: ");
		c = sc.nextInt();
		
		quadA = Math.pow(a, 2);
		quadB = Math.pow(b, 2);
		quadC = Math.pow(c, 2);
		
		soma = quadA + quadB + quadC;
		
		System.out.printf("O resultado da soma dos quadrados dos tr�s valores � igual a: %.2f", soma);
		
		sc.close();
		
	}

}