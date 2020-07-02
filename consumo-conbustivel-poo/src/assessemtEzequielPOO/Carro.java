package assessemtEzequielPOO;

import java.util.ArrayList;



public class Carro {
	
	String modelo;
	double custoCompra;
	double custoImpostos;
	double consumoMedio;
	double seguro;
	
	public Carro(String modelo, double custoCompra, double custoImpostos, double consumoMedio, double seguro) {
		
		this.modelo = modelo;
		this.custoCompra = custoCompra;
		this.custoImpostos = custoImpostos;
		this.consumoMedio = consumoMedio;
		this.seguro = seguro;
	}
	
	public double calculoCusto() {
		double soma= 0.0;
		soma += custoCompra+custoImpostos+seguro;
		soma += 10000/consumoMedio*4.98;
		return soma;
	}
}
