package br.com.db1.cidade.api.model;

public class Calculadora {
	
	private Double num1,num2;
	
	
	public Calculadora(Double num1,Double num2) {
		this.num1 = num1;
		this.num2=num2;
	}
	
	

	public Double realizaCalculo(Operacao realizaCalculo) {
		return realizaCalculo.realizaCalculo(this.num1,this.num2);
	}
}
