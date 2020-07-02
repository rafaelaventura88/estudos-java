import java.util.Scanner;

public class CondExer4 {
	/*Escreva um programa que recebe um número e informa se ele é positivo,
	negativo ou nulo.*/
		public static void main(String[] args) {
					
					Scanner scn = new Scanner (System.in);
					System.out.println("Digite um número: ");
					int numeroDigitado = scn.nextInt();
					
					if(numeroDigitado  < 0 ) {
						System.out.println("O número é negativo");
					}
					else if(numeroDigitado > 0) {
						System.out.println(" O número é positivo");
						
					}
					else {
						System.out.println("O número nulo");
					}
					
				
	}
}
