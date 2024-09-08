package roteiro1.parte2;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horasTrabalhadasNoMes = 160;
		
		System.out.print("Digite o salario base: ");
		double salarioBase = sc.nextDouble();
		int valorDaHoraTrabalhada = (int) (salarioBase/horasTrabalhadasNoMes);
		System.out.print("Digite as horas extras: ");
		int quantidadeDeHorasExtrasTrabalhadas = sc.nextInt();
		double salarioTotal = salarioBase + (quantidadeDeHorasExtrasTrabalhadas*valorDaHoraTrabalhada);
		System.out.println("Salario base = " + salarioBase);
		System.out.println("Valor da hora extra = " + valorDaHoraTrabalhada);
		System.out.println("Quantidade de horas extras trabalhadas = " + quantidadeDeHorasExtrasTrabalhadas);
		System.out.println("Salario total = " + salarioTotal);
		
		sc.close();

	}

}
