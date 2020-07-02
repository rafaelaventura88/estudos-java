package assessemtEzequielPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface_Ass {

	static int navegador;
	static ListaCarros listaCarros = new ListaCarros();
	
	
	public static void main(String[]args) {
		preencherListaCarros();
	}
	
		
	public static void preencherListaCarros() {
		String modelo;
		double custoCompra;
		double custoImpostos;
		double consumoMedio;
		double seguro;
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Quantos carros você quer consultar o consumo?");
		int qtdCarros = scn.nextInt();
		
		for (int i = 0; i < qtdCarros; i++) {
			System.out.println("Digite: nome do carro, custoCompra, custoImpostos, consumoMedio, seguro:");
			modelo = scn.next();
			custoCompra = scn.nextDouble();
			custoImpostos = scn.nextDouble();
			consumoMedio = scn.nextDouble();
			seguro = scn.nextDouble();
			
			listaCarros.adicionarCarro(modelo, custoCompra, custoImpostos, consumoMedio, seguro);
		}
		
		finalizacao();
		}
	
	
		
	public static void finalizacao () {
		
		listaCarros.imprimirListaCarros();
		listaCarros.preencherListaMedias();
		listaCarros.menorMedia();
		System.out.println(listaCarros.menorMedia());
		}
	
	
	
	
	
}
