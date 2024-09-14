package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o seu nome: ");
		String name = sc.nextLine();

		System.out.print("Informe sua idade: ");
		int age = sc.nextInt();

		System.out.println("Nome informado: " + name);

		System.out.println("Nome informado: " + age);

		sc.close();

	}

}
