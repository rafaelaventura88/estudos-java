import java.util.Scanner;

public class BasicExer4 {
  /*Escreva um programa que recebe o endere�o do usu�rio, seu nome, o produto
	que est� sendo comprado e a quantidade. Depois o programa deve exibir uma
	mensagem de confirma��o do tipo �Caro [NOME], a solicita��o de entrega de
	[QUANTIDADE] [PRODUTO] no endere�o [ENDERECO] foi realizada com
	sucesso�*/
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Digite a quantidade comprada:");
		int quantidade = scn.nextInt();	
		
		System.out.println("Digite seu nome:");
		String nome = scn.next();
		System.out.println("teste" + nome);
				
		System.out.println("Digite o produto comprado:");
		// porque n�o consigo digitar produto? pq esta printando e passando para a linha do endere�o direto?
		// erro por causa do scanner
		String produto = scn.next();
		
		
		System.out.println("Digite seu endere�o:");
		String endereco = scn.next();
		
		
			
		System.out.println("Processando a opera��o...");
				
		System.out.println ("Caro(a) " + nome + ", a solicita��o de entrega de " + quantidade + " " + produto + " no endere�o " + endereco + " foi realizada com sucesso! ");
		
	}
	
	
}
