package roteiro2.parte4;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * double grade; double sum = 0.0; double count = 0.0; double average;
		 * 
		 * do { System.out.print("Informe uma nota ou digite -1 para parar: "); grade =
		 * sc.nextInt(); if (grade == -1) { if (count > 1) { average = sum / count;
		 * System.out.print("Media: " + average);
		 * 
		 * } else { System.out.print("Programa encerrado."); } break; } else if (grade
		 * >= 7) { System.out.println("Aprovado"); } else {
		 * System.out.println("Reprovado"); } sum += grade; count += 1; } while (grade
		 * != -1);
		 */

		/*
		 * Utilizando a classe Programa07 implementado no pacote roteiro2.parte3, seria
		 * possível implementar uma solução que apresentasse não somente a média, mas
		 * quantas notas ficaram acima da média ? Sim ? Não ? Como ? Por quê ?
		 * 
		 * Não seria possível utilizar a mesma solução do Programa07 pois um vetor é
		 * uma coleçao de dados indexada, unidimensional, homogênea e de tamano fixo.
		 * Indexada pois os elementos são acessados por meio de índice,
		 * unidimensional porque diferentemente das matrizes o vetor possui apenas
		 * uma dimensão, e homogênea visto que todos os dados devem ser do mesmo
		 * tipo.
		 * O tamanho fixo significa que o vetor deve ser alocado previamente
		 * antes de ser utilizado, uma vez alocado, sua quantidade de elementos e
		 * fixa. 
		 * No Programa07 foi utilizado como premissa os mesmos requisitos do
		 * Programa06, ou seja, não havia uma quantidade pré-fefinida de notas que
		 * o usuário deveria informar e ao invés disso deveria ser implementada uma
		 * flag. Por isso não é possível utilizar um vetor no Programa07, mas abaixo
		 * segue uma solução alternativa:
		 */

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
		/*
		 * for (int cont = 0; cont < vetor.length; cont++) { if (vetor[cont] >= 7) {
		 * System.out.println(vetor[cont]); }
		 * 
		 * }
		 */

		// Alternativa: laço for each

		for (double notasAcimaDaMedia : vetor) {
			if (notasAcimaDaMedia >= 7) {
				System.out.println(notasAcimaDaMedia);
			}
		}

	}

}
