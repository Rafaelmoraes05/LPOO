package capitulo_02;

/*
 * Respostas da Questão 2.3
 * 
 * a) int c;
 * 	  int thisIsAVariable;
 *    int q76354; 
 *    int number;
 * 
 * b)System.out.print( "Insira um número: " );
 * 
 * c) value = input.nextInt();
 * 
 * d) System.out.println( "This is a Java program" ); 
 * 
 * e) System.out.println( "This is a Java\nprogram" );
 * 
 * f) System.out.printf( "%s\n%s\n", "This is a Java", "program" );
 * 
 * g) if ( number != 7 )
 *    System.out.println( "The variable number is not equal to 7" )  
 */

/*
 * Respostas da Questão 2.4
 * 
 * a) O erro é o ponto e vírgula após a condição if ( c < 7 )
 * A solução é só remover esse ponto e vírgula.
 * 
 * b) O operador => é incorreto. 
 * A solução é alterar => para >=.
 */

/*
 * Respostas da Questão 2.5
 * 
 * a)// Calcula o produto de três inteiros
 * 
 * b) Scanner input = new Scanner( System.in );
 * 
 * c) int x;
 *    int y;
 *    int z;
 *    int resultado;
 * 
 * d) System.out.print( "Insira o primeiro número: " );
 * 
 * e) x = input.nextInt();
 * 
 * f) System.out.print( "Insira o segundo número: " );
 * 
 * g) y = input.nextInt();
 * 
 * h) System.out.print( "Insira o terceiro número: " );
 * 
 * i) z = input.nextInt();
 * 
 * j) resultado = x * y * z;
 * 
 * k) System.out.printf( "O produto é %d\n", result );
 */

/*
 * Resposta da Questão 2.6
 */
import java.util.Scanner;

public class Exercicios {
	public static void main( String[] args )
	 {
		
	 Scanner input = new Scanner( System.in );
	
	 int x; 
	 int y; 
	 int z; 
	 int resultado;
	
	 System.out.print( "Insira o primeiro número: " ); 
	 x = input.nextInt(); //lê o primeiro número
	
	 System.out.print( "Insira o segundo número: " ); 
	 y = input.nextInt(); //lê o segundo número
	
	 System.out.print( "Insira o terceiro número: " ); 
	 z = input.nextInt(); //lê o terceiro número
	
	 resultado = x * y * z; //calcula o produto dos números
	
	 System.out.printf( "O produto é %d, UHUU!!!", resultado );
	 }
}
