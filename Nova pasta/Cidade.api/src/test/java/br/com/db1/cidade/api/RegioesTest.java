package br.com.db1.cidade.api;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.cidade.api.model.Regioes;
import br.com.db1.cidade.api.model.Uf;
 




public class RegioesTest {

	
	@Test
	public void deveRetornarEstadosDoSul() {
		Uf[] ufs = Regioes.SUL.getUfs();
		Assert.assertArrayEquals(new Uf[] {Uf.PR,Uf.SC},ufs);
		
	}
}
