package roteiro2.parte3;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		while (cont < 5) {
			System.out.print("Informe uma nota: ");
			int grade = sc.nextInt();
			if (grade >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			cont++;
		}
		sc.close();

	}

}
