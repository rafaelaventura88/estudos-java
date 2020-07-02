import java.util.Scanner;

public class BasicExer2 {
//Escreva um programa que receba um valor e mostre o valor referente a 35% do valor inicial.
	
	public static void main(String[] args) {
		
	System.out.println(" Digite um valor: ");
	Scanner scn = new Scanner (System.in);
	double valorRecebido = scn.nextDouble();
	double taxa = 35;
	System.out.println("O valor referente a 35% de desconto é: R$ " + porcentagem(valorRecebido,taxa));
	
}
	
	public static double porcentagem (double valorCalculado, double porcentagem ) {
		double valorComPorcentagem = valorCalculado * porcentagem /100;
		return valorComPorcentagem;
	}
}
