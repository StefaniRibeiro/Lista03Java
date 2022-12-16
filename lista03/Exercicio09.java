package lista03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float salarioMensal, percReajuste, reajuste, novoSalario;
		
		System.out.println("Informe seu sal�rio mensal: ");
		salarioMensal = sc.nextFloat();
		
		System.out.println("Informe o valor do reajuste (ex: se 5%, coloque apenas 5): ");
		percReajuste = sc.nextFloat();
		
		reajuste = (percReajuste / 100) * salarioMensal;
		
		novoSalario = salarioMensal + reajuste;
		
		System.out.printf("O novo valor do seu sal�rio � igual a: %.2f", novoSalario);
		
		sc.close();
	}

}