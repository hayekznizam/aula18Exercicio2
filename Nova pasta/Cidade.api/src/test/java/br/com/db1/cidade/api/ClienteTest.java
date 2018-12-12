package br.com.db1.cidade.api;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.cidade.api.model.Cliente;
import br.com.db1.cidade.api.model.TratamentoNome;


public class ClienteTest {
	
	@Test
	public void deveRetornarNomeMaiusculo() {
		Cliente cliente = new Cliente("Vinicius Andrei");
		String nomeMaiusculo = cliente.trataNome(TratamentoNome.UPPERCASE);
		Assert.assertEquals("VINICIUS ANDREI", nomeMaiusculo);
	}

	@Test
	public void deveRetornarNomeMinusculo() {
		Cliente cliente = new Cliente("VINICIUS ANDREI");
		String nomeMinusculo= cliente.trataNome(TratamentoNome.LOWERCASE);
		Assert.assertEquals("vinicius andrei", nomeMinusculo);
	}
	
	@Test
	public void deveRetornarQuatroPrimeirasLetras() {
		Cliente cliente = new Cliente ("VINICIUS ANDREI");
		String nomeQuatroLetras= cliente.trataNome(TratamentoNome.QUATRO_PRIMEIRAS_LETRAS);
		Assert.assertEquals("VINI",nomeQuatroLetras);
	}
}
