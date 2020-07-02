import java.util.Scanner;

public class BasicExer1 {
//Escreva um programa que leia um tempo em meses e retorne essa quantidade em anos.
	
	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de meses: ");
		Scanner scn = new Scanner (System.in);
		int qtdMeses = scn.nextInt();
		double qtdAnos = 12;
		System.out.println("Essa quantidade de meses é igual ao lapso temporal de: " + conversaoParaAnos(qtdMeses, qtdAnos) + " anos.");

				
	}
	
	
	public static double conversaoParaAnos(int meses, double anos) {
		
		double qtdAnos = meses / anos; 		
		return qtdAnos;
	}
	
}
