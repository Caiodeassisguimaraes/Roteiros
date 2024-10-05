# Roteiros Práticos


Os roteiros práticos que iremos apresentar a seguir visam trazer uma percepção evolutiva para o aluno no processo de aprendizagem para o conteúdo de Programação Orientada a Objetos (POO).

Nos roteiros iniciais não iremos trabalhar especificamente com Orientação a Objetos (OO). Iremos explorar as especificidades da linguagem de programação, as estruturas de controles, sintaxe etc. Sempre de forma evolutiva, roteiro a roteiro, chegaremos aos conceitos de Programação Orientada a Objetos (POO) de forma prática.

**ATENÇÃO:**
Iremos concentrar todos os roteiros práticos em uma única pasta de forma padronizada. Na medida que evoluirmos no desenvolvimento dos roteiros, criaremos arquivos e novas subpastas, sempre mantendo uma hierarquia de pastas padronizadas. Cada pasta, subpasta e arquivo a ser criado será devidamente orientado no roteiro.

**PRIMEIRA PASTA:**
Esta pasta irá armazenar todo o conteúdo a ser desenvolvido durante a disciplina. 
A ideia é que ao final da disciplina o aluno tenha um conteúdo que sirva de guia de **Estudo para Orientação a Objetos**, desenvolvido por ele próprio.

Por isso, crie uma pasta chamada EstudoOO (Exemplo: ```C:\EstudoOO```)

E a partir desta pasta iremos desenvolver todo o nosso trabalho durante a disciplina.

# Roteiro 1

**_“Hello, World”_**

Neste roteiro vamos entender a estrutura básica de um código em Java, sua compilação, entendimento sobre os arquivos ```.java``` e ```.class``` e a criação de projetos java no Visual Studio Code (VSCode) e NetBeans.

## Parte 1 (roteiro1.parte1) – Estrutura básica do Java:

### Trabalhando no Bloco de Notas

1 – Depois de criar a nossa primeira pasta (```\EstudoOO```), conforme recomendado no início do roteiro, vamos criar nosso primeiro programa em Java de uma forma bem simples, usando um bloco de notas, sem usar nenhuma ferramenta ou recurso adicional. 

Lembre-se: Um código de programa não passa de um arquivo texto que deve ser escrito de forma padronizada, seguindo as regras e sintaxes de uma determinada Linguagem de Programação. Neste caso, estamos falando do Java.  

Crie um arquivo com a extensão ```.java``` (**helloworld.java**) dentro da pasta indicada. Este código terá a estrutura básica de um código em java com uma função para escrever na tela, como demonstrado na imagem abaixo. **Atenção para escrita do código abaixo, pois o Java é case sensitive**.

```java
class Hello {

	public static void main(String[] args){

		System.out.println("Hello, World");
	}

}
```
2 – Acesse a pasta criada com o prompt de comandos do Windows (```cmd```):

![image](https://github.com/user-attachments/assets/e2127a24-8299-4444-8c8c-bd654682a9c5)

3 – Certifique-se que está na pasta correta e em seguida verifique se existe o arquivo java criado.

![image](https://github.com/user-attachments/assets/7a7b18ad-f94c-42e6-a53d-e81c8e377ec0)

![image](https://github.com/user-attachments/assets/577c45db-ab88-41f4-8c54-eb6e723cdaaf)

4 – Precisamos agora compilar o programa pelo prompt de comandos usando o comando javac conforme indicado na imagem abaixo.

![image](https://github.com/user-attachments/assets/94b34047-ffb7-4c54-8a4b-4b4bd43777be)

![image](https://github.com/user-attachments/assets/0fe73306-3d99-42ec-864c-066d137699d3)

Após a compilação, observe que um novo arquivo com a extensão ```.class``` será criado na mesma pasta de trabalho, esse arquivo contém o código Java traduzido para linguagem de bytecode, que é uma representação de baixo nível executável pela Java Virtual Machine (JVM).

5 – Depois de conseguir compilar e gerar o arquivo ```.class```, podemos rodar o programa. Para isso, utilize o comando ```java``` também no prompt de comandos da mesma pasta de trabalho conforme indicado na imagem abaixo.

![image](https://github.com/user-attachments/assets/a259c007-787d-4ac1-9ac4-e8b83647dbb7)

Você pode ver no terminal a saída ```Hello, World```.

A partir deste ponto do roteiro iremos utilizar uma ferramenta profissional de desenvolvimento de software para Java. Esse tipo de ferramenta nos ajuda bastando no processo de desenvolvimento (Evita erros básicos, aumenta a produtividade, etc.). Utilizamos o bloco de notas no início deste roteiro apenas para demonstrar o funcionamento básico para a criação e compilação de um código java.

Iremos utilizar duas ferramentas de desenvolvimento como referência: O **NetBeans** e o **VSCode**. 

Existem outras ferramentas no mercado você pode escolher qualquer uma de sua prferência, mas utilizaremos essas como referência.

1. Crie o projeto java chamado **projetoEstudoOO**
2. Selecione a pasta criada no início do roteiro (```C:EstudoOO```)
3. Crie o pacote chamado **roteiro1.parte1**
4. Após criar o pacote, selecione-o e crie uma Classe chamada **Programa01**
5. Crie o código abaixo para a classe **Programa01**:

```java
package roteiro1.parte1;

public class Programa01 {

  public static void main(String[] args) {

    System.out.println("Primeiro Programa");

  }

}
```

Acabamos de criar o nosso primeiro programa java (Programa01) dentro da seguinte estrutura:
1. **Projeto:** projetoEstudoOO
    - **Pacote (Packages):** roteiro1.parte1
      - **Código java:** Programa01.java

**ATENÇÃO:** Fique atento na organização, pois precisamos ter uma estrutura hierárquica semelhante a imagem abaixo


**NetBeans**: ![image](https://github.com/user-attachments/assets/c53c8e2f-decd-4195-9f02-d5a2076c8b80)

**VSCode**: ![image](https://github.com/user-attachments/assets/efcdca81-7fcd-4df7-a83e-bcf3c1a8411d)

## Parte 2 (roteiro1.parte2) – Exercício

Mantendo o padrão de organização dos nossos estudos, crie um pacote dentro do projeto e coloque o nome **roteiro1.parte2**.

Cálculo de Salário.

Escreva um programa em Java para calcular o salário total de um funcionário. O programa deve conter o valor do salário-base mensal que contempla um total de 160 horas trabalhadas. O programa também deve conter o número de horas extra trabalhadas no mês. 
Em seguida, calcule o salário total do funcionário considerando que cada hora extra trabalhada tem o mesmo que uma hora regular. Por fim, exiba o salário total na tela.

O programa abaixo já tem o escopo do programa imprimindo o salário base. Complemente o programa para atender o que se pede informando o salário total. Faça também os devidos testes e simulações para as horas extra.

```java
package roteiro1.parte2;

public class Exercicio01{

  public static void main (String[] args){

    double sb = 2500;
    int numHorasExtra = 10;

    System.out.println("Salario base : " + sb);

  }

}
```

Dica: O valor da hora extra é calculado dividindo o salário-base pelo número de horas trabalhadas no mês.

Teste o programa com diferentes valores de salário-base e horas trabalhadas para garantir que o cálculo está correto.

# Roteiro 2

## Parte 1 (roteiro2.parte1) – Tipos de variáveis e entrada de dados:

O Java é uma linguagem de programação fortemente tipada. Isso significa que em Java, os tipos das variáveis são rigidamente definidos.

No Java temos os tipos primitivos:


**int:** Armazena valores inteiros de 32 bits.

**float:** Armazena números de ponto flutuante de 32 bits.

**double:** Armazena números de ponto flutuante de 64 bits.

**char:** Armazena um caractere Unicode de 16 bits.

**boolean:** Armazena valores verdadeiro ou falso.

**long:** Armazena valores inteiros de 64 bits.

**short:** Armazena valores inteiros de 16 bits.

**byte:** Armazena valores inteiros de 8 bits.


E os tipos de Referência (Objetos):


**String:** Armazena sequências de caracteres.

**Array:** Armazena coleções de elementos do mesmo tipo.

**Classe personalizada:** Tipos definidos pelo programador, como classes que você cria.

1 – Crie o pacote **roteiro2.parte1** com a classe **Programa01** conforme o código abaixo. Observe que existem algumas variáveis declaradas com os tipos mais utilizados. Veja que uma das variáveis está sendo exibido em tela. Faça testes com as outras variáveis.

```Java
public class Programa01 {
	public static void main(String[] args) {
		int idade = 18;
		char letra = 'a';
		float numeroFloat = 3.14159f;
		double numeroDouble = 2.71828;
		String nome = "Issac Newton";

		System.out.println("Exibir : " + numeroFloat);
	}
}
```

2 – Crie agora uma classe no mesmo pacote chamado **Programa02**. Neste programa vamos capturar a entrada de dados do usuário, e para isso precisaremos importar a classe **Scanner** do Java. Implemente a classe Programa02 conforme o código abaixo:

```Java
 import java.util.Scanner;

public class Programa02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe o seu nome");
		String nome = entrada.nextLine();
	
		System.out.println("Nome informado : " + nome);
	
		entrada.close();
	}
}
```

3 – Faça os devidos testes rodando o Programa02 e teste como seria uma entrada de dados de um tipo numérico. Poderíamos por exemplo solicitar a idade do usuário.

**OBS.:** a classe Scanner faz uso de conceitos de OO que serão melhor detalhados posteriormente.

## Parte 2 (roteiro2.parte2) – Entrada de dados - Gráfica:

1 – Crie o pacote **roteiro2.parte2** com a classe **Programa03** conforme o código abaixo. Neste programa vamos capturar a entrada de dados do usuário com o uso de um pacote gráfico. Teremos que importar também o JOptionPane.

```Java
import javax.swing.JOptionPane;

public class Programa03 {

	public static void main(String[] args) {

		System.out.println("Informe o seu nome: ");

		String name = JOptionPane.showInputDialog("Informe o seu nome: ");
		System.out.println("Nome informado: " + nome);
		

		String strIdade = JOptionPane.showInputDialog("Informe sua idade: ");
		int idade = Integer.parseInt(strIdade);
		System.out.println("Idade informada: " + strIdade);
		

	}

}
```

2 – Qual a diferença percebida entre o input das variáveis nome e idade?

3 – Observe que no Programa03 apenas o input foi feito em ambiente gráfico, mas o output permanece no console. Substitua o comando **System.out.println( ....)** pelos respectivos comandos abaixo

```Java
JOptionPane.showMessageDialog(null, "Nome informado : " + nome);
```
```Java
JOptionPane.showMessageDialog(null, "Idade informada : " + idade);
```

**OBS.:** Neste primeiro momento não iremos nos aprofundar nos recursos gráficos para entrada e saída de dados. Em geral utilizaremos o Scanner para as nossas atividades.

## Parte 3 (roteiro2.parte3) – Estruturas de Controle

Em Java, os comandos de controle (if, for, while, switch) são similares aos comandos em C e outras linguagens.

- **Estruturas Condicionais**
  - Exemplo da utilização do comando **if** em Java

```Java
if (condicao){
	//código a ser executado se a condição for verdadeira
} else {
	//codigo a ser executado se a condição for falsa
}
```

 - Exemplo da utilização do comando **switch** em Java

```Java
//exemplo laço "switch case"
switch (valor){
	case opcao1:
		//codigo se valor for igual a opcao1
	break;
	case opcao2;
		//codigo se valor for igual a opcao2
	break;
	//...mais casos
	default:
		//código se nenhum dos casos corresponder
}
```

- Estruturas de Repetição
  - Exemplo da utilização do comando **for** em Java
```Java
//exemplo laço "for"
for (int i = 0; i < 5; i++){
	//código a ser repetido
}
```
- Exemplo da utilização do comando while em Java
```Java
//exemplo laço "while"
while (condicao){
	//código a ser repetido
}
```
- Exemplo da utilização do comando **do while** em Java
```Java
//exemplo laço "do while"
do {
	//código a ser repetido
} while (condição);
```
1 – Crie o pacote **roteiro2.parte3** com a classe **Programa04** conforme o código abaixo, analisando e testando o que foi implementado.
```Java
import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		while (cont < 5) {
			System.out.print("Informe uma nota: ");
			int nota = entrada.nextInt();
			if (nota >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			cont++;
		}
		sc.close();

	}

}
```
2 – Crie a classe **Programa05** no mesmo pacote de forma semelhante ao Programa04. Este novo programa deve apresentar o mesmo resultado anterior. Sendo que neste caso, use o **for** como estrutura de repetição.

3 – Supondo agora que o input de notas não tenha uma quantidade definida e dependa de um flag. Ou seja, o usuário precisaria indicar algum valor que encerre o input de notas (exemplo flag = -1). Crie uma classe **Programa06** semelhante ao Programa05 no mesmo pacote, sendo que este novo programa deve atender os requisitos desta questão.

4 – Ainda no mesmo pacote crie a classe **Programa07** idêntico ao Programa06, e faça com que o programa apresente a média das notas que foram inseridas. Atenção para o resultado que deve ser apresentado (Exemplo : Se metade das notas inseridas tem o valor 7 e a outra metade tem o valor 8, a média esperada é 7,5).

## Parte 4 (roteiro2.parte4) – Vetores Simples (Estáticos)

Vetores estáticos em Java funcionam da mesma forma como em outras linguagens. Abaixo um exemplo de declaração e utilização desse tipo de vetor em Java:

```Java
int[] vetorDeNumeros = new int[5];
vetorDeNumeros[0] = 10;
vetorDeNumeros[1] = 20;
vetorDeNumeros[2] = 30;
vetorDeNumeros[3] = 40;
vetorDeNumeros[4] = 50;

System.out.println(vetorDeNumeros[2];
```
O output do exemplo acima é : 30

Na primeira linha podemos ver a forma como se declara um vetor estático de números inteiros. Em seguida a atribuição de valores, utilizados os índices do vetor e na última linha, um comando de saída, escolhendo uma das posições do vetor.

Dessa mesma forma se declara vetores estáticos de outros tipos:

```Java
int[] vetorDeInteiros = new int[5];
float[] vetorDeFloats = new float[5];
double[] vetorDeDoubles = new double[5];
String[] vetorDeStrings = new String[5];
```
1 – Crie o pacote **roteiro2.parte4** com a classe **Programa08** conforme o código abaixo e analise e teste o que foi implementado.
```Java
import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] vetorNotas = new int[5];

		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Informe uma nota: ");
			int nota = entrada.nextInt();

			vetorNotas[cont] = nota;
		}
		entrada.close();
	}
}
```

2 – Ainda na classe **Programa08**, depois do laço de repetição já existente, implemente um novo laço de repetição apenas para exibir os valores armazenados no vetor. Verifique se as notas exibidas estão corretas.

3 – Crie uma nova classe **Programa09** idêntica ou Programa08, e implemente uma solução que armazene no vetor apenas notas consideradas válidas. Ou seja, notas inseridas com o valor de 0 a 10. Caso não seja uma nota válida, o programa deve informar que a nota é inválida, e não deve armazenar esta nota. Atenção : O programa também deve garantir que todo o vetor será preenchido com notas válidas.

4 – Utilizando a classe Programa07 implementado no pacote roteiro2.parte3, seria possível implementar uma solução que apresentasse não somente a média, mas quantas notas ficaram acima da média? Sim? Não? Como? Por quê?

## Parte 4 (roteiro2.parte4) – Exercício

Objetivo: Criar um programa de adivinhação em que o usuário tenta adivinhar um número secreto.

1. Gere um número secreto aleatório entre 1 e 100. Utilize para isso a classe Random do Java (java.util.Random):
```Java
Random random = new Random();
int numeroSecreto = random.nextInt(100)+1;
```
2. Peça ao usuário para adivinhar o número.
3. Use um loop **while** para repetir até o usuário acertar.
4. Dentro do loop, use o comando **if** para verificar se o palpite é correto, alto ou baixo.
5. Forneça feedback ao usuário sobre o palpite, e indique se o palpite é maior ou menor que o número secreto.
6. Quando o usuário acertar, termine o loop.

# Roteiro 3

## Parte 1 (roteiro3.parte1) – Funções Estáticas: 

**Funções estáticas ou métodos estáticos** em Java são funções que pertencem à própria classe e não a uma instância específica dela. Isso permite que você as chame diretamente na classe, sem precisar criar um objeto. Funções estáticas são especialmente úteis para operações independentes do estado do objeto e oferecem uma maneira prática de invocação. 

Abaixo você pode ver um exemplo de como se declara uma função estática em java:

```Java
static int soma(int valor1, int valor2){
	return valor1 + valot2;
}
```

Em Java, **static** e **public** são palavras-chave usadas para modificar a declaração de uma função (ou método). Cada uma delas tem um propósito específico: 

A palavra-chave **static** é usada para definir um método ou variável como pertencente à classe em vez de uma instância específica dessa classe. 

A palavra-chave **public** é um modificador de acesso que indica que o método pode ser acessado de qualquer classe, seja ela na mesma classe, em uma classe diferente no mesmo pacote ou em um pacote diferente. 

**OBS.**: Neste roteiro utilizaremos apenas funções estáticas. Os conceitos acima ficarão mais claros nos próximos roteiros. 

1 - Crie o pacote **roteiro3.parte1** com a classe **Programa10** conforme o código abaixo.  
O cenário implementado abaixo diz respeito ao seguinte problema:

“Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário a receber. Sabendo-se que esse funcionário tem gratificação de 5% sobre o salário -base e paga imposto de 7% também sobre o salário-base.” 

Faça os devidos testes para verificar se a solução implementada foi atendida. 

```Java
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double sb, grat, imp, sr;

		System.out.println("Informe o salário base: ");
		sb = entrada.nextDouble();
		grat = sb * 5 / 100;
		imp = sb * 7 / 100;
		sr = sb + grat - imp;
		System.out.println("Salário a receber: "+ sr);
		entrada.close();

	}

}
```

2 - No mesmo pacote crie a classe **Programa11** idêntica ao Programa10. Neste exemplo faremos o uso simples de uma função estática. Observe que foi criada uma função para calcular o valor da gratificação e esta função foi chamada na função main. Veja que a chamada da função foi feita com o nome da classe na frente, justamente por ser uma função estática : **Programa11.calcGrat(sb)** . 

Obs.: Como as funções foram criadas na mesma classe, a chamada da função poderia ser feita sem o nome da Classe: **calcGrat(sb)**

```Java
import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double sb, grat, imp, sr;

		System.out.println("Informe o salário base: ");
		sb = sc.nextDouble();
		grat = Programa11.calcGrat(sb);
		// grat = calcGrat(sb);
		imp = sb * 7 / 100;
		sr = sb + grat - imp;

		System.out.println("Salário a receber: " + sr);

		entrada.close();

	}

	public static double calcGrat(double sb) {
		return sb * 5 / 100;
	}

}
```

3 – Ainda no Programa11 crie uma função para calcular o imposto (**calcImp**) de forma semelhante ao que foi feito para a gratificação. Faça as adaptações necessárias no programa.

4 – Ao criar uma função para o cálculo da gratificação e outra para o cálculo do imposto, provavelmente terá criado 2 funções idênticas. Ter duas funções que fazem praticamente a mesma coisa não é adequado, pois caracteriza duplicidade de código. Crie agora uma classe **Programa12** no mesmo pacote, assim como uma nova função, onde seja possível o cálculo da gratificação e do imposto na mesma função. Ou seja, devemos ter neste programa uma função única capaz de calcular a gratificação e o imposto. Faça as adaptações necessárias no código.

## Parte 2 (roteiro3.parte2) – Funções Estáticas:

1 - Crie o pacote **roteiro3.parte2** com a classe **Programa13** conforme o código abaixo. Este programa simula uma calculadora com operações básicas de soma, subtração, multiplicação e divisão.

```Java
import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor de x ");
		double x = entrada.nextDouble();

		System.out.println("Informe a operação (+, -, *, /) ");
		String op = entrada.next();

		System.out.println("Informe o valor de y ");
		double y = entrada.nextDouble();

		switch (op) {
		case "+":
			soma(x, y);
			break;
		case "-":
			subtracao(x, y);
			break;
		case "*":
			multiplicacao(x, y);
			break;
		case "/":
			divisao(x, y);
			break;
		default:
			System.out.println("Operação inválida");
		}

		entrada.close();

	}

	public static void soma(double x, double y) {
		System.out.println("Resultado: " + (x + y));
	}

	public static void subtracao(double x, double y) {
		System.out.println("Resultado: " + (x - y));
	}

	public static void multiplicacao(double x, double y) {
		System.out.println("Resultado: " + (x * y));
	}

	public static void divisao(double x, double y) {
		System.out.println("Resultado: " + (x / y));
	}
}
```

2 – Observe que no Programa13 as funções de soma, subtração, multiplicação e divisão, foram criadas com o retorno “void”. Ou seja, são funções que não geram resultado de retorno para quem as chama. Crie uma classe **Programa14** idêntico ao Programa13, de forma que as funções de soma, subtração, multiplicação e divisão gerem o retorno para a função main, e que o resultado da operação seja apresentado na função main (output).  

# Roteiro 4

## Parte 1 (roteiro4.parte1) – Classe; Objeto;

Neste roteiro começaremos a trabalhar com os conceitos de Orientação a Objetos.

1. Crie o pacote **roteiro4.parte1** com a classes **Principal** e **Aluno** conforme o código abaixo.

Atenção:
- A boa prática da programação OO indica que os nomes das classes devem sempre iniciar com letras maiúsculas.
- A classe **Aluno** tem apenas os atributos : matrícula, nome, curso, anoIngresso.
- E a classe **Principal** tem o método main que utilizamos ele para **instanciar** o objeto **aluno01**, conforme o destaque em amarelo.

Faça os testes rodando a classe Principal.

```Java
public class Principal {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "Jose";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;

        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
  	System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
    }
    
}
```

```Java
public class Aluno {
    
    public int matricula;
    public String nome;
    public String curso;
    public int anoIngresso;
}
```

2. Faça as devidas implementações na classe Principal para que seja possível instanciar os objetos **aluno01** e **aluno02**. Obs.: Preencha os atributos do aluno02 com dados hipotéticos apenas para teste.

## Parte 2 (roteiro4.parte2) – Construtor;

1. Crie o pacote **roteiro4.parte2** com a cópia das classes **Principal** e **Aluno** implementados na parte1.

Nesta atividade iremos criar o chamado **Método Construtor** da classe Aluno. Ele é o método que permite a criação do objeto. Implemente o método construtor conforme o código abaixo.

Atenção:
- O método construtor deve ter exatamente o mesmo nome da classe.
- Neste método construtor em específico, ele não recebe nenhum parâmetro e está completamente vazio. Dizemos neste caso que temos um **Método Construtor Padrão**

OBS.: Como o construtor padrão não tem absolutamente nada neste caso, o resultado esperado é exatamente o teste feito na parte1 deste roteiro, sem nenhum erro.

```Java
public class Aluno {
    
    public int matricula;
    public String nome;
    public String curso;
    public int anoIngresso;

    public Aluno(){
    }
}
```

2. Agora modifique o construtor da classe **Aluno** conforme as orientações abaixo: 

Atenção:
- O método construtor deve ter exatamente o mesmo nome da classe.
- No método construtor acrescente as variáveis de parâmetro : ```int pMatricula```, ```String pNome```, ```String pCurso```, ```int pAnoIngresso```. E elas são usadas para preencher os respectivos atributos do objeto. 

OBS.: Certamente essa mudança causará impacto na classe Principal ao instanciar o objeto (criar o objeto). Avalie um impacto e siga para a próxima questão.

```Java
public class Aluno {
    
	public int matricula;
	public String nome;
	public String curso;
	public int anoIngresso;
	
	public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }
}
```

3. Com a implementação do método construtor na classe Aluno poderemos instanciar o objeto aluno01 na classe Principal já preenchendo os atributos.

```Java
public class Principal {

	public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);
        
        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
  	System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
    }
}
```

## Parte 3 (roteiro4.parte3) – Encapsulamento:

1. Crie o pacote roteiro4.parte3 com a cópia das classes **Principal** e **Aluno** implementados na parte2.
2. Na parte2 criamos o objeto aluno01, e no construtor do objeto foi passada todas as informações sobre os atributos deste objeto. Supondo que depois de criado o objeto aluno01, seja necessário modificar o número de matrícula deste aluno. Uma possível solução pode ser implementada conforme o código abaixo.

Faça os devidos testes e verifique se os dados do objeto aluno01 realmente foram modificados.

```Java
public class Principal {

	public static void main(String[] args) {
	
		Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);
	        
	        System.out.println("Matricula : " + aluno01.matricula);
	        System.out.println("Nome : " + aluno01.nome);
	        System.out.println("Curso : " + aluno01.curso);
	  	System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
	
	 	aluno01.matricula = 222;
	
	  	System.out.println("Matricula : " + aluno01.matricula);
	        System.out.println("Nome : " + aluno01.nome);
	        System.out.println("Curso : " + aluno01.curso);
	  	System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
	}
}
```

3. A solução indicada no item 2 apesar de funcionar, não é uma boa prática indicada para POO. O recomendado é que nenhuma classe tenha os seus dados (atributos) acessíveis diretamente. A solução do item 2 só foi possível porque os atributos da classe Aluno são públicos. Para resolver esta questão, modifique o controle de acesso dos atributos da classe Aluno conforme código abaixo. Faça os devidos testes, avalie o impacto desta mudança e siga para a próxima questão.

```Java
public class Aluno {
    
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }
}
```

4. A mudança no item 3 provavelmente causou problema na classe Principal, justamente porque os atributos do objeto aluno01 se tornaram inacessíveis. É daí que vem a necessidade do conceito de encapsulamento na POO.

Segue algumas definições para encapsulamento

- O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe.
- O Encapsulamento faz com que os atributos/dados de um objeto não fiquem tão facilmente acessíveis. Ou seja, só conseguimos modificar ou acessar os dados de um objeto através de um método.
- Encapsulamento é a técnica que faz com que detalhes internos de uma classe permaneçam ocultos conforme a necessidade e o contexto.

Precisamos criar alguns métodos na classe Aluno que permitam “consultar” (**Get**) um determinado atributo, e outros métodos que permitam “editar” (**Set**) um determinado atributo. Comumente chamamos este conjunto de métodos na POO de **Getters** e **Setters**.

No código abaixo criamos os Getters e Setters para os atributos matrícula e nome. Crie os métodos correspondentes para os outros atributos.

OBS.: Normalmente as IDEs como Netbeans, VSCode e outras possuem recursos para gerar os Getters e Setters automaticamente. Vale a pena verificar este recurso.

```Java
public class Aluno {
    
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
```

5. Depois de implementar os métodos Getters e Setters na classe Aluno é necessário fazer os devidos ajustes na classe Principal.

```Java
public class Principal {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);
	        
	        System.out.println("Matricula : " + aluno01.getMatricula());
	        System.out.println("Nome : " + aluno01.getNome());
	        System.out.println("Curso : " + aluno01.getCurso());
	  	System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
	
	  	aluno01.setMatricula(222);
	
	        System.out.println("Matricula : " + aluno01.getMatricula());
	        System.out.println("Nome : " + aluno01.getNome());
	        System.out.println("Curso : " + aluno01.getCurso());
	 	System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
	}

}
```

## Parte 4 (roteiro4.parte4) – Evoluindo o Projeto:

O nosso pequeno cenário de um projeto de POO evolui como todo projeto de software. Precisamos criar 2 novos atributos na classe Aluno : 
- qtdeDisciplinas – um número inteiro para indicar a quantidade de disciplina que o aluno está matriculado.
- situacao – uma string para guarda a informação de quando o aluno está matriculado ou não (Matriculado / Não Matriculado).

Não é desejável que na implementação o aluno tenha a possibilidade de :
- **qtdeDisciplina = 0** e esteja com **situacao = “Matriculado”**
- **qtdeDisciplina = 1** e esteja com **situacao = “Não Matriculado”**
- também não é desejável que a **situação** seja passada como parâmetro no construtor


1. Crie o pacote **roteiro4.parte4** com a cópia das classes **Principal** e **Aluno** implementados na parte3.
2. Seguindo as boas práticas de OO, crie os 2 atributos indicados acima com o acesso **private**.
3. Analise e implemente a melhor forma para que estes 2 novos atributos sejam contemplados na classe Aluno.
4. Faça as devidas adaptações na classe Principal para que seja possível testar o cenário descrito nesta etapa do projeto.
5. Faça as adaptações na classe Principal para que os inputs do usuário sejam feitos utilizando o Scanner, e que preencham os dados do objeto aluno01. 

# Roteiro 5

## Sobrecarga de Métodos

Neste roteiro utilizaremos um novo cenário, dando sequência aos conhecimentos sobre OO adquiridos no roteiro 4, e faremos a introdução de um novo conceito: Sobrecarga.

A **sobrecarga** (overload) consiste em permitir, dentro da mesma classe, mais de um método com o mesmo nome. Normalmente acontece sobre os métodos construtores, pois é comum para uma classe ter várias maneiras de instanciá-la.

Cenário:

Deseja-se um controle simples de informações cadastrais de uma loja de roupas que possui um nome de fantasia, uma razão social, um número de CNPJ, o valor de faturamento e a área em m2 que ela ocupa, e o nome do proprietário.

## Parte 1 (roteiro5.parte1)

1. Crie o pacote ```roteiro5.parte1``` com a classes ```Principal``` e ```Loja```. Conforme o cenário descrito, teremos que criar os seguintes atributos para a classe Loja:

```Java
String nomeFantasia;
String razaoSocial;
String cnpj;
double valorFat;
double area;
String nomeProprietario;
```

Crie os atributos indicados na classe ```Loja``` com o acesso ```private```.

2. Implemente os métodos **Getterss** e **Setters** da classe ```Loja```.
3. Agora iremos implementar o método construtor de forma que ele receba como parâmetro o Nome Fantasia, a Razão Social e o CNPJ.

**Observe** que no código abaixo utilizamos a palavra reservada ```this``` para acessar os atributos. Sempre que estamos implementando qualquer código dentro de uma classe específica (neste caso ```Loja```) e queremos acessar um atributo ou método, podemos usar ```this``` conforme o exemplo abaixo (com exceção os atributos ou métodos estáticos - ```static```).

Neste caso, o ```this``` também foi útil para diferenciar as variáveis recebidas como parâmetro no construtor, dos atributos da classe:

![Roteiro5Imagem1](https://github.com/user-attachments/assets/3f8d4a7a-8646-418f-8d82-39b3cc64ace7)

```Java
public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    {
      Implementar Getters e Setters	
    }	
    
}
```

4. Precisamos testar o funcionamento da classe ```Loja```. Crie na classe ```Principal``` o objeto ```loja01``` e faça os devidos testes.

Observe que alguns atributos não foram passados no construtor. O que acontece quando exibimos os dados da ```loja01```? Atenção para valores ```null```.

```Java
public class Principal {
    
    public static void main(String[] args) {
        
      Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        
    }
}
```

5. No momento do cadastro da loja nem sempre é possível ter as 3 informações do construtor (Nome Fantasia, Razão Social e CNPJ). Na maioria das vezes o usuário possui apenas o Nome de Fantasia e o CNPJ.  Desta forma, definimos a seguinte regra de negócio: Sempre que não tivermos a Razão Social, iremos preencher este atributo com o Nome Fantasia.  

Trata-se de um problema relativamente simples de resolver, basta testar o parâmetro ```razaoSocial``` no construtor da classe ```Loja```:

```Java
public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;

        if (razaoSocial.equals("")){
            this.razaoSocial = nomeFantasia;
        }
        else {
            this.razaoSocial = razaoSocial;
        }

        this.cnpj = cnpj;
    }

    {
      Implementar Getters e Setters	
    }	
    
}
```

6. Para testar a solução criamos 2 objetos do tipo ```Loja``` na classe ```Principal``` (```loja01``` e ```loja02```). A ```loja02``` não tem a Razão Social. Ao imprimir os dados das duas lojas, tivemos o resultado esperado? A solução implementada no item 5 resolveu o problema?

```Java
public class Principal {
    
    public static void main(String[] args) {
        
      Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
      
      Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
        
    }
}
```

## Parte 2 (roteiro5.parte2) – Sobrecarga de Métodos;

1. Crie o pacote ```roteiro5.parte2``` com a cópia das classes ```Principal``` e ```Loja``` implementadas na parte1.
2. Iremos agora aplicar os nossos conhecimentos de **Sobrecarga de Métodos**. A solução adotada no item 5 da Parte1 apesar de funcionar não é muito adequada. Podemos utilizar recursos da OO para tornar o código mais limpo e reutilizável.

O adequado neste caso é aplicar a sobrecarga no método construtor. Ou seja, teremos 2 construtores que recebem diferentes parâmetros, cada um deve ser utilizado conforme a necessidade. 

```Java
public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public Loja(String nomeFantasia, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = nomeFantasia;
        this.cnpj = cnpj;
    }

    {
      Implementar Getters e Setters	
    }	
    
}
```

3. Aplique agora as chamadas adequadas na classe ```Principal``` e faça os devidos testes.

```Java
public class Principal {
    
    public static void main(String[] args) {
        
      Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
      
      Loja loja02 = new Loja("Mercadão do Povo", "10101010");
        
    }
}
```

4. Com sobrecarga do método construtor podemos otimizar o código ainda mais promovendo reutilização de código.

Podemos apenas chamar o 1º Construtor de dentro do 2º Construtor passando os parâmetros da forma desejada. Assim, eliminamos linhas de código desnecessárias, pois estaremos de fato fazendo reutilização de código.

```Java
public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public Loja(String nomeFantasia, String cnpj){
       
	  this(nomeFantasia, nomeFantasia, cnpj);
	
        /*this.nomeFantasia = nomeFantasia;
        this.razaoSocial = nomeFantasia;
        this.cnpj = cnpj;*/
    }

    {
      Implementar Getters e Setters	
    }	
    
}
```

5. Para atividade final faça os testes abaixo na classe ```Principal```. O objetivo é compreender como funcionam os objetos instanciados.

Abaixo fizemos 5 testes (Teste1, Teste2, Teste3, Teste4, Teste5). Avalie os resultados apresentados e a diferença entre eles. Procure entender como funciona o operador ```.equals``` aplicado neste código.

O que conseguiu concluir sobre os testes feitos? No Teste5 é possível utilizar o operador ```.equals```? 

```Java
public class Principal {
    
    public static void main(String[] args) {
        
      Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
      Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
      Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

      loja01.setValorFat(10000);
      loja02.setValorFat(20000);
      loja03.setValorFat(10000);

      System.out.println(" ****** Teste 1 ********");
      if ( loja01.getNomeFantasia() == loja03.getNomeFantasia() ){
          System.out.println("Lojas Iguais");
      }
      else {
          System.out.println("Lojas Diferentes");
      }

      System.out.println(" ****** Teste 2 ********");
      if ( loja01.getNomeFantasia().equals(loja03.getNomeFantasia())  ){
          System.out.println("Lojas Iguais");
      }
      else {
          System.out.println("Lojas Diferentes");
      }
            
      System.out.println(" ****** Teste 3 ********");
      if ( loja01 == loja03  ){
          System.out.println("Lojas Iguais");
      }
      else {
          System.out.println("Lojas Diferentes");
      }
        
      System.out.println(" ****** Teste 4 ********");
      if ( loja01.equals(loja03)  ){
          System.out.println("Lojas Iguais");
      }
      else {
          System.out.println("Lojas Diferentes");
      }

      System.out.println(" ****** Teste 5 ********");
      if ( loja01.getValorFat() == loja03.getValorFat()  ){
          System.out.println("Faturamentos Iguais");
      }
      else {
          System.out.println("Faturamentos Diferentes");
      }
  }
}
```

## Parte 2 (roteiro5.parte3) – Métodos Estáticos e Métodos não Estáticos

Os métodos ```static``` tem um relacionamento com uma classe como um todo, enquanto os métodos que não são ```static``` são associados a uma instância de classe específica (objeto) e podem manipular as variáveis de instância do objeto.

1. Crie o pacote ```roteiro5.parte3``` com a cópia das classes ```Principal``` e ```Loja``` implementadas na parte2.
2. Crie um método na classe ```Loja``` para comparar se o faturamento de uma loja é superior ao de outra loja. Ou seja, este método deverá receber como parâmetro 2 lojas, e dentro deste método deveremos implementar a lógica para comparar as duas.

Esta solução pode ser implementada utilizando tanto um método estático quanto um não estático. O importante é entender como funciona do ponto de vista da OO, e principalmente quando e como utilizar.

```Java
public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    {
      Construtores	
    }	

    {
      Getters e Setters	
    }	
    
    public static void compararFat_static(Loja lojaA, Loja lojaB ){
        if (lojaA.getValorFat() > lojaB.getValorFat()){
            System.out.println("Loja de Maior Fat : " + lojaA.nomeFantasia);
        }
        else {
            System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
        }
    }

    public void compararFat_naoStatic(Loja lojaB ){
        if (this.getValorFat() > lojaB.getValorFat()){
            System.out.println("Loja de Maior Fat : " + this.nomeFantasia);
        }
        else {
            System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
        }
    }
}
```

3. Como sugestão para teste, implemente o trecho de código abaixo na classe Principal:

```Java
public class Principal {
    
    public static void main(String[] args) {
        
      Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
      Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
      Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

      loja01.setValorFat(10000);
      loja02.setValorFat(20000);
      loja03.setValorFat(10000);


	* * *	  
	* * *	  
	* * *	  
	* * *	  

      System.out.println(" ****** Comparação com método estático ********");
      Loja.compararFat_static(loja01, loja02);
        
      System.out.println(" ****** Comparação com método NÃO estático ********");
      loja01.compararFat_naoStatic(loja02);
        
      System.out.println(" ****** Comparação com método NÃO estático ********");
      loja02.compararFat_naoStatic(loja01);
  }
}
```

4. O que se espera é que nas 3 comparações acima sejam apresentadas a mesma loja como a de maior faturamento.

Conseguiu absorver como se utiliza os dois tipos de métodos (Estáticos e Não Estáticos)? O que conseguiu entender sobre a utilização dos dois métodos (Estáticos e Não Estáticos)?

5. Como exercício, faça com que os dois métodos (Estáticos e Não Estáticos) retornem o objeto “loja” de maior faturamento. Desta forma, a exibição dos dados da maior loja deve ser feita na classe Principal e não na classe Loja.
