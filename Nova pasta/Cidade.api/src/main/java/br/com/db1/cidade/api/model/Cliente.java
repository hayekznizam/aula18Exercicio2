package br.com.db1.cidade.api.model;

public class Cliente {
	
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String  returnNomeMaiusculo() {
		return this.nome.toUpperCase();
	}
	
	public String trataNome(TratamentoNome tratamentoNome) {
		return tratamentoNome.trataNome(this.nome);
		
	}
}
