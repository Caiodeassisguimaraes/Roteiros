package roteiro6.parte3;

public class Principal {

	public static void main(String[] args) {

		Tempo horaInicio = new Tempo(9, 55, 50);
		Tempo horaFim = new Tempo(10, 03, 53);

		Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", horaInicio);

		lig01.setHoraFim(horaFim);
		double valorDoMinuto = 1.0;

		System.out.printf("Valor da Ligação sem considerar os segundos: R$ %.2f%n", lig01.valorDaLigacao(valorDoMinuto));

		System.out.println();

		System.out.printf("Valor da Ligação considerando os segundos: R$ %.2f%n", lig01.valorTotalDaLigacao(valorDoMinuto));

	}

}
