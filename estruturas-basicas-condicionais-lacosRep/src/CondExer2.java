import java.util.Scanner;

public class CondExer2 {
/* Escreva um programa que recebe um n�mero inteiro e informa se ele � par ou
�mpar. */
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		int numeroDigitado = scn.nextInt();
		
		if(numeroDigitado  % 2 == 0 ) {
			System.out.println("O n�mero � par");
		}
		else if(numeroDigitado % 2 == 1) {
			System.out.println(" O n�mero � impar");
			
		}
		else {
			System.out.println("O n�mero n�o � um inteiro");//nao funcionou double
		}
		
		
	}
	
	
}
