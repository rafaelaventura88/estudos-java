package locadora;

public class OperadorCaixa {
	private String nome;
	private Double comissao;
	
	
	public OperadorCaixa(String nome, Double comissao) {
		
		this.nome = nome;
		this.comissao = comissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao += comissao;
	}
	
	

}
