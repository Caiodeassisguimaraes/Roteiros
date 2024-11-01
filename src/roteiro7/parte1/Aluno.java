package roteiro7.parte1;

public class Aluno {

	private int matricula;
	private String nome;
	private String curso;
	private int anoIngresso;
	private int qtdeDisciplinas;
	private String situacao;

	public Aluno() {

	}

	public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso, int pQtdeDisciplinas) {
		this.matricula = pMatricula;
		this.nome = pNome;
		this.curso = pCurso;
		this.anoIngresso = pAnoIngresso;
		this.setQtdeDisciplinas(pQtdeDisciplinas);
	}

	public Aluno(int matricula, String nome, String curso, int anoIngresso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getQtdeDisciplinas() {
		return qtdeDisciplinas;
	}

	public void setQtdeDisciplinas(int qtdeDisciplinas) {
		this.qtdeDisciplinas = qtdeDisciplinas;
		if (this.qtdeDisciplinas > 0) {
			setSituacao("Matriculado");
		} else {
			setSituacao("Não Matriculado");
		}
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
