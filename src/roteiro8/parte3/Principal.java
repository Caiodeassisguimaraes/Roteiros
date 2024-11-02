package roteiro8.parte3;

public class Principal {

	public static void main(String[] args) {

		VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
		VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
		VeiculoPequeno v04 = new VeiculoPequeno("33333-BA", 2012, "moto");

		System.out.println("Veiculo 02:");
		System.out.println("Placa: " + v02.getPlaca());
		System.out.println("Ano de fabricação: " + v02.getAnoFabricacao());
		System.out.println("Peso máximo: " + v02.getPesoMax());
		System.out.println("Pedágio: " + v02.calcPedagio());
		System.out.println("-----------------------------------------------");

		System.out.println("Veiculo 03:");
		System.out.println("Placa: " + v03.getPlaca());
		System.out.println("Ano de fabricação: " + v03.getAnoFabricacao());
		System.out.println("Quantidade máxima de passageiros: " + v03.getQtdeMaxPassageiros());
		System.out.println("Pedágio: " + v03.calcPedagio());
		System.out.println("-----------------------------------------------");

		System.out.println("Veiculo 04:");
		System.out.println("Placa: " + v04.getPlaca());
		System.out.println("Ano de fabricação: " + v04.getAnoFabricacao());
		System.out.println("Modelo: " + v04.getModelo());
		System.out.println("Pedágio: " + v04.calcPedagio());
		System.out.println("-----------------------------------------------");
		
		Cliente cliente = new Cliente ("123.456.789-10", "Caio", "Endereço", "caio@email.com", "(71) 9 1234-5678");
		cliente.setVeiculo(v02);
		
		System.out.println("Cliente:");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("E-mail: " + cliente.geteMail());
		System.out.println("Veículo 02");
		System.out.println("Pedágio a ser pago: " + cliente.getVeiculo().calcPedagio());
		System.out.println("-----------------------------------------------");
		
		cliente.setVeiculo(v03);
		
		System.out.println("Cliente:");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("E-mail: " + cliente.geteMail());
		System.out.println("Veículo 03");
		System.out.println("Pedágio a ser pago: " + cliente.getVeiculo().calcPedagio());
		System.out.println("-----------------------------------------------");
		
		cliente.setVeiculo(v04);
		
		System.out.println("Cliente:");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("E-mail: " + cliente.geteMail());
		System.out.println("Veículo 04");
		System.out.println("Pedágio a ser pago: " + cliente.getVeiculo().calcPedagio());
		System.out.println("-----------------------------------------------");

	}

}
