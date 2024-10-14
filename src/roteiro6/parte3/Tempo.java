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

	public static int duracaoDaLigacao(Tempo inicioDaLigacao, Tempo fimDaLigacao) {

		int inicioDaLigacaoEmMinutos = inicioDaLigacao.hora * 60 + inicioDaLigacao.minuto;
		int fimDaLigacaoEmMinutos = fimDaLigacao.hora * 60 + fimDaLigacao.minuto;

		return fimDaLigacaoEmMinutos - inicioDaLigacaoEmMinutos;

	}

	public static double duracaoTotalDaLigacao(Tempo inicioDaLigacao, Tempo fimDaLigacao) {

		double inicioDaLigacaoEmSegundos;
		double fimDaLigacaoEmSegundos;
		double duracaoDaLigacaoEmSegundos;
		double duracaoDaLigacaoEmMinutos;

		inicioDaLigacaoEmSegundos = inicioDaLigacao.hora * 3600 + inicioDaLigacao.minuto * 60 + inicioDaLigacao.segundo;
		fimDaLigacaoEmSegundos = fimDaLigacao.hora * 3600 + fimDaLigacao.minuto * 60 + fimDaLigacao.segundo;
		duracaoDaLigacaoEmSegundos = fimDaLigacaoEmSegundos - inicioDaLigacaoEmSegundos;

		duracaoDaLigacaoEmMinutos = duracaoDaLigacaoEmSegundos / 60;

		if (duracaoDaLigacaoEmSegundos % 60 > 0) {
			duracaoDaLigacaoEmMinutos += 1;
		}

		return duracaoDaLigacaoEmMinutos;

	}

}
