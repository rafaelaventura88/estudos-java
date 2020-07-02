import java.util.Random;
import java.util.Scanner;

public class jogoForca {
	
	static String forca [] = {"uva", "abacate", "tangerina"} ;
	static int numAleatorio = (int)(Math.random()*3)+0;
	static String palavraSorteada = forca[numAleatorio];
	
	static int indicePlayer = 0;
	static int numeroVidas = 6;
	
	
	// variaveis globais vem antes da main
	
	public static void main(String[] args) {
	
		inicializarJogo();
		
		
	
	}
	
		
	
	public static void inicializarJogo() {
		

		
		
		if (numAleatorio == 0) {
			System.out.println("É uma fruta que começa com a letra U e tem :"+ palavraSorteada.length() + " de caracteres");
		}
		if (numAleatorio == 1) {
			System.out.println("É uma fruta que começa com a letra A e tem :"+ palavraSorteada.length() + " de caracteres");
		}
		if (numAleatorio == 2) {
			System.out.println("É uma fruta que começa com a letra T e tem :"+ palavraSorteada.length() + " de caracteres");
		}
		
		usuarioDigitando();
		//System.out.println(palavraSorteada);
	}
		
		
	public static void usuarioDigitando() {
		
		if (indicePlayer == palavraSorteada.length()){
			System.out.println(" Parabés!! Você acertou");
			numAleatorio = (int)(Math.random()*3)+0;
			palavraSorteada = forca[numAleatorio];
			indicePlayer = 0;
			numeroVidas = 6;
			inicializarJogo();
		}/// falta dar um fim ao jogo, quando as palavras forem digitas corretamente
	 

		Scanner scn = new Scanner (System.in);
		System.out.println("Digite uma letra, para a posição "+ (indicePlayer+1)+ ": " );
		
		char letraDigitada = scn.next().charAt(0);
			
		if (letraDigitada == palavraSorteada.charAt(indicePlayer)) {
			System.out.println(" Você acertou!");
			indicePlayer++; 
			usuarioDigitando();
						
		}
		else {
			System.out.println("Você errou!");
			numeroVidas--;
			desenharBoneco();
			usuarioDigitando();
		}
	}
	
	public static void desenharBoneco() {
		System.out.println(" Te restam " + numeroVidas + "vidas. ");
		
		if (numeroVidas == 6) {
			System.out.println("O");
		}
		else if(numeroVidas == 5) {
			System.out.println("O");
			System.out.println("I");
		}
		else if(numeroVidas == 4) {
			System.out.println("O");
			System.out.println("--I");
		}
		else if(numeroVidas == 3) {
			System.out.println("O");
			System.out.println("--I--");
		}
		else if(numeroVidas == 2) {
			System.out.println("O");
			System.out.println("--I--");
			System.out.println("J");
		}
		else if(numeroVidas == 1) {
			System.out.println("O");
			System.out.println("--I--");
			System.out.println("JL");
		
		}
		else {
			System.out.println("Perdeu otário!");
			numAleatorio = (int)(Math.random()*3)+0;
			palavraSorteada = forca[numAleatorio];
			indicePlayer = 0;
			numeroVidas = 6;
			inicializarJogo();
			 
		}
		
	}
	
}
	


