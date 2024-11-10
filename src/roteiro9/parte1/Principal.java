package roteiro9.parte1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();

		Quadrado quadrado = new Quadrado(altura);
		Retangulo retangulo = new Retangulo(altura, largura);

		System.out.println();
		System.out.println("Area do " + quadrado.getNomeFigura() + ": " + quadrado.getArea());
		System.out.println("Perimetro do " + quadrado.getNomeFigura() + ": " + quadrado.getPerimetro());
		System.out.println();
		System.out.println("Area do " + retangulo.getNomeFigura() + ": " + retangulo.getArea());
		System.out.println("Area do " + retangulo.getNomeFigura() + ": " + retangulo.getPerimetro());

		sc.close();

	}

}
