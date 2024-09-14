package roteiro2.parte4;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de notas: ");
		int number = sc.nextInt();

		double[] vetor = new double[number];

		double soma = 0;

		for (int cont = 0; cont < number; cont++) {
			System.out.print("Informe uma nota: ");
			double grade = sc.nextInt();

			vetor[cont] = grade;

			if (grade >= 7) {
				System.out.println("Aprovado");

			} else {
				System.out.println("Reprovado");
			}
			soma += grade;
		}
		sc.close();

		double media = soma / number;

		System.out.println("Media: " + media);
		System.out.println("Notas acima da média: ");
		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] >= 7) {
				System.out.println(vetor[cont]);
			}

		}

	}

}
