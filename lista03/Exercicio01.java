package lista03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c, d, AeB, AeC, AeD, BeC, BeD, CeD, AvezesB, AvezesC, AvezesD, BvezesC, BvezesD, CvezesD;

		System.out.println("Informe um valor: ");
		a = sc.nextInt();

		System.out.println("Informe um valor: ");
		b = sc.nextInt();

		System.out.println("Informe um valor: ");
		c = sc.nextInt();

		System.out.println("Informe um valor: ");
		d = sc.nextInt();

		AeB = a + b;
		AeC = a + c;
		AeD = a + d;
		BeC = b + c;
		BeD = b + d;
		CeD = c + d;

		AvezesB = a * b;
		AvezesC = a * c;
		AvezesD = a * d;
		BvezesC = b * c;
		BvezesD = b * d;
		CvezesD = c * d;

		System.out.println("Os resultados s�o: ");
		System.out.println(a + " + " + b + " � igual a: " + AeB);
		System.out.println(a + " + " + c + " � igual a: " + AeC);
		System.out.println(a + " + " + d + " � igual a: " + AeD);
		System.out.println(b + " + " + c + " � igual a: " + BeC);
		System.out.println(b + " + " + d + " � igual a: " + BeD);
		System.out.println(c + " + " + d + " � igual a: " + CeD);

		System.out.println(a + " X " + b + " � igual a: " + AvezesB);
		System.out.println(a + " X " + c + " � igual a: " + AvezesC);
		System.out.println(a + " X " + d + " � igual a: " + AvezesD);
		System.out.println(b + " X " + c + " � igual a: " + BvezesC);
		System.out.println(b + " X " + d + " � igual a: " + BvezesD);
		System.out.println(c + " X " + d + " � igual a: " + CvezesD);

		sc.close();

	}

}