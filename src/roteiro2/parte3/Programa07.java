package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double grade;
		double sum = 0.0;
		double count = 0.0;
		double average;

		do {
			System.out.print("Informe uma nota ou digite -1 para parar: ");
			grade = sc.nextInt();
			if (grade == -1) {
				if (count > 1) {
					average = sum / count;
					System.out.print("Media: " + average);

				} else {
					System.out.print("Programa encerrado.");
				}
				break;
			} else if (grade >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			sum += grade;
			count += 1;
		} while (grade != -1);

		sc.close();

	}

}
