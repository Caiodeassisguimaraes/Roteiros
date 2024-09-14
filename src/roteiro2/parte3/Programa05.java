package roteiro2.parte3;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int cont = 0; cont < 5; cont++) {
			System.out.print("Informe uma nota: ");
			int grade = sc.nextInt();

			if (grade >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}

		}

		sc.close();

	}

}
