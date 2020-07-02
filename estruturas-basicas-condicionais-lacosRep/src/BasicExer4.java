import java.util.Scanner;

public class BasicExer4 {
  /*Escreva um programa que recebe o endereço do usuário, seu nome, o produto
	que está sendo comprado e a quantidade. Depois o programa deve exibir uma
	mensagem de confirmação do tipo “Caro [NOME], a solicitação de entrega de
	[QUANTIDADE] [PRODUTO] no endereço [ENDERECO] foi realizada com
	sucesso”*/
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Digite a quantidade comprada:");
		int quantidade = scn.nextInt();	
		
		System.out.println("Digite seu nome:");
		String nome = scn.next();
		System.out.println("teste" + nome);
				
		System.out.println("Digite o produto comprado:");
		// porque não consigo digitar produto? pq esta printando e passando para a linha do endereço direto?
		// erro por causa do scanner
		String produto = scn.next();
		
		
		System.out.println("Digite seu endereço:");
		String endereco = scn.next();
		
		
			
		System.out.println("Processando a operação...");
				
		System.out.println ("Caro(a) " + nome + ", a solicitação de entrega de " + quantidade + " " + produto + " no endereço " + endereco + " foi realizada com sucesso! ");
		
	}
	
	
}
