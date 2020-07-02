import java.util.Scanner;

public class CondExer5 {
	/*Escreva um programa que recebe um valor de DDI e informa o nome do país
correspondente. Considere Estados Unidos (1), Alemanha (49), Argentina (54),
Brasil (55) e Portugal (35). O programa deve informar também se o usuário
entrar com um DDI não cadastrado ou não válido. Utilize o comando case.*/
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o DDI:");
		int numeroDigitado = scn.nextInt();
		System.out.println(pais(numeroDigitado));
	}

	
	public static String pais (int numeroDdi) {
		
		String resultado;
	
		
		switch(numeroDdi) {
		
		case 1:
			resultado = "Estados Unidos";
			break;
		
		case 49:
			resultado = "Alemanha";
			break;
		
		case 54:
			resultado = "Argentina";
			break;
			
		case 55:
			resultado = "Brasil";
			break;
			
		case 35:
			resultado = "Portugal";
			break;
			
		default:
			resultado = " DDI não cadastrado ou não válido";
			break;
		}
		
		return resultado;
				
	}
}

