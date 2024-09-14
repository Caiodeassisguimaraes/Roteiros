package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int grade;

		do {
			System.out.print("Informe uma nota ou digite -1 para parar: ");
			grade = sc.nextInt();
			if (grade == -1) {
				System.out.print("Programa encerrado.");
				break;
			} else if (grade >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		} while (grade != -1);

		sc.close();
	}
}