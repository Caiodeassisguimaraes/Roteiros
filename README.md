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

# Roteiro 6

## Composição

Composição de objetos é uma maneira de se combinar objetos simples ou tipos de dados em objetos mais complexos. Objetos compostos são frequentemente referidos como tendo um relacionamento **"tem um"**. Um exemplo de composição do mundo real pode ser visto em um objeto automóvel, onde existe a relação com outros objetos como roda, volante, banco e etc.

### Cenário:

Deseja-se fazer um controle para ligações telefônicas, onde seja possível ter os números de origem e de destino destas ligações, assim como a cidade de origem e de destino. É preciso também ter o registro do horário de início e de término na ligação. Precisamos que o horário de início e de término da ligação seja representado por hora, minuto e segundo.  

**OBS.:** Inicialmente iremos tratar as informações com os horários da ligação como String. Depois criaremos a nossa própria classe de Tempo com as regras que desejamos. Em Java já existem bibliotecas que fazem manipulação de Data/Hora, mas nesta atividade criaremos a nossa própria classe à título de aprendizagem.

## Parte 1 (roteiro6.parte1)

1. Crie o pacote `roteiro6.parte1` com a classes `Principal` e `Ligacao`. Conforme o cenário descrito, teremos que criar os seguintes atributos para a classe `Ligacao`:

```Java
String numOrigem
String numDestino
String localOrigem
String localDestino
String horaInicio
String horaFim
```

Crie os atributos indicados na classe `Ligacao` com o acesso `private`.

2. Crie o método construtor na classe Ligacao conforme o trecho de código abaixo.
Observe que no código abaixo não passamos como parâmetro o horário de finalização da ligação.

```Java
public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = "";
}
```

3. Implemente os métodos Getters e Setters da classe `Ligacao`.
4. Implemente na classe Principal um teste simples para a criação de um objeto ligação, conforme o trecho de código abaixo. Faça os devidos testes para exibir os dados da ligação.

```Java
public static void main(String[] args) {
   Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", "10:15:02");
}
```

5. Com o que foi implementado até o momento, seria possível, por exemplo encerrar esta ligação do item 4 com o horário de “10:20:35”?
6. Com o horário encerrado, ou seja, com os horários de início e término preenchidos, teríamos como calcular o tempo de duração desta ligação? Sim ou Não? Como?  OBS.: Não é necessário implementar uma solução para este caso. Apenas analise o contexto e a complexidade envolvida, descrevendo o que seria necessário fazer.

## Parte 2 (roteiro6.parte2) – Composição;

1. Crie o pacote `roteiro6.parte2` com a cópia das classes `Principal` e `Ligacao` implementadas na parte1.
2. Crie agora a classe `Tempo` com os atributos abaixo:

```Java
    private int hora;
    private int minuto;
    private int segundo;
```

3. Crie o construtor na classe Tempo passando como parâmetro: `hora`, `minuto`, `segundo`.
4. Crie os Gettes e Settes para a classe `Tempo`.
5. Vamos agora aplicar a composição na classe `Ligacao`. O horário das Ligações que inicialmente foi definido como `String` agora será do tipo `Tempo`. Podemos dizer que a classe `Tempo` faz parte da composição da classe `Ligacao`.
Faça os ajustes abaixo na classe Ligacao:

```Java
public class Ligacao {
    
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }

    {Getters e Setters}	

}
```

6. Após concluir o item 5, provavelmente a classe `Principal` apresentará problema, pois não será mais possível passar o parâmetro horário do tipo `String`. Faça os ajustes necessários com os devidos testes.

## Parte 3 (roteiro6.parte3) – Exercício;

1. Crie o pacote `roteiro6.parte3` com a cópia das classes `Principal`, `Ligacao` e `Tempo` implementadas na parte2.
2. Implemente um método na classe `Ligacao` para verificar se um dado número faz parte na ligação. Ou seja, o método deve verificar se um número qualquer informado como parâmetro é o número de origem ou de destino da ligação.
3. Implemente um método para calcular o valor da ligação. Considere que o valor da ligação vale R$1,00 por minuto.

**OBSERVAÇÕES:** 

- Implemente uma solução flexíveis, considerando que o valor da ligação pode mudar. E caso o valor seja alterado, devemos ter o mínimo de impacto no código.  

- Divida as responsabilidades e implemente métodos nas classes apropriadas. Ou seja, métodos que envolvem informações de tempo, devem ficar na classe `Tempo`, métodos que envolvem informações de Ligação, devem ficar na classe `Ligacao`. Seguindo o mesmo princípio, as implementações relacionadas a interação com o usuário devem ficar na classe `Principal`. 

4. Implemente um novo método para calcular o valor da ligação. Deveremos ter duas formas de cálculo da Ligacao (itens 3 e 4). De forma semelhante ao item 3, considere que o valor da ligação vale R$1,00 por minuto. Mas neste novo método, considere que será cobrado o valor do minuto, mesmo o tempo total da ligação tenha qualquer segundo excedente. Exemplos:

- Início: 10:00:00; Término : 10:00:01; Duração : 00:00:00 ; Tempo cobrado : 1 minuto
- Início: 10:00:00; Término : 10:05:01; Duração : 00:05:01 ; Tempo cobrado : 6 minutos
- Início: 10:00:00; Término : 10:05:35; Duração : 00:05:35 ; Tempo cobrado : 6 minutos
- Início: 09:55:50; Término : 10:03:53; Duração : 00:08:03 ; Tempo cobrado : 9 minutos

5. Faça os testes necessários na classe `Principal` e compare os resultados.

# Roteiro 7

Neste roteiro trabalharemos com **Vetores de Objetos** em Java. Já conhecemos vetores e eles nos permitem armazenar e manipular um conjunto de dados de um mesmo tipo. Neste caso iremos armazenar não somente dados primitivos, mas objetos. Eles são úteis quando precisamos lidar com coleções de elementos (objetos), como por exemplo, armazenar uma lista de alunos, uma lista de produtos, ou qualquer outro tipo de entidade.

Os vetores podem ser:

- **Estáticos** – Possuem um tamanho fixo e definido.
	- **Primitivos** – int, double, float, char
	   ```Java
	   int[] vetor1 = new int[5];
	   double[] vetor2 = new double[10];
	   ```

   - **Objetos** – Objetos do próprio Java ou Objetos criados por nós.
     ```Java
     String[] listaNomes = new String[15];
     Loja[] listaLojas = new Loja[8];
     Aluno[] listaAlunos = new Aluno[10];
     ```
- **Dinâmicos** – Não possuem um tamanho definido e expandimos a memória conforme a necessidade. Este tipo de estrutura de dados armazena **apenas Objetos**.
	- **ArrayList** – Existem várias estruturas para armazenamento dinâmico de objetos em Java, mas abordaremos o mais simples que é o ArrayList;
		```Java
		ArrayList<String> listaNomes = new ArrayList<String>();
		ArrayList<Loja> listaLojas = new ArrayList<Loja>();
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		```

## Parte 1 (roteiro7.parte1) – Vetores Estáticos de Objetos

1. Crie o pacote `roteiro7.parte1` com a classes `Principal` e `Aluno`.
   **OBS.:** Iremos utilizar a mesma classe `Aluno` do `roteiro4.parte4`, conforme diagrama abaixo

   ![image](https://github.com/user-attachments/assets/22b497e8-37d0-4a37-abed-00d5db3f11d8)

2. Agora na classe principal, crie um vetor de objetos estático para armazenar os objetos da classe Aluno conforme o código abaixo. Faça os devidos testes.
```Java
public class Principal {
 
    public static void main(String[] args) {
        
 //Criando um vetor estático de objetos Aluno
       Aluno[] listaAlunos = new Aluno[3];
        
	 //Instanciando os objetos do tipo Aluno
       Aluno aluno01 = new Aluno(111, "Jose", "Sistema de Informação", 2019);
       Aluno aluno02 = new Aluno(222, "Maria", "Engenharia Civil", 2020);
       Aluno aluno03 = new Aluno(333, "Carlos", "Quimica", 2021);

	 //Armazenando os objetos no vetor de alunos
       listaAlunos[0] = aluno01;
       listaAlunos[1] = aluno02;
       listaAlunos[2] = aluno03;
        
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
```

3. Modifique a classe `Principal` para que o input seja feito pelo usuário em um laço de repetição.
   **OBS.:** Utilize o mesmo vetor estático `listaAlunos`
4. Que tipo de problemas ou limitações você percebe ao utilizar um vetor estático de objetos?

## Parte 2 (roteiro7.parte2) – Vetores Dinâmicos de Objetos (ArrayList)

O `ArrayList` é uma classe em Java que implementa a interface `List`. Ele é uma implementação dinâmica de um `array` (ou **Vetor**), o que significa que pode crescer ou encolher automaticamente à medida que novos elementos são adicionados ou removidos.
Para usar um `ArrayList`, você precisa **importar** a classe `ArrayList` e, em seguida, criar uma instância dessa classe:

```Java
import java.util.ArrayList;
public class Principal{
	public static void main(String[] args){
		//Declaração e inicialização de um ArrayList de Strings
		ArrayList<String> nome = new ArrayList<>();
	}
}
```

Por ser uma classe, o ArrayList possui métodos que facilitam a manipulação de um array dinâmico, abaixo os métodos mais utilizados.

**Adicionar Elementos:**
- `.add(E elemento)`, adiciona um elemento ao final do ArrayList.
- `.add(int indice, E elemento)`, insere um elemento em um índice específico no ArrayList.

**Acessar Elementos:**
- `.get(int índice)`, retorna o elemento no índice especificado.
	
**Remover Elementos:**
- `.remove(int índice)`, remove o elemento no índice especificado. 

**Tamanho e Verificação:**
•	`.size()`, retorna o número de elementos no ArrayList.
•	`.isEmpty()`, verifica se o ArrayList está vazio.

1. Crie o pacote `roteiro7.parte2` com a cópia das classes `Principal` e `Aluno` implementados na parte1.
2. Faça as adaptações necessárias para transformar o vetor de objetos estáticos em um vetor de objetos dinâmico. Utilize como exemplo o pequeno trecho de código abaixo para fazer as adaptações necessárias no seu código.

```Java
import java.util.ArrayList;
//Aluno[] listaAlunos = new Aluno[3];
ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
       
Aluno aluno01 = new Aluno(111, "Jose", "Sistema de Informação", 2019);
Aluno aluno02 = new Aluno(222, "Maria", "Engenharia Civil", 2020);
Aluno aluno03 = new Aluno(333, "Carlos", "Quimica", 2021);

//Armazenando os objetos no vetor de alunos
//listaAlunos[0] = aluno01;
//listaAlunos[1] = aluno02;
//listaAlunos[2] = aluno03;

listaAlunos.add(aluno01);
listaAlunos.add(aluno02);
listaAlunos.add(aluno03);
```

## Parte 3 (roteiro7.parte3) – Exercício

1. Crie o pacote `roteiro7.parte3` com a cópia das classes `Principal` e `Aluno` implementados na parte2.
2. Vamos evoluir o projeto. Acrescente um novo atributo na classe `Aluno` chamado `listaDisciplinas`. Este atributo deve ser um `ArrayList` de `String`.

```Java
import java.util.ArrayList;

public class Aluno {
    
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplina;
    private String situacao;
    private ArrayList<String> listaDisciplinas;
    
    
    Aluno(int matricula, String nome, String curso, int anoIngresso){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.listaDisciplinas = new ArrayList<>();
    }

    
	{Getters e Setters}    

}
```

3. Crie um método na classe aluno para que seja possível adicionar uma disciplina no ArrayList listaDisciplinas.
**OBS.:** Esta questão tem 2 abordagens possíveis:
1. Este método pode receber como parâmetro uma lista completa de disciplinas para que seja atualizado o atributo com a lista de disciplinas do aluno.
2. Este método pode receber como parâmetro uma `String` com uma disciplina apenas para que seja adicionada no atributo lista de disciplinas do aluno. 

As duas abordagens estão corretas e podemos ter inclusive as duas implementadas na classe `Aluno`.
Analise quando será útil cada uma das abordagens.

4. Crie um método que retorne a lista de disciplinas que o aluno está matriculado.
5. Faça as adaptações necessárias na classe Principal para que seja possível criar um aluno e adicionar as disciplinas deste aluno uma a uma, na medida que for necessário incluir uma nova disciplina.
6. Avalie se ainda é necessário o atributo `qtdeDisciplina` da classe `Aluno`. Se não for necessário, remova o atributo com todos os ajustes necessários.

**OBS.:** Independente das mudanças feitas no item 6, apresente na classe `Principal` a quantidade de disciplinas que o aluno foi matriculado.  

# Roteiro 8

Neste roteiro trabalharemos com os conceitos de **Herança** e **Polimorfismo**. 
Já aplicamos o Polimorfismo da forma mais simples possível que foi utilizando a Sobrecarga do método construtor, mas o conceito é mais amplo e podemos utilizar de outra forma. 
Então vamos ao conceito de **Polimorfismo** - deriva da palavra polimorfo, que significa multiforme, ou que pode variar a forma. Para a POO, polimorfismo é a habilidade de objetos de classes diferentes responderem a mesma mensagem de diferentes maneiras. Ou seja, várias formas de responder à mesma mensagem. 
Podemos trabalhar com Polimorfismo de duas maneiras:
- **Sobrecarga (overload)** - Lembrando que sobrecarga consiste em permitir que dentro da mesma classe tenhamos métodos com mesmo nome, mas com diferentes parâmetros (`Roteiro 5`).
- **Sobreposição (override)** – Para o uso desta técnica precisamos do conceito de Herança em OO. Esta técnica permite reescrever um método em uma subclasse que possua um comportamento diferente do método de mesmo nome na superclasse.

**Herança** – é um princípio de OO, que permite que as classes compartilhem atributos e métodos, através de “heranças”. Ela é usada na intenção de reaproveitar código ou comportamento, seja generalizando ou especializando operações e atributos.

![image](https://github.com/user-attachments/assets/0e9006fc-be52-4ddc-879e-40aadd0f4e21)

Agora iremos aplicar estes conceitos durante o roteiro.

## Parte 1 (roteiro8.parte1) – Herança

**Cenário inicial:**

Deseja-se fazer um controle para cobranças de pedágio em uma rodovia. Para isso, neste cenário inicial teremos apenas o cliente com seus atributos (cpf_cnpj, nome, endereço, email, telefone), e o veículo que este cliente possui. O veículo por sua vez, tem como atributo : placa e ano de fabricação. Acontece que existem 3 tipos de veículos e o valor cobrado no pedágio depende do tipo de veículo que o cliente possui :  

- Veículos de carga que devem registrar também o peso máximo que podem carregar. O pedágio cobrado é de R$ 2,00 por quilo que pode carregar.
- Veículos de passeio que devem registrar a quantidade máxima de passageiros possíveis. O pedágio cobrado é de R$ 5,00 por pessoa que o veículo comporta.
- Veículos pequenos que devem registrar o modelo. O pedágio cobrado tem taxa única de R$ 6,00.

1. Crie o pacote `roteiro8.parte1` com a classes `Principal`, `Cliente`, `Veiculo`, `VeiculoCarga`, `VeiculoPasseio`, e `VeiculoPequeno`. 
Observe que estamos criando uma classe para cada tipo de veículo justamente para aplicar o conceito de herança.
Crie as classes com seus atributos de acordo com o que foi indicado no cenário inicial e no diagrama abaixo.

![image](https://github.com/user-attachments/assets/e0d0807e-30fb-4607-a4ec-f61bb3481f8f)

2. Na classe `Cliente`, crie o construtor com todos os atributos, os seus Getters e Setters.
3. Na classe `Veiculo`, crie o construtor com todos os atributos, os seus Getters e Setters.
4. Para as classes `VeiculoCarga`, `VeiculoPasseio`, e `VeiculoPequeno` iremos aplicar a **Herança**.

O uso do comando `extends` conforme o código abaixo indica que que estamos aplicando a herança. Ou seja, estas classes irão herdar os atributos e métodos da classe `Veiculo`. 

**OBS.:** Ao aplicar a herança nestas classes, possivelmente será indicado algum erro, pois a SuperClasse ou classe Pai tem um construtor, e as SubClasses ou classe Filha não tem construtor. O erro indica que obrigatoriamente teremos que criar um método construtor nas classes filha, já eu a classe pai tem um construtor.  

```Java
public class VeiculoCarga extends Veiculo {

   private int pesoMax;

   {Getters e Setters}	
 
}
```
```Java
public class VeiculoPasseio extends Veiculo {

   private int qtdeMaxPassageiros;

   {Getters e Setters}	
    
}
```
```Java
public class VeiculoPequeno extends Veiculo {

   private String modelo;

   {Getters e Setters}	 
    
}
```

5. Crie agora o método construtor para cada uma das classes filha `VeiculoCarga`, `VeiculoPasseio`, e `VeiculoPequeno`.

Veja que dentro do construtor de cada uma das classes filha existe a chamada do construtor Pai através do comando `super()`.
A herança neste caso também é uma forma de garantir que todas as classes filha irão ter obrigatoriamente o construtor da classe Pai. Afinal, não faz sentido criar um Veículo sem as informações de placa e ano de fabricação.

**ATENÇÃO:** Com estes construtores implementados, estamos garantindo apenas o preenchimento dos atributos da classe Pai (placa e ano de fabricação).  Mas existem atributos específicos de cada classe, que não estão sendo preenchidos neste momento. 

```Java
public class VeiculoCarga extends Veiculo {

   private int pesoMax;

   public VeiculoCarga(String placa, int anoFabricacao) {
        super(placa, anoFabricacao);
   }

   {Getters e Setters}	
 
}
```
```Java
public class VeiculoPasseio extends Veiculo {

   private int qtdeMaxPassageiros;

   public VeiculoPasseio(String placa, int anoFabricacao) {
        super(placa, anoFabricacao);
   }

   {Getters e Setters}	
 
}
```
```Java
public class VeiculoPequeno extends Veiculo {

   private String modelo;

   public VeiculoPequeno(String placa, int anoFabricacao) {
        super(placa, anoFabricacao);
   }

   {Getters e Setters}		
 
}
```

6. Modifique os construtores das classes filha `VeiculoCarga`, `VeiculoPasseio`, e `VeiculoPequeno` para que os atributos específicos de cada classe sejam contemplados.

```Java
public class VeiculoCarga extends Veiculo {

   private int pesoMax;

   public VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
        super(placa, anoFabricacao);
  this.pesoMax = pesoMax;
   }

   {Getters e Setters}	
 
}
```
```Java
public class VeiculoPasseio extends Veiculo {

   private int qtdeMaxPassageiros;

   public VeiculoPasseio(String placa, int anoFabricacao, int qtdeMaxPassageiros) {
        super(placa, anoFabricacao);
  this. qtdeMaxPassageiros = qtdeMaxPassageiros;
   }

   {Getters e Setters}	
 
}
```
```Java
public class VeiculoPequeno extends Veiculo {

   private String modelo;

   public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
        super(placa, anoFabricacao);
  this.modelo = modelo;
   }

   {Getters e Setters}	
 
}
```

7. Teste a criação dos objetos dos diferentes tipos de Veículos na classe Principal.
Faça os devidos testes, modificando e exibindo os dados dos veículos criados.
Consegue modificar e exibir tanto dados da classe Pai quanto da classe Filha?

```Java
public class Principal {
 
    public static void main(String[] args) {
        
      Veiculo v01 = new Veiculo("11111-BA", 2010);
      VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
      VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
      VeiculoPequeno v04 = new VeiculoPequeno("33333-BA", 2012, "moto");        
        
    }
}
```

8. Para o cenário descrito no roteiro, faz sentido a criação do veículo v01, já que ele não é nenhum dos 3 tipos descritos ? Considera isso uma falha de projeto?

Precisamos avaliar se a criação do objeto v01 é uma questão crítica para o projeto. Se for este o caso podemos utilizar o conceito de Classe Abstrata.

**Classe Abstrata** - É um tipo de classe especial que não pode ser instanciada, apenas herdada. Sendo assim, uma classe abstrata não pode ter um objeto criado a partir de sua instanciação. Essas classes são muito importantes quando não queremos criar um objeto a partir de uma classe “geral”, apenas de suas “subclasses”.
Se fizer a mudança abaixo não será mais possível criar o veículo v01:

```Java
public abstract class Veiculo{

   private String placa;
   private int anoFabricacao;

   {Construtor}

   {Getters e Setters}	 
}
```

## Parte 2 (roteiro8.parte2) – Polimorfismo

1. Crie o pacote `roteiro8.parte2` com a cópia das classes implementados na parte1. 

2. Vamos agora resolver a questão do cálculo do pedágio descrito no cenário. Considerando que existe uma taxa única no valor de R$ 6.00, mas que é cobrado este valor apenas no caso de veículo pequeno, vamos implementar o polimorfismo de sobreposição (`override`) apenas nas classes `VeiculoCarga` e `VeiculoPasseio`. O cálculo do pedágio em si ficará na classe Pai (`Veiculo`).

Para isso, crie o atributo `taxaPedagio` do tipo `protected`. O acesso `protected` garante que apenas as classes filha podem acessar este atributo. Crie também o método para o cálculo do pedágio conforme o código abaixo.

```Java
public abstract class Veiculo{

   private String placa;
   private int anoFabricacao;
   protected double taxaPedagio = 6.0;

   {Construtor}

   {Getters e Setters}	

   Public double calcPedagio(){
	return this.taxaPedagio; 
   }
}
```

3. Implemente a sobreposição (`override`) do método `calcPedagio` nas classes `VeiculoCarga` e `VeiculoPasseio`.

```Java
public class VeiculoCarga extends Veiculo {

   private int pesoMax;

   {Construtor}

   {Getters e Setters}	

    @Override
    public double calcPedagio() {
        super.taxaPedagio = 2.0;
        return super.taxaPedagio * this.pesoMax;
    }
}
```
```Java
public class VeiculoPasseio extends Veiculo {

   private int qtdeMaxPassageiros;

   {Construtor}

   {Getters e Setters}	

    @Override
    public double calcPedagio() {
        super.taxaPedagio = 5.0;
        return super.taxaPedagio * this.qtdeMaxPassageiros;
    }
}
```

4. Teste a criação dos objetos dos diferentes tipos de veículos na classe `Principal`.

Faça os devidos testes, modificando e exibindo os dados dos veículos criados.

O cálculo do pedágio teve o resultado esperado?

```Java
public class Principal {
 
    public static void main(String[] args) {
        
	VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
	VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
	VeiculoPequeno v04 = new VeiculoPequeno("33333-BA", 2012, "moto");        

	System.out.println("Pedágio v02 : " + v02.calcPedagio());
	System.out.println("Pedágio v03 : " + v03.calcPedagio());
	System.out.println("Pedágio v04 : " + v04.calcPedagio());  
    }
}
```

## Parte 3 (roteiro8.parte3) – Exercício

1. Crie o pacote `roteiro8.parte3` com a cópia das classes implementados na **parte2**. 

2. Faça as adaptações necessárias na classe `Cliente` para guardar a informação de que um cliente possui um veículo.

3. Na classe Principal crie um cliente qualquer para teste. Set um veículo para este cliente e apresente os dados do cliente, indicando quanto este cliente deve pagar pelo pedágio.

Faça testes “setando” diferentes tipos de veículos para ver o resultado.

4. Utilize o software StarUML para construir o diagrama de classes fazendo engenharia reversa do código.

**OBS.:** geração dos diagramas no StarUML: https://staruml.io/ . Para fazer a engenharia reversa do código siga as orientações conforme o vídeo a seguir: 

[Star UML - Gerando Diagrama de Classes a partir do código Java](https://www.youtube.com/watch?v=z6DDuZQArro)

# Roteiro 9

Neste roteiro trabalharemos com o conceito de **Interface**. 

**Interface** é um recurso da linguagem Java que apresenta inúmeras vantagens no sentido da modelagem e instanciação de objetos, porém deve-se entender claramente os conceitos básicos da orientação a objetos a fim de utilizá-la plenamente.

Uma interface é **similar a um contrato**. Com o uso de uma interface podemos “obrigar” que os métodos descritos nesta interface sejam implementados em um grupo de classes que desejamos.

Pode-se dizer, de forma ilustrativa, que uma interface é um contrato que quando assumido por uma classe deve ser implementado.

Dentro de uma interface existem apenas assinaturas de métodos (sem implementação). Podem conter também propriedades em forma de constantes. Então, pode-se dizer que uma classe que “assume o contrato” com uma determinada interface, tem “obrigação” de implementar os métodos descritos nesta interface.

Agora iremos aplicar estes conceitos durante o roteiro.

## Parte 1 (roteiro9.parte1) – Interface

**Cenário:**

Vamos imaginar a modelagem de um sistema onde seja necessário criar diversos componentes visuais no formato de figuras geométricas como quadrado, retângulo, círculo e etc. 

Sabe-se que estas figuras possuem características especificas de cada uma delas (atributos). Exemplo: lado, altura, largura, raio. 

Utilizando-se dos atributos de cada uma das figuras queremos implementar métodos comuns a todas elas como por exemplo: calcular a área e calcular o perímetro. Além de implementar estes métodos, queremos que todas as figuras possuam obrigatoriamente estes métodos.

1. Crie o pacote `roteiro9.parte1` com a classe `Principal`.
2. Crie agora a interface **FiguraGeometrica** conforme o código abaixo.

Uma interface é um arquivo com a extensão `.java` semelhante a uma classe qualquer. Diferenciamos uma da outra apenas pela sintaxe dentro do código. 
No lugar de `public class` temos `public interface`.

Na IDE do Netbeans podemos criar diretamente em New -> Java Interface

```Java
public interface FiguraGeometrica {
    
    public String getNomeFigura();
    public double getArea();
    public double getPerimetro();
    
}
```

Observe que nesta interface temos 3 métodos sem implementação.

3. Crie as classes `Quadrado` e `Retangulo` conforme o código abaixo.

```Java
public class Quadrado {
    
    private double lado;
    
    public Quadrado (int lado){
        this.lado = lado;
    } 

    {Gets e Sets}
   
}
```

```Java
public class Retangulo {
    
    private double altura;
    private double largura;
    
    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    {Gets e Sets}
   
}
```

4. Faça com que a classe `Retangulo` implemente a interface `FiguraGeometrica`.

Neste momento é a “assinatura do contrato”. A classe `Retangulo` obrigatoriamente terá que implementar as classes da interface.

Ao fazer a alteração conforme no código abaixo, provavelmente um erro será indicado em tela, pois os métodos ainda não foram implementados.

**OBS.:** Algumas IDEs geram os métodos da interface automaticamente e o desenvolvedor precisa apenas implementá-los. Vale a pena conferir. 

```Java
public class Quadrado implements FiguraGeometrica {
    
    private double lado;
    
    public Quadrado (int lado){
        this.lado = lado;
    } 

    {Gets e Sets}
   
}
```

5. Implemente na classe `Quadrado` os métodos indicados na interface conforme o trecho de código abaixo.

```Java
public class Quadrado implements FiguraGeometrica {
    
    private double lado;
    
    public Quadrado (int lado){
        this.lado = lado;
    } 

    {Gets e Sets}

    @Override
    public String getNomeFigura() {
        return "Quadrado"; 
    }

    @Override
    public double getArea() {
        return this.lado*this.lado;
    }

    @Override
    public double getPerimetro() {
       return this.lado * 4;      
    }

}
```

6. Podemos dizer que esta técnica faz uso de Polimorfismo? Sim ou não? Explique.
7. Faça as adaptações necessárias para que a classe `Retangulo` implemente a interface `FiguraGeometrica`.
8. Faça os testes na classe `Principal` utilizando os métodos implementados para as 2 figuras criadas.

## Parte 2 (roteiro9.parte2) – Exercício

1. Crie o pacote `roteiro9.parte2` com a cópia das classes implementados na parte1.
2. Crie uma nova classe chamada `Circulo` em que tenha como atributo o raio e faça com que ela implemente a interface `FiguraGeometrica`.
3. Faça os testes na classe `Principal` utilizando os métodos implementados para as 3 figuras criadas.
4. Utilize o software StarUML para construir o diagrama de classes fazendo engenharia reversa do código.  

# Roteiro 10

Neste roteiro trabalharemos com as **interfaces gráficas em Java - Swing**. 

O objetivo deste roteiro é passar uma breve noção de como funcionam as interfaces gráficas com o usuário. Existem plataformas que facilitam a construção de interfaces automatizadas, mas não utilizaremos estes recursos. Faremos a construção das interfaces de forma manual. Utilizaremos recursos básicos, mas compreendendo a construção do código. Trabalharemos especificamente com a biblioteca gráfica Swing.

**Como funciona a Interface com o Usuário – User Interface (UI)**

Entendemos como UI o segmento de código que permitem os meios de interação com o usuário com _Inputs_ e _Outputs_.

** A Interface com o usuário pode ser de 2 formas:**

- **Console** – Todos os roteiros anteriores utilizamos o console para fazer input e output
- **Gráfica (GUI – _Graphical User Interface_)** – neste caso toda a interação é feita com componentes gráficos como objetos de Janelas, Botões e etc.

![image](https://github.com/user-attachments/assets/08768781-71cd-4b00-984b-ac4cbe0c2e47)

**Tipos de Objetos Gráficos**

Para compreender melhor as interfaces gráficas em Java vamos separar os Objetos Gráficos em 3 grandes Grupos:

- Componentes Gráficos – 
	- São os componentes visuais.  Ex.: Janela, Botões, Caixa de Texto e etc.

- Gestores de Posicionamento (Layout Managers)
	- São responsáveis pelo dimensionamento das janelas e posicionamento de outros componentes visuais em tela.

- Manipuladores de Eventos (Event Listeners)
	- São responsáveis por responder aos eventos de solicitações do usuário em tela. Ex.: Cliques nos botões, movimentação do mouse, e outros eventos.

**Toolkits Java para GUI**

A principais bibliotecas gráficas são:
- AWT
	- Em geral trata da Gestão de Posicionamento e Manipulação de Eventos
- Swing
	- Em geral trata dos componentes visuais em tela
- Java 2D
	- Em geral trata de componentes gráficos 2D

**Segue abaixo um gráfico nos situar no contexto de Interfaces Gráficas**

![image](https://github.com/user-attachments/assets/1c0c17b9-9d0e-4748-bb6b-ad1f1a2d039b)

**Hierarquia de Classes de Componentes Gráficos**

Todas as bibliotecas e pacotes em Java seguem a POO e os conhecimentos adquiridos nos roteiros anteriores nos ajudam a compreender melhor o diagrama abaixo.

Veja que o diagrama abrange conceitos da OO como : Herança, Classes Abstratas, Interfaces.

Observe que todos os componentes visuais herdam de JComponent que por sua vez vem de Container – Component – Object.

![image](https://github.com/user-attachments/assets/53de77a2-9e97-4563-8c20-a7964ba2487a)

## Parte 1 (roteiro10.parte1) – JFrame

1. Crie o pacote `roteiro10.parte1` com a classes `Principal` contendo o método main.
2. Crie a classe `Janela01` que herda de `JFrame`. Esta classe representa um componente visual do tipo “Janela”. Para criar esta Janela utilizamos o conceito de herança, e dessa forma conseguimos utilizar todos os métodos e atributos da classe JFrame.

Veja que nossa classe possui apenas 2 atributos (largura e altura) para determinar as dimensões da nossa janela. Mas, estamos utilizando 3 métodos da classe `JFrame`:

`this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` - seta a operação padrão que será executada ao fechar a janela. Neste caso, a aplicação será encerrada ao fechar a Janela.

`this.setSize(largura,altura)` – seta as dimensões de largura e altura da janela.

`this.setVisible(true)` – torna a janela visível.

```Java
import javax.swing.JFrame;

public class Janela01 extends JFrame{
    
    private int largura = 600;
    private int altura = 500;
    
    public Janela01()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura,altura);        
        this.setVisible(true);
    }
}
```

3. Para visualizar a tela em execução implemente o código abaixo na classe `Principal`. Novamente estamos usando um princípio de OO, pois estamos instanciando um objeto chamado janela01. Só que agora este objeto é visual. Faça os testes rodando a classe `Principal`.

```Java
public class Principal {
    
    public static void main(String[] args) {

        Janela01 janela01 = new Janela01();

    }
}
```

4. Crie uma nova janela com o nome da classe `Janela02`, semelhante ao que foi feito para `Janela01`. Mude apenas as dimensões para diferenciar uma Janela da outra.

```Java
import javax.swing.JFrame;

public class Janela02 extends JFrame{
    
    private int largura = 300;
    private int altura = 300;
    
    public Janela02()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura,altura);        
        this.setVisible(true);
    }
}
```

5. Teste na classe Principal a criação das duas janelas conforme o código abaixo.

Nas classes `Janela01` e `Janela02` teste os métodos `setTitle("Janela01");` e `setTitle("Janela02");`. Para diferenciar uma janela da outra pelo título da janela.

```Java
public class Principal {
    
    public static void main(String[] args) {

        Janela01 janela01 = new Janela01();

        Janela02 janela02 = new Janela02();

    }
}
```

6. Vamos agora adicionar outros componentes visuais na `Janela02`. Crie 2 novos atributos do tipo `JButton` na classe `Janela02` conforme o código abaixo.

Atenção para os seguintes itens no código:
- Importar o pacote `JButton`
- Definir os novos atributos do tipo `JButton`: `btn01` e `btn02`
- Instanciar os objetos `btn01` e `btn02` dentro do construtor da `Janela02`
- Definir o posicionamento e as dimensões dos botões
- Adicionar os objetos ao container da Janela
- Setar o Layout da Janela – `this.setLayout(null);`

	- Este item merece um pouco mais de atenção neste momento. Observe que ele foi setado para `null`. **Ou seja, estamos assumindo a gestão do Layout dos componentes visuais em tela, e por isso, precisamos inserir manualmente as posições e dimensões dos botões** (`btn01.setBounds`).
	- Este item está relacionado ao grupo de objetos que chamamos de Gestores de Posicionamento (_Layout Managers_) que citamos no início do roteiro.
 	- **Faça o seguinte teste:** Comente a linha `this.setLayout(null);`. A aplicação tentará controlar o layout dos componentes visuais em tela e ocorrerá uma sobreposição dos botões, além de ocupar todo o espaço da janela. 

```Java
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela02 extends JFrame{
    
    private int largura = 300;
    private int altura = 300;
    private JButton btn01;
    private JButton btn02;
    
    public Janela02()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura,altura); 
        this.setTitle("Janela02");
        this.setLayout(null);
        
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        
	// setando as dimensões dos botões
	// setBounds(posição x , posição y, largura e altura)		
        btn01.setBounds(20, 50, 100, 40);  
        btn02.setBounds(130, 50, 100, 40);         
        
        this.add(btn01);
        this.add(btn02);
        
        this.setVisible(true);
    }
    
}
```

## Parte 2 (roteiro10.parte2) – Gestores de Posicionamento (Layout Managers)

Os Gestores de Posicionamento (Layout Managers) são responsáveis pelo dimensionamento das janelas e posicionamento de outros componentes visuais em tela.

Na parte 1 do roteiro criamos uma janela com alguns componentes visuais em que o posicionamento e as dimensões dos componentes foram feitos de forma manual no código. Nesta parte faremos uso de alguns gerenciadores de layout que fazem este trabalho de forma automática. Segue alguns que veremos neste roteiro:

- **FlowLayout** – É um gerenciador de layout padrão que simplesmente dispõe os componentes visuais em uma única linha, iniciando uma nova linha se o container não for suficientemente largo.
- **GridLayout** – Também é um gerenciador de layout que dispõe os componentes visuais em um certo número de  linhas e colunas formando um grid com componentes de igual proporção.
- **BorderLayout** – Este gerenciador permite organizar os componentes visuais em cinco áreas diferentes : superior, inferir, esquerda, direita e centro


Existem vários outros gerenciadores de Layout, mas utilizaremos apenas estes como forma de aprendizado. Segue o link de referência com outros Layouts: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html 

1. Crie o pacote `roteiro10.parte2` com a classe `Principal` conforme o código abaixo.
Observe que estamos instanciando 4 diferentes objetos que representam 4 janelas com diferentes layouts. Precisamos criar as classes correspondentes para estes 3 tipos de janelas.

```Java
public class Principal {
    
    public static void main(String[] args) {

        JanelaSemLayout janela01 = new JanelaSemLayout();
        
        JanelaFlowLayout janela02 = new JanelaFlowLayout();
        
        JanelaGridLayout janela03 = new JanelaGridLayout();
                
        JanelaBorderLayout janela04 = new JanelaBorderLayout();
    }
}
```

2. Crie as 4 classes conforme o código abaixo que representam diferentes janelas e seus respectivos layouts. (`JanelaSemLayout`, `JanelaFlowLayout`, `JanelaGridLayout`, `JanelaBorderLayout`). Observe que criamos um método chamado iniciarComponentes para facilitar o entendimento do código.

```Java
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaSemLayout extends JFrame{
    
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    
    public JanelaSemLayout()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura,altura); 
        this.setTitle("Janela Sem Layout");

        this.setLayout(null);
        
        this.iniciarComponentes();
        
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){

        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");
        
        btn01.setBounds(20, 50, 90, 30);  // (x,y, largura, altura)
        btn02.setBounds(130, 50, 90, 30);  // (x,y, largura, altura)        

        btn03.setBounds(30, 90, 90, 30);  // (x,y, largura, altura)
        btn04.setBounds(140, 90, 90, 30);  // (x,y, largura, altura)        

        btn05.setBounds(40, 130, 90, 30);  // (x,y, largura, altura)
        btn06.setBounds(150, 130, 90, 30);  // (x,y, largura, altura)        
        
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }
    
}
```

Observe que a dimensão da janela não importa quando estamos utilizando o gerenciador de layout. Por isso o comando `this.setSize(largura,altura);` foi retirado nas classes seguintes.  A janela vai se ajustar conforme os componentes existentes e o comando responsável por esta ação é: `this.pack();`

```Java
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaFlowLayout extends JFrame {
    
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    
    public JanelaFlowLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela FlowLayout");

        this.setLayout(new FlowLayout());
        
        this.iniciarComponentes();
        
        this.pack();
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){

        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");
    
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }
}
```

Observe que no caso do GridLayout conseguimos definir a quantidade de linhas e colunas da janela em que os componentes irão se organizar `new GridLayout(2,3);`. Neste caso temos 2 linhas e 3 colunas.

```Java
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaGridLayout extends JFrame {
    
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    
    public JanelaGridLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela GridLayout");

        this.setLayout(new GridLayout(2,3));
        
        this.iniciarComponentes();
        
        this.pack();
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){

        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");

        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }
}
```

No caso do BorderLayout observe que temos a flexibilidade de colocar os componentes em diferentes áreas da janela (superior, inferir, esquerda, direita e centro).

```Java
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaBorderLayout extends JFrame {
    
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    
    public JanelaBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        this.setLayout(new BorderLayout());
        
        this.iniciarComponentes();
        
        this.pack();
        this.setVisible(true);
        
    }
    
    public void iniciarComponentes(){

        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
    
        this.add(btn01, BorderLayout.PAGE_START);
        this.add(btn02, BorderLayout.PAGE_END);
        this.add(btn03, BorderLayout.LINE_START);
        this.add(btn04, BorderLayout.LINE_END);
        this.add(btn05, BorderLayout.CENTER);
    }
    
}
```

3. Faça os testes executando a classe `Principal`.

## Parte 3 (roteiro10.parte3) – Layout Managers

1. Crie o pacote `roteiro10.parte3` com a classe `Principal` conforme o código abaixo. Observe que estamos instanciando apenas o objeto `janela04` que trabalha com o BorderLayout.

```Java
public class Principal {
    
    public static void main(String[] args) {
                
        JanelaBorderLayout_v1 janela04 = new JanelaBorderLayout_v1();
    }
}
```

2. Crie a classe `JanelaBorderLayout_v1` conforme o código abaixo. Nesta classe estamos utilizando o `BorderLayout`, mas antes de inserir os componentes estamos dividindo as áreas em painéis com o componente `JPanel`. O `JPanel` é um componente do tipo container que permite a inserção de outros componentes visuais nos ajudando na organização dos componentes em tela.

```Java
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaBorderLayout_v1 extends JFrame{
    
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;
    
    public JanelaBorderLayout_v1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        this.setLayout(new BorderLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
        this.pnCabecalho = new JPanel();
        this.pnRodape = new JPanel();
        this.pnEsquerda = new JPanel();
        this.pnDireita = new JPanel();
        this.pnCentro = new JPanel();
    
        this.pnCabecalho.setBackground(Color.red);
        this.pnRodape.setBackground(Color.blue);
        this.pnEsquerda.setBackground(Color.yellow);
        this.pnDireita.setBackground(Color.gray);
        this.pnCentro.setBackground(Color.green);
        
        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro, BorderLayout.CENTER);
    }
}
```

Normalmente não é possível visualizar o componente JPanel e por isso colocamos diferentes cores para facilitar a identificação dos painéis

Faça os testes executando a classe Principal.

3. Crie a classe `JanelaBorderLayout_v2` como cópia da classe `JanelaBorderLayout_v1`. 

Teremos agora 2 versões da classe `JanelaBorderLayout`. Uma apenas com os painéis e a outra com vários outros componentes visuais.

Nesta nova classe adicione os métodos conforme o código abaixo. Eles são responsáveis por iniciar os respectivos painéis com seus componentes

Para testar lembre-se de adicionar a chamada dos métodos abaixo dentro do método já existente `iniciarComponentes()`

```Java
    public void iniciarCabecalho(){
        
        this.pnCabecalho.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.pnCabecalho.add(new JLabel("Curso"));
        this.pnCabecalho.add(new JTextField(10));
        
        this.pnCabecalho.add(new JLabel("Observações"));
        this.pnCabecalho.add(new JTextField(25));
    }

    public void iniciarRodape(){
        
        this.pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.pnRodape.add(new JButton("Botão 04"));
        this.pnRodape.add(new JButton("Botão 05"));
    }

    public void iniciarCentro(){
        
        this.pnCentro.setLayout(new GridLayout(3,2));
                
        this.pnCentro.add(new JLabel("Matricula"));
        this.pnCentro.add(new JTextField());
        
        this.pnCentro.add(new JLabel("Nome"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Idade"));
        this.pnCentro.add(new JTextField());
        
    }
```

4. Faça os testes na classe `Principal` mudando a chamada da versão 1 para a versão 2 da janela `BorderLayout`. Na versão 2 foi usado apenas um tipo de layout? Sim ou não? Quais?

## Parte 4 (roteiro10.parte4) – Manipuladores de Eventos (Event Listeners)

As aplicações em geral precisam de alguns eventos para o funcionamento completo. Normalmente as GUIs são baseadas em eventos. Eventos são tarefas realizadas quando o usuário faz alguma interação com algum componente visual. Exemplo :

- O clique do mouse
- O mover do mouse
- Apertar alguma tecla
- Fechar a janela 

Em Java temos uma interface `EventListener`, e a partir desta interface temos diversos outros tipos de eventos com suas especificidades. A primeira e mais comum delas é a `ActionListener` que iremos utilizar no roteiro.

Vamos ao roteiro !

1. Crie o pacote `roteiro10.parte4` com a classe `Principal` e a classe `JanelaSemLayout` utilizada na parte 2 deste roteiro.
2. Na classe `JanelaSemLayout`, implemente a interface `ActionListener` conforme apresentado no código abaixo. Novamente estamos utilizando os conceitos de OO com o uso de uma interface já disponível no pacote Java.

**OBS.:** Ao adicionar `implements ActionListener` sua IDE apontará um erro indicando que os métodos desta interface deverão ser obrigatoriamente implementados na classe `JanelaSemLayout`

```Java
public class JanelaSemLayout extends JFrame implements ActionListener{
    
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    
    public JanelaSemLayout()
    {
        {Código do Construtor}
    }
    
    public void iniciarComponentes(){
	 {Código para iniciar os componentes}
    }

}
```

3. Para resolver o problema indicado no item 2, adicione o método `actionPerformed` na classe `JanelaSemLayout` conforme o código abaixo  

**OBS.:** o método abaixo foi gerado automaticamente pela IDE. Ou seja, estamos fazendo o override do método, mas ainda não implementamos o método propriamente dito.

Observe também que ao concluir estas etapas, possivelmente os imports abaixo foram adicionados na sua classe.

```Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
```
```Java
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
```

Implemente o método conforme o código abaixo:

```Java
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(“o clique do mouse foi acionado”) 
    }
```

4. Para que os eventos ocorridos no formulário sejam “percebidos” ou “ouvidos” pelo botão, adicione o comando abaixo. 

```Java
public class JanelaSemLayout extends JFrame implements ActionListener{
    
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    
    public JanelaSemLayout()
    {
        {Código do Construtor}
    }
    
    public void iniciarComponentes(){
	 {Código para iniciar os componentes}
	 
	 btn01.addActionListener(this);
    }

}
```

5. Faça os devidos testes na classe Principal. Todos os botões acionam o evento?
6. O que acontece se adicionarmos o trecho de código abaixo ao repetir os testes do item 5?

```Java
public class JanelaSemLayout extends JFrame implements ActionListener{
    
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    
    public JanelaSemLayout()
    {
        {Código do Construtor}
    }
    
    public void iniciarComponentes(){
	 {Código para iniciar os componentes}
	 
	 btn01.addActionListener(this);
 btn02.addActionListener(this);   
    }

}
```

7. Altere o método actionPerformed conforme o código abaixo e faça os testes novamente na classe `Principal`. O que percebeu de diferença em relação ao teste do item 6? 

```Java
@Override
public void actionPerformed(ActionEvent e) {
    Object o = e.getSource();
    JButton b = (JButton)o;
    String nome = b.getText();
        
    System.out.println("o Clique do mouse foi acionado por : " + nome + " da     classe " + o.getClass());    

}
```
