package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;

		System.out.println("Bem-vindo ao jogo de adivinhação!");

		System.out.println("Numero secreto: " + randomNumber);

		System.out.println("Tente adivinhar um número entre 1 e 100.");
		System.out.print("Dê o seu palpite: ");
		int palpite = sc.nextInt();

		while (palpite != randomNumber) {
			if (palpite > randomNumber) {
				System.out.println("O seu palpite é maior do que o número. Tente novamente:");
				palpite = sc.nextInt();
			} else {
				System.out.println("O seu palpite é menor do que o número. Tente novamente: ");
				palpite = sc.nextInt();
			}

		}

		System.out.println("Parabéns! Você acertou!");

		sc.close();
	}

}
