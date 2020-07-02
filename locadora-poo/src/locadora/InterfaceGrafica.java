package locadora;

import java.util.Scanner;

public class InterfaceGrafica {
	
	static Cliente cliente = new Cliente(null);
	static CatalogoVideo catalogoVideo = new CatalogoVideo();
	static OperadorCaixa operadorCaixa = new OperadorCaixa(null,0.0); 
	static int navegador;
	static boolean usuarioLogado = false;
	
	
	
	public static void main(String[] args) {
		loginOperadorVideos();

	}
	
	public static void loginOperadorVideos() {
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		operadorCaixa.setNome(scn.next());
		System.out.println("Quantos v�deos voc� quer digitar hoje?");
		int qtd = scn.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			
		System.out.println("Digite o nome do v�deo:");
		String nome = scn.next();
		System.out.println("Digite o valor do v�deo:");
		Double valor = scn.nextDouble();
		System.out.println("Digite se o v�deo esta dispon�vel ou alugado:");
		String status = scn.next();
		
		
		Boolean disponivel= true;
		do {
		if(status.equals("disponivel")){
			disponivel = true;
		}
		else if (status.equals("alugado")) {
			disponivel = false;
		}else {
			disponivel = null;
		}
		}while(disponivel == null);
		
		// se quero que execute independente da primeira condi��o, uso o do while (ou seja, o algoritmo s� vai checar se � nulo no final desse la�o)
					
		
		catalogoVideo.adicionarVideo(nome, valor, disponivel);
				
		}
		menuPrincipal();
	}
	
	public static void menuPrincipal() {
		Scanner scn = new Scanner(System.in);
		
		if(usuarioLogado == false) {
			System.out.println("Digite o nome do cliente:");
			cliente.setNome(scn.next());
			usuarioLogado = true;
		}
		
		System.out.println("Digite: 1- Para ver o catalogo; 2- Para alugar um filme; 3- Para fechar a conta;");
		navegador = scn.nextInt();
		
		switch (navegador) {
		case 1:
			catalogoVideo.imprimirCatalogo();
			menuPrincipal();
			break;
		case 2:
			alugarFilme();
			break;
		case 3:
			cliente.fecharConta();
			break;

		default:
			System.out.println("Op��o inv�lida. Digite novamente.");
			menuPrincipal();
			break;
		}
		
		
	}

	public static void alugarFilme() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Quantos filmes voc� quer alugar? ");
		int qtd = scn.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome do v�deo:");
			String nome = scn.next();
			Double valor= 0.0;
			Boolean disponivel = false;
			int encontrado = 0;// se for igual a zero digitar o tratamento
			int estaDisponivel = 0;
			
			for (Video video : catalogoVideo.getCatalogo()) {
				if(video.getTitulo().equals(nome)) {
					valor = video.getPreco();
					encontrado++;
				if(video.getDisponivel()== true) {
					estaDisponivel++;
					video.setDisponivel(false);
				}
				}
			}
			if(encontrado != 0 && estaDisponivel != 0 ) {
								
				cliente.adicionarVideo(nome, valor, disponivel);
			}else {
				System.out.println("Filme n�o foi encontrado ou esta indispon�vel.");
				i--;
			}
		}
		menuPrincipal();
	}
	
	
	}
	
//fechar a conta ok
// ir no cliente que tem uma sacola de compras ok
// percorrer essa sacola e fazer uma soma de pre�os ok
