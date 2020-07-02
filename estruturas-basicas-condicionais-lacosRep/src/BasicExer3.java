import java.util.Scanner;

public class BasicExer3 {
//Escreva um programa que recebe os lados de um retângulo e retorna sua área e seu perímetro.
//Considerando a fórmula, perimetro = 2 * (base + altura)
//FALTOU FAZER A ÁREA
	
	public static void main(String[] args) {
		System.out.println("Digite o valor da base do retângulo: ");
		Scanner scn = new Scanner(System.in);
		double baseRetangulo = scn.nextDouble();
		
		System.out.println("Digite o valor da altura do retângulo: ");
		double alturaRetangulo = scn.nextDouble();
		
		System.out.println("O perimetro é: " + perimetroRetangulo(baseRetangulo, alturaRetangulo));
	}
	
	public static double perimetroRetangulo (double base, double altura) {
		
		double perimetro = 2* (base + altura);
		return perimetro;
	}
	
}
