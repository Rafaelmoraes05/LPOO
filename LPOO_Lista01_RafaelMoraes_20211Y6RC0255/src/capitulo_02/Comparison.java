package capitulo_02;

/*
 * Resposta da Questão 13:
 * 
 * Este é um programa em Java que compara dois valores inteiros fornecidos
 * pelo usuário usando declarações if e operadores relacionais. O programa 
 * solicita que o usuário insira dois números inteiros e, em seguida, os 
 * compara usando seis declarações if.
 */

/*
 * Resposta da Questão 14:
 * 
 * import java.util.Scanner;
public class Comparison {
	 public static void main( String[] args )
	 {
	 // cria Scanner para obter entrada da janela de comando
	 Scanner input = new Scanner( System.in );
	
	 int number1; // primeiro número a comparar
	 int number2; // segundo número a comparar
	
	 System.out.print( "Insira o primeiro número: " ); // prompt
	 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
	
	 System.out.print( "Insira o segundo número: " ); // prompt
	 number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
	
	 if ( number1 == number2 )
	 System.out.printf( "%d == %d\n", number1, number2 );
	
	 if ( number1 != number2 )
	 System.out.printf( "%d != %d\n", number1, number2 );
	
	 if ( number1 < number2 )
	 System.out.printf( "%d < %d\n", number1, number2 );
	
	 if ( number1 > number2 )
	 System.out.printf( "%d > %d\n", number1, number2 );
	
	 if ( number1 <= number2 )
	 System.out.printf( "%d <= %d\n", number1, number2 );
	
	 if ( number1 >= number2 )
	 System.out.printf( "%d >= %d\n", number1, number2 );
	
	 int sum = number1 + number2;
	 int subtraction = number1 - number2;
	 int multiplication = number1 * number2;
	 double division = (double) number1 / number2;
	 int remainder = number1 % number2;
	 System.out.printf("A soma de %d e %d = %d\n", number1, number2, sum);
	 System.out.printf("A subtração de %d e %d = %d\n", number1, number2, subtraction);
	 System.out.printf("A multiplicação de %d e %d = %d\n", number1, number2, multiplication);
	 System.out.printf("A divisão de %d por %d = %.2f\n", number1, number2, division);
	 System.out.printf("O resto da divisão entre %d e %d = %d\n", number1, number2, remainder);
	 } 
}
 * 
 */


/*
 * Resposta da Questão 15 
 * 
 * Se o usuário digitar letras ao invés de números, ao tentar converter as
 * entradas para inteiros usando o método nextInt() do objeto Scanner, uma
 * exceção do tipo InputMismatchException será lançada. Essa exceção ocorre 
 * quando o tipo de dado fornecido pelo usuário é incompatível com o tipo 
 * esperado pelo programa.
 */

/*
 * Resposta da Questão 16
 * (Erro anexado no PDF) 
 * Se um dos valores de entrada for zero, ocorrerá um erro na operação de 
 * divisão, pois não é possível dividir um número por zero. Isso resultará 
 * em uma exceção do tipo ArithmeticException.
 */

import java.util.Scanner;

public class Comparison {

    public static void main( String[] args )
    {
        // cria Scanner para obter entrada da janela de comando
        Scanner input = new Scanner( System.in );

        int number1; 
        int number2; 

        System.out.print( "Insira o primeiro número: " ); 
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print( "Insira o segundo número: " ); 
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        if (number1 == 0 || number2 == 0) {
            System.out.println("Erro: não é possível dividir por zero. Forneça valores diferentes de zero.");
        } else {
            if ( number1 == number2 )
                System.out.printf( "%d == %d\n", number1, number2 );

            if ( number1 != number2 )
                System.out.printf( "%d != %d\n", number1, number2 );

            if ( number1 < number2 )
                System.out.printf( "%d < %d\n", number1, number2 );

            if ( number1 > number2 )
                System.out.printf( "%d > %d\n", number1, number2 );

            if ( number1 <= number2 )
                System.out.printf( "%d <= %d\n", number1, number2 );

            if ( number1 >= number2 )
                System.out.printf( "%d >= %d\n", number1, number2 );

            System.out.printf( "Soma de %d e %d = %d\n", number1, number2, (number1 + number2) );
            System.out.printf( "Subtração de %d e %d = %d\n", number1, number2, (number1 - number2) );
            System.out.printf( "Multiplicação de %d e %d = %d\n", number1, number2, (number1 * number2) );

            if (number1 != 0 && number2 != 0) {
                System.out.printf( "Divisão de %d e %d = %d\n", number1, number2, (number1 / number2) );
                System.out.printf( "Resto da divisão entre %d %% %d = %d\n", number1, number2, (number1 % number2) );
            }
        }
    } 
}
