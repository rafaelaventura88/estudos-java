import java.util.Scanner;

public class CondExer3 {
	/*Para doar sangue é necessário ter entre 18 e 69 anos. Escreva um programa
	que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.*/

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = scn.nextInt();
		
		if(idade >= 18 & idade <= 69) {
			System.out.println("Você pode doar sangue");
		}
		
		else {
			System.out.println("Você não pode doar sangue");
		}
		
	}
	
	
	
}
