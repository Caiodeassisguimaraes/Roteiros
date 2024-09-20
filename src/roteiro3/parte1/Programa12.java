package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sb;

		System.out.println("Informe o salário base: ");
		sb = sc.nextDouble();

		System.out.println("Salário a receber: " + salarioAReceber(sb));
		sc.close();

	}

	public static double salarioAReceber(double sb) {

		double grat, imp;

		grat = sb * 5 / 100;
		imp = sb * 7 / 100;
		return sb + grat - imp;

	}

}
