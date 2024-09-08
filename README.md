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


