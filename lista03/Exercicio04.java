package lista03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		float cotacaoDolar, conversao;
		int qtdDolar;

		System.out.println("Informe a cota��o do d�lar: ");
		cotacaoDolar = sc.nextFloat();

		System.out.println("Informe a quantidade de d�lares que voc� tem: ");
		qtdDolar = sc.nextInt();

		conversao = qtdDolar * cotacaoDolar;

		System.out.printf("Essa quantidade de d�lares convertidos em real � igual a: %.2f ", conversao);

		sc.close();

	}

}