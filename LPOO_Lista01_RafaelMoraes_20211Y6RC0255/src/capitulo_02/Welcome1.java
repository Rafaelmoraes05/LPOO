package capitulo_02;


/* Programa Welcome1
 * 
// Figura 2.1: Welcome1.java
// Programa de impressão de texto.

public class Welcome1
{
	// método principal inicia a execução do aplicativo Java
	public static void main( String[] args )
 	{
 		System.out.println( "Welcome to Java Programming!" );
    } // fim do método main
} // fim da classe Welcome1
 */



/*
* Resposta da Questão 2: 
* 
* A figura 2.1 mostra basicamente um "Hello Word!" em Java. 
* Ela é composta por uma classe denominada de "Welcome1" 
* Em seguida vem um método "Main" que inicia a execução 
* Do programa, e dentro desse método há um System.out.println
* Onde imprime a mensagem "Welcome to Java Programming!".
*/



/*
 * Resposta da Questão 3: 
 * 
 * Após compilar e executar o código ele imprime a seguinte
 * saída: "Welcome to Java Programming!" Mas para isso tive
 * que criar uma nova classe no meu projeto Java e colocar 
 * toda linha de códigos que estavam presentes na figura 2.1
 * para por fim selecionar a opção Run.
 */



/* 
 * Resposta da Questão 4:
 * 
 * public class Welcome1 
{
	public static void main( String[] args )
	{
		System.out.print( "Bem vindo " );
		System.out.println( "Rafael Moraes 20211Y6RC0255" );
		System.out.println( "!Saudações!" );
	} 
}
 */



/*
 * Resposta da Questão 5:
 * 
 *  public class Welcome1 
{
	public static void main( String[] args )
	{
		 //usando o tipo String para adicionar as messagens
		 String message = "Bem vindo Rafael Moraes 20211Y6-RC0255\n!Saudações!";
		 System.out.println(message); //retornando a String "message"
	} 
}
 */



/*
 * Resposta da Questão 6:
 * 
 * public class Welcome1 
{
	public static void main( String[] args )
	{
		 //usando o \n para que ele pule para linha abaixo;
		 String message = "Bem\nvindo\nRafael\nMoraes\n20211Y6-RC0255\n!Saudações!";
		 System.out.println(message);
	} 
}
 */



/*
 * Reposta da Questão 7:
 * 
 * public class Welcome1 
{
	public static void main( String[] args )
	{
		 String message = "Bem vindo! Rafael Moraes / 20211Y6-RC0255 !Saudações!";
	     message = message.replaceAll(" ", "\n\t");
	     System.out.println("\t" + message);
	} 
}
 */



/*
 * Resposta da Questão 8:
 * 
 * public class Welcome1 
{
	public static void main( String[] args )
	{
		//Usando a tabulação "\t":
		String message = "Bem vindo! \"Rafael Moraes\" 20211Y6-RC0255 !Saudações!";
        message = message.replaceAll(" ", "\n\t");
        System.out.println("\t" + message);
	}
}
 */



/*
 * Logo abaixo vem a resposta da Questão 9
 * e o resultado de como ficou todas as alterações 
 * feita no código:
 */

// Resposta da Questão 9:
public class Welcome1 
{
	public static void main( String[] args )
	{
		//4 variáveis String;
		String meuNome = "Rafael Moraes";
        String minhaMatricula = "20211Y6-RC0255";
        String dataHora = "22/04/2023 01:32";
        String text = "Sou eclético, mas vai uma música clássica para resolver a lista";
        
        //4 System.out.printf para formartar a saída de texto;
        System.out.printf("Nome: %s\n", meuNome); //usei %s como formato para variáveis do tipo String.
        System.out.printf("Matrícula: %s\n", minhaMatricula);
        System.out.printf("Data/Hora: %s\n", dataHora);
        System.out.printf("Genero de musica: %s\n", text);
	} 
}
