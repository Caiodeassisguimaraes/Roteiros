package roteiro7.parte3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Aluno> listaAlunos = new ArrayList<>();

		System.out.print("Digite a quantidade de alunos: ");
		int quantidadeDeAlunos = sc.nextInt();

		for (int i = 0; i < quantidadeDeAlunos; i++) {
			System.out.print("Digire a Matricula: ");
			int matricula = sc.nextInt();
			sc.nextLine(); // Limpar o buffer

			System.out.print("Digite o nome do(a) aluno(a): ");
			String nome = sc.nextLine();

			System.out.print("Digite o curso: ");
			String curso = sc.nextLine();

			System.out.print("Digite o ano de ingresso: ");
			int anoIngresso = sc.nextInt();
			
			Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso);
			sc.nextLine(); // Limpar o buffer
			while (true) {
				System.out.print("Deseja adicionar uma disciplina para o(a) aluno(a) " + aluno.getNome() + "? (S/N): ");
				String resposta = sc.nextLine().toUpperCase();

				if (resposta.equals("S")) {
					System.out.print("Digite o nome da disciplina: ");
					String disciplina = sc.nextLine();
					aluno.addDisciplina(disciplina);
				} else {
					break;
				}
			}
			
			if (aluno.getQuantidadeDisciplinas() > 0) {
				aluno.setSituacao("Matriculado");
			} else {
				aluno.setSituacao("Não Matriculado");
			}
			
			listaAlunos.add(aluno);

			System.out.println();
		}
			
		sc.close();
		System.out.println("Listando os Alunos : ");
		System.out.println("********************************");

		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno);
			System.out.println("Quantidade de disciplinas matriculadas: " + aluno.getQuantidadeDisciplinas());
			System.out.println();
		}

	}
}
