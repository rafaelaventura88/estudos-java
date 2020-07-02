package locadora;

import java.util.ArrayList;

//No��es de encapsulamento
public class Cliente {
	private String nome;//azul atributo
	private double creditos;
	private double debitos;
	private ArrayList<Video> videosAlugados = new ArrayList<Video>();

	public Cliente(String nome) {//marrom par�metro
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
	
	// esse cr�dito que ele tinha antes (azul) += ao cr�dito que ele acaba de receber (marrom).
	public void somaCreditos(double creditos) {
		this.creditos += creditos;
	}
	
	public void diminuiCreditos(double creditos) {
		this.creditos -= creditos;
	}

	public double getDebitos() {
		return debitos;
	}
	
	// esse d�bito que ele tinha antes (azul) += ao d�bito que ele acaba de criar (marrom).
	public void somaDebitos(double debitos) {
		this.debitos += debitos;
	}
	public void diminuiDebitos(double debitos) {
		this.debitos -= debitos;
	}

	public ArrayList<Video> getVideosAlugados() {// retorna n�mero da mem�ria
		return videosAlugados;
	}
	
	public void imprimirVideosAlugados () {
		for (Video video : videosAlugados) {
			video.toString();// toString � um m�todo de retorno ele n�o tem print dentro
			System.out.println(video.toString());
		}
	}
	
	public void adicionarVideo (String nome, double valor, boolean disponivel) {//quando n�o tenho de onde tirar vari�veis, digito os par�metros
		videosAlugados.add(new Video(nome, valor, disponivel));
	}
	public void fecharConta() {
		Double soma = 0.0;
		for (Video video :videosAlugados) {
			soma += video.getPreco();
			}
		System.out.println("Total da conta R$:" + soma);
		
		}
	

	// para sobrescrever o n�mero da mem�ria em string automaticamente quando printar
	@Override
	public String toString() {
			
		String retorno;
		retorno = nome + " V�deos alugados: "+ videosAlugados + "Cr�ditos R$ "+ creditos + "D�bitos R$ "+ debitos ;
		return retorno;
	}
	
	
}
