import java.util.Scanner;

public class BasicExer3 {
//Escreva um programa que recebe os lados de um ret�ngulo e retorna sua �rea e seu per�metro.
//Considerando a f�rmula, perimetro = 2 * (base + altura)
//FALTOU FAZER A �REA
	
	public static void main(String[] args) {
		System.out.println("Digite o valor da base do ret�ngulo: ");
		Scanner scn = new Scanner(System.in);
		double baseRetangulo = scn.nextDouble();
		
		System.out.println("Digite o valor da altura do ret�ngulo: ");
		double alturaRetangulo = scn.nextDouble();
		
		System.out.println("O perimetro �: " + perimetroRetangulo(baseRetangulo, alturaRetangulo));
	}
	
	public static double perimetroRetangulo (double base, double altura) {
		
		double perimetro = 2* (base + altura);
		return perimetro;
	}
	
}
