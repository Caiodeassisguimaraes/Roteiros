package roteiro3.parte1;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sb, grat, imp, sr;

		System.out.println("Informe o salário base: ");
		sb = sc.nextDouble();
		grat = Programa11.calcGrat(sb);
		// grat = calcGrat(sb);
		imp = Programa11.calcImp(sb);
		//imp = calcImp(sb);
		sr = sb + grat - imp;
		System.out.println("Salário a receber: " + sr);
		sc.close();

	}

	public static double calcImp(double sb) {

		return sb * 7 / 100;
	}

	public static double calcGrat(double sb) {
		return sb * 5 / 100;
	}

}
