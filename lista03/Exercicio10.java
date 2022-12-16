package lista03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int votosValidosCandidatoA, votosValidosCandidatoB, votosValidosCandidatoC, votosBrancos, votosNulos, totalEleitores, percValidos, percValidosA, percValidosB, percValidosC, percBrancos, percNulos;

		System.out.println("Digite a quantidade de votos para o candidato A: ");
		votosValidosCandidatoA = sc.nextInt();

		System.out.println("Digite a quantidade de votos para o candidato B: ");
		votosValidosCandidatoB = sc.nextInt();

		System.out.println("Digite a quantidade de votos para o candidato C: ");
		votosValidosCandidatoC = sc.nextInt();

		System.out.println("Digite o total de votos nulos: ");
		votosNulos = sc.nextInt();

		System.out.println("Digite o total de votos em branco: ");
		votosBrancos = sc.nextInt();

		totalEleitores = votosValidosCandidatoA + votosValidosCandidatoB + votosValidosCandidatoC + votosNulos
				+ votosBrancos;
	
		percValidos = ((votosValidosCandidatoA + votosValidosCandidatoB + votosValidosCandidatoC * 100) / totalEleitores);
		percValidosA = (votosValidosCandidatoA * 100) / totalEleitores;
		percValidosB = (votosValidosCandidatoB * 100) / totalEleitores;
		percValidosC = (votosValidosCandidatoC * 100) / totalEleitores;

		percBrancos = (votosBrancos * 100) / totalEleitores;
		percNulos = (votosNulos * 100) / totalEleitores;

		System.out.println("O n�mero total de eleitores � igual a: " + totalEleitores);
		System.out.println("O percentual de votos v�lidos em rela��o � quantidade total de eleitores � igual a: " + percValidos + "%");
		System.out.println("O percentual de votos v�lidos para o candidato A � igual a: " + percValidosA + "%");
		System.out.println("O percentual de votos v�lidos para o candidato B � igual a: " + percValidosB + "%");
		System.out.println("O percentual de votos v�lidos para o candidato C � igual a: " + percValidosC + "%");
		System.out.println("O percentual de votos nulos � igual a: " + percNulos + "%");
		System.out.println("O percentual de votos brancos � igual a: " + percBrancos + "%");

		sc.close();

	}

}