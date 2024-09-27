package roteiro2.parte4;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetorNotas = new int[5];
		
		
		/*for (int cont = 0; cont < 5; cont++) {
			System.out.print("Informe uma nota: ");
			int nota = sc.nextInt();
			while (nota <= 0 || nota > 10) {
				System.out.print("Nota inválida, digite uma nota de 1 a 10: ");
				nota = sc.nextInt();
			}
			vetorNotas[cont] = nota;
		}*/

		for (int cont = 0; cont < 5; cont++) {
			System.out.println(vetorNotas[cont]);
		}

		sc.close();

	}

}
