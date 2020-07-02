package assessemtEzequielPOO;

import java.util.ArrayList;

public class ListaCarros {
	
	ArrayList<Carro> listaCarros = new ArrayList<>();// o atributo é o que fica em azul, aqui é uma lista de objeto tipo Carro.
	
	ArrayList<Double> listaMedias = new ArrayList<>();
	
	
	
	public void adicionarCarro (String modelo, double custoCompra, double custoImpostos, double consumoMedio, double seguro) {
		listaCarros.add(new Carro(modelo, custoCompra, custoImpostos, consumoMedio, seguro));//lista.adicionarCarro("fox", 30000, 2000, 11.8, 2000);
	}
	
	
	
	
	public  void imprimirListaCarros() {
		for (Carro carro : listaCarros) {
			System.out.println(carro.modelo+ " tem o consumo médio de R$"+ carro.calculoCusto()+ " ");
		}
	}
	
		
	
	
	public void preencherListaMedias() {
		
		for (Carro carro : listaCarros) {
				listaMedias.add(carro.calculoCusto());
		}
		
	}
	
	
	
	
	public double menorMedia() {
		double menorMedia =  listaMedias.get(0);
		for (Double medias : listaMedias) {
			if(medias< menorMedia) {
				menorMedia=medias;
			}
		}
		return menorMedia;
		
}
}
