package roteiro9.parte2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o raio: ");
		double raio = sc.nextDouble();

		Quadrado quadrado = new Quadrado(altura);
		Retangulo retangulo = new Retangulo(altura, largura);
		Circulo circulo = new Circulo(raio);

		System.out.println();
		System.out.println("Area do " + quadrado.getNomeFigura() + ": " + quadrado.getArea());
		System.out.println("Perimetro do " + quadrado.getNomeFigura() + ": " + quadrado.getPerimetro());
		System.out.println();
		System.out.println("Area do " + retangulo.getNomeFigura() + ": " + retangulo.getArea());
		System.out.println("Perimetro do " + retangulo.getNomeFigura() + ": " + retangulo.getPerimetro());
		System.out.println();
		System.out.printf("Area do " + circulo.getNomeFigura() +": %.2f%n" , circulo.getArea());
		System.out.printf("Perimetro do " + circulo.getNomeFigura() + ": %.2f%n" , circulo.getPerimetro());

		sc.close();

	}

}
