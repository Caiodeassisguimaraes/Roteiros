package roteiro9.parte2;

public class Retangulo implements FiguraGeometrica {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public String getNomeFigura() {
		return "Retangulo";
	}

	@Override
	public double getArea() {
		return this.largura * this.altura;
	}

	@Override
	public double getPerimetro() {
		return 2 * (this.largura + this.altura);
	}

}
