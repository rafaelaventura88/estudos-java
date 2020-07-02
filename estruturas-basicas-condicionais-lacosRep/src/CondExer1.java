import java.util.Scanner;

public class CondExer1 {
	/*Escreva um programa que recebe um valor entre 0 e 100 e exibe “valor baixo”
	caso o número digitado pelo usuário esteja entre 0 e 30, “valor mediano” caso
	esteja entre 31 e 70 e “valor alto” caso esteja entre 71 e 100.*/
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite um valor:");
		double valorDigitado = scn.nextDouble();		
		
		
		if(valorDigitado >=0 && valorDigitado <=30) {
			System.out.println("valor baixo");
		}
		
		else if(valorDigitado >= 31 && valorDigitado<=70) {
			System.out.println("valor mediano");
		}
		else {
			System.out.println("valor alto");
		}
		//para fazer um tratamento a mais se pessoa digitar outro numero diverso de 100 
		//posso fazer else if e proibir numero diferente de 100
		//else tem que ser a última opção
		
		
		}
}
	
