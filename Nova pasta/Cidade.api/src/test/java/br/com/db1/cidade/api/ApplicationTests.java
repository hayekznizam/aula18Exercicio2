package br.com.db1.cidade.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.cidade.api. model.Cidade;
import br.com.db1.cidade.api. model.Uf;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		Cidade cidade = new Cidade("Curitiba", Uf.PR);
	}
	
}
