import java.util.Scanner;

public class CondExer4 {
	/*Escreva um programa que recebe um n�mero e informa se ele � positivo,
	negativo ou nulo.*/
		public static void main(String[] args) {
					
					Scanner scn = new Scanner (System.in);
					System.out.println("Digite um n�mero: ");
					int numeroDigitado = scn.nextInt();
					
					if(numeroDigitado  < 0 ) {
						System.out.println("O n�mero � negativo");
					}
					else if(numeroDigitado > 0) {
						System.out.println(" O n�mero � positivo");
						
					}
					else {
						System.out.println("O n�mero nulo");
					}
					
				
	}
}
