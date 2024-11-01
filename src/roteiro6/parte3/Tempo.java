package roteiro6.parte3;

public class Tempo {
	private int hora;
	private int minuto;
	private int segundo;

	public Tempo(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	// 1 minuto = 60 segundos
	// 1 hora = 60 minutos
	// 1 hora = 3600 segundos
	// Conversao de minuto para segundo = minuto * 60
	// Conversao de hora para minuto = hora * 60
	// Conversao de hora para segundo = hora * 3600
	// Conversao de segundo para inuto = segundo / 60
	// Conversao de minuto para hora = minuto / 60
	// Conversao de segundo para hora = segundo / 3600

	public static double duracaoDaLigacao(Tempo inicioDaLigacao, Tempo fimDaLigacao) {

		double inicioDaLigacaoEmSegundos = inicioDaLigacao.hora * 3600.0 + inicioDaLigacao.minuto * 60.0
				+ inicioDaLigacao.segundo;
		double fimDaLigacaoEmSegundos = fimDaLigacao.hora * 3600.0 + fimDaLigacao.minuto * 60.0 + fimDaLigacao.segundo;
		double duracaoDaLigacaoEmSegundos = fimDaLigacaoEmSegundos - inicioDaLigacaoEmSegundos;

		return duracaoDaLigacaoEmSegundos / 60.0;

	}

	public static double duracaoTotalDaLigacao(Tempo inicioDaLigacao, Tempo fimDaLigacao) {

		double duracaoDaLigacaoEmMinutos = duracaoDaLigacao(inicioDaLigacao, fimDaLigacao);

		if (duracaoDaLigacaoEmMinutos > (int) duracaoDaLigacaoEmMinutos) {
			duracaoDaLigacaoEmMinutos += 1;
		}

		return duracaoDaLigacaoEmMinutos;

	}

}
