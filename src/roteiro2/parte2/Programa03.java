package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa03 {

	public static void main(String[] args) {

		// System.out.println("Informe o seu nome: ");
		String name = JOptionPane.showInputDialog("Informe o seu nome: ");
		// System.out.println("Nome informado: " + name);
		JOptionPane.showMessageDialog(null, "Nome informado: " + name);

		String strAge = JOptionPane.showInputDialog("Informe sua idade: ");
		// System.out.println("Idade informada: " + strAge);
		JOptionPane.showMessageDialog(null, "Idade informada: " + strAge);

	}

}
