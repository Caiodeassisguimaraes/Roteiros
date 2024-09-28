package roteiro4.parte3;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);

		System.out.println("Matricula: " + aluno01.getMatricula());
		System.out.println("Nome: " + aluno01.getNome());
		System.out.println("Curso: " + aluno01.getCurso());
		System.out.println("Ano Ingresso: " + aluno01.getAnoIngresso());
		System.out.println();

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
