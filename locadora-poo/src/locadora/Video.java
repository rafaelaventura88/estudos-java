package locadora;

public class Video {
	
	private String titulo;
	private double preco;
	private boolean disponivel;
	
	public Video(String titulo, double preco, boolean disponivel) {
		
		this.titulo = titulo;
		this.preco = preco;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean getDisponivel() { //pega o valor no atributo do Objeto
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {// muda/atualiza o valor no atributo do Objeto
		this.disponivel = disponivel;
	}
	
	
	// para sobrescrever o número da memória em string automaticamente quando printar
	@Override
	public String toString() {
		String disponivelFormatado;
		if(disponivel == true ) {
			disponivelFormatado = "Disponível";
		}else {
			disponivelFormatado = "Alugado";
		}
		
		String retorno;
		retorno = titulo + " "+ preco+ " " + disponivelFormatado ;
		return retorno;
	}
	

}
