package roteiro4.parte4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a matricula: ");
		int matricula = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o curso: ");
		String curso = sc.nextLine();
		System.out.print("Digite o ano de ingresso: ");
		int anoIngresso = sc.nextInt();
		System.out.print("Digite a quantidade de disciplinas: ");
		int qtdeDisciplinas = sc.nextInt();
		sc.nextLine();

		Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas);

		System.out.println("Matricula: " + aluno01.getMatricula());
		System.out.println("Nome: " + aluno01.getNome());
		System.out.println("Curso: " + aluno01.getCurso());
		System.out.println("Ano Ingresso: " + aluno01.getAnoIngresso());
		System.out.println("Quantidade de disciplinas: " + aluno01.getQtdeDisciplinas());
		System.out.println("Situação: " + aluno01.getSituacao());
		System.out.println();

		aluno01.setQtdeDisciplinas(0);
		System.out.println(aluno01.getSituacao());

		aluno01.setMatricula(222);

		System.out.println("Matricula: " + aluno01.getMatricula());
		System.out.println("Nome: " + aluno01.getNome());
		System.out.println("Curso: " + aluno01.getCurso());
		System.out.println("Ano Ingresso: " + aluno01.getAnoIngresso());
		System.out.println();

		Aluno aluno02 = new Aluno();
		aluno02.setMatricula(222);
		aluno02.setNome("Caio");
		aluno02.setCurso("Engenharia de Software");
		aluno02.setAnoIngresso(2024);

		System.out.println("Matricula: " + aluno02.getMatricula());
		System.out.println("Nome: " + aluno02.getNome());
		System.out.println("Curso: " + aluno02.getCurso());
		System.out.println("Ano Ingresso: " + aluno02.getAnoIngresso());

	}

}
