package roteiro5.parte3;

public class Principal {

	public static void main(String[] args) {

		Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
		Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
		Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

		loja01.setValorFat(10000);
		loja02.setValorFat(20000);
		loja03.setValorFat(10000);

		/*System.out.println(" ****** Comparação com método estático ********");
		Loja.compararFat_static(loja01, loja02);

		System.out.println(" ****** Comparação com método NÃO estático ********");
		loja01.compararFat_naoStatic(loja02);

		System.out.println(" ****** Comparação com método NÃO estático ********");
		loja02.compararFat_naoStatic(loja01);*/


		 System.out.println(" ****** Comparação com método estático ********"); Loja
		 lojaMaior = (Loja.compararFat_static(loja01, loja02));
		 System.out.println("Loja de Maior Fat: " + lojaMaior.getNomeFantasia());
		  
		 System.out.println(" ****** Comparação com método NÃO estático ********");
		 Loja lojaM1 = loja01.compararFat_naoStatic(loja02);
		 System.out.println("Loja de Maior Fat: " + lojaM1.getNomeFantasia());
		  
		 System.out.println(" ****** Comparação com método NÃO estático ********");
		 Loja lojaM2 = loja02.compararFat_naoStatic(loja01);
		 System.out.println("Loja de Maior Fat: " + lojaM2.getNomeFantasia());
		 
	}
}
