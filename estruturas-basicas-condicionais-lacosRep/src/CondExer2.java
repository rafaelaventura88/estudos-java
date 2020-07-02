import java.util.Scanner;

public class CondExer2 {
/* Escreva um programa que recebe um número inteiro e informa se ele é par ou
ímpar. */
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int numeroDigitado = scn.nextInt();
		
		if(numeroDigitado  % 2 == 0 ) {
			System.out.println("O número é par");
		}
		else if(numeroDigitado % 2 == 1) {
			System.out.println(" O número é impar");
			
		}
		else {
			System.out.println("O número não é um inteiro");//nao funcionou double
		}
		
		
	}
	
	
}
