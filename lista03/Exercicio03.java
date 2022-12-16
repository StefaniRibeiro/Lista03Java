package lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		float comprimento, largura, altura, volume;
		
		System.out.println("Informe o comprimento da caixa retangular: ");
		comprimento = sc.nextFloat();
		
		System.out.println("Informe a largura da caixa retangular: ");
		largura = sc.nextFloat();
		
		System.out.println("Informe a altura da caixa retangular: ");
		altura = sc.nextFloat();
		
		volume = comprimento*largura*altura;
		
		System.out.printf("O volume da caixa retangular � igual a: %.2f", volume);
		
		sc.close();
	}

}