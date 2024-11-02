package roteiro7.parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

		System.out.print("Digite a quantidade de alunos: ");
		int quantidadeDeAlunos = sc.nextInt();

		for (int i = 0; i < quantidadeDeAlunos; i++) {
			System.out.print("Digire a Matricula: ");
			int matricula = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite o nome do(a) aluno(a): ");
			String nome = sc.nextLine();

			System.out.print("Digite o curso: ");
			String curso = sc.nextLine();

			System.out.print("Digite o ano de ingresso: ");
			int anoIngresso = sc.nextInt();

			Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso);

			listaAlunos.add(aluno);

			System.out.println();
		}

		sc.close();
		System.out.println("Listando os Alunos : ");
		System.out.println("********************************");

		for (int i = 0; i < listaAlunos.size(); i++) {
			System.out.println("Matricula : " + listaAlunos.get(i).getMatricula());
			System.out.println("Nome : " + listaAlunos.get(i).getNome());
			System.out.println("Curso : " + listaAlunos.get(i).getCurso());
			System.out.println("Ano Ingresso : " + listaAlunos.get(i).getAnoIngresso());
			System.out.println();
		}

	}
}
