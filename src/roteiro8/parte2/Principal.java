package roteiro8.parte2;

public class Principal {

	public static void main(String[] args) {

		VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
		VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
		VeiculoPequeno v04 = new VeiculoPequeno("33333-BA", 2012, "moto");

		System.out.println("Veiculo 02:");
		System.out.println("Placa: " + v02.getPlaca());
		System.out.println("Ano de fabricação: " + v02.getAnoFabricacao());
		System.out.println("Peso máximo: " + v02.getPesoMax());
		System.out.println("-----------------------------------------------");

		System.out.println("Veiculo 03:");
		System.out.println("Placa: " + v03.getPlaca());
		System.out.println("Ano de fabricação: " + v03.getAnoFabricacao());
		System.out.println("Quantidade máxima de passageiros: " + v03.getQtdeMaxPassageiros());
		System.out.println("-----------------------------------------------");

		System.out.println("Veiculo 04:");
		System.out.println("Placa: " + v04.getPlaca());
		System.out.println("Ano de fabricação: " + v04.getAnoFabricacao());
		System.out.println("Modelo: " + v04.getModelo());
		System.out.println("-----------------------------------------------");

		System.out.println("Pedágio v02 : " + v02.calcPedagio());
		System.out.println("Pedágio v03 : " + v03.calcPedagio());
		System.out.println("Pedágio v04 : " + v04.calcPedagio());

	}

}
