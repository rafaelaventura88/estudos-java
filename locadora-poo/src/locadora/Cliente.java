package locadora;

import java.util.ArrayList;

//Noções de encapsulamento
public class Cliente {
	private String nome;//azul atributo
	private double creditos;
	private double debitos;
	private ArrayList<Video> videosAlugados = new ArrayList<Video>();

	public Cliente(String nome) {//marrom parâmetro
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCreditos() {
		return creditos;
	}
	
	// esse crédito que ele tinha antes (azul) += ao crédito que ele acaba de receber (marrom).
	public void somaCreditos(double creditos) {
		this.creditos += creditos;
	}
	
	public void diminuiCreditos(double creditos) {
		this.creditos -= creditos;
	}

	public double getDebitos() {
		return debitos;
	}
	
	// esse débito que ele tinha antes (azul) += ao débito que ele acaba de criar (marrom).
	public void somaDebitos(double debitos) {
		this.debitos += debitos;
	}
	public void diminuiDebitos(double debitos) {
		this.debitos -= debitos;
	}

	public ArrayList<Video> getVideosAlugados() {// retorna número da memória
		return videosAlugados;
	}
	
	public void imprimirVideosAlugados () {
		for (Video video : videosAlugados) {
			video.toString();// toString é um método de retorno ele não tem print dentro
			System.out.println(video.toString());
		}
	}
	
	public void adicionarVideo (String nome, double valor, boolean disponivel) {//quando não tenho de onde tirar variáveis, digito os parâmetros
		videosAlugados.add(new Video(nome, valor, disponivel));
	}
	public void fecharConta() {
		Double soma = 0.0;
		for (Video video :videosAlugados) {
			soma += video.getPreco();
			}
		System.out.println("Total da conta R$:" + soma);
		
		}
	

	// para sobrescrever o número da memória em string automaticamente quando printar
	@Override
	public String toString() {
			
		String retorno;
		retorno = nome + " Vídeos alugados: "+ videosAlugados + "Créditos R$ "+ creditos + "Débitos R$ "+ debitos ;
		return retorno;
	}
	
	
}
