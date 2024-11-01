package roteiro7.parte1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Criando um vetor estático de objetos Aluno
		Aluno[] listaAlunos = new Aluno[3];
		
		
		
		System.out.print("Digire a Matricula: ");
		int matricula = sc.nextInt();
		System.out.print("Digite o nome do(a) aluno(a): ");
		String nome = sc.nextLine();
		sc.nextLine();
		System.out.print("Digite o curso: ");
		String curso = sc.nextLine();
		System.out.print("Digite o ano de ingresso: ");
		int anoIngresso = sc.nextInt();

		// Instanciando os objetos do tipo Aluno
		Aluno aluno01 = new Aluno(111, "Jose", "Sistema de Informação", 2019);
		Aluno aluno02 = new Aluno(222, "Maria", "Engenharia Civil", 2020);
		Aluno aluno03 = new Aluno(333, "Carlos", "Quimica", 2021);

		// Armazenando os objetos no vetor de alunos
		listaAlunos[0] = aluno01;
		listaAlunos[1] = aluno02;
		listaAlunos[2] = aluno03;
		sc.close();
		System.out.println("Listando os Alunos : ");
		System.out.println("********************************");
		for (int i = 0; i < 3; i++) {
			System.out.println("Matricula : " + listaAlunos[i].getMatricula());
			System.out.println("Nome : " + listaAlunos[i].getNome());
			System.out.println("Curso : " + listaAlunos[i].getCurso());
			System.out.println("Ano Ingresso : " + listaAlunos[i].getAnoIngresso());
			System.out.println("********************************");
		}

	}
}
