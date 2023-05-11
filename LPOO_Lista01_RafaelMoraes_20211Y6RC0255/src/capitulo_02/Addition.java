package capitulo_02;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition {
	
	 // método principal inicia a execução do aplicativo Java
	 public static void main( String[] args )
	 {
	 // cria um Scanner para obter entrada da janela de comando
	 Scanner input = new Scanner( System.in );
	
	 int number1; // primeiro número a adicionar
	 int number2; // segundo número a adicionar
	 int sum; // soma de number1 e number2
	
	 System.out.print( "Insira o primeiro número: " ); // prompt
	 number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário
	
	 System.out.print( "Insira o segundo número: " ); // prompt
	 number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
	
	 sum = number1 + number2; // soma os números, depois armazena o total em sum
	
	 System.out.printf( "A soma é %d\n", sum ); // exibe a soma
	 } // fim do método main
}

/*
* Reposta da Questão 10:
* 
* Do ponto de vista do usuário, o programa realiza uma 
* Operação soma de dois números e imprime o resultado.
* O usuário terá que inserir o primeiro número, logo após
* insere o segundo número. Por fim o programa retorna com
* a coma dos dois números.
*/

/*
* Resposta da Questão 11:
* 
* A linha de código "Scanner input = new Scanner(System.in);"
* Cria um objeto da classe Scanner, que é uma classe disponível
* no pacote java.util.Scanner; Daí ele cria um objeto "input" da
* classe Scanner que será usado para ler dados de entrada do 
* usuário.
*/

/*
* Resposta da Questão 12:
* 
* Ao comentar a linha 3 e em seguida rodar o código aparece um erro
* (Erro fixado em imagem no documento PDF)
* Ao comentar a linha 3, o compilador não encontrará a classe Scanner,
* o que resultará em um erro de compilação na linha 11, que tenta criar
* um objeto Scanner usando o construtor Scanner(System.in). A linha 3 é
* esponsável por importar a classe Scanner do pacote java.util, permitindo
* que ela seja usada no programa. Sem essa linha, seria necessário usar 
* o nome completo da classe sempre que ela fosse referenciada,
* como java.util.Scanner input = new java.util.Scanner(System.in).
*/
