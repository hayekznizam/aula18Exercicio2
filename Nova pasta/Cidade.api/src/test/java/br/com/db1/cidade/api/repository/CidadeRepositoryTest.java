package br.com.db1.cidade.api.repository;

import org.aspectj.lang.annotation.AfterReturning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.cidade.api.model.Cidade;
import br.com.db1.cidade.api.model.Uf;
import org.junit.Assert;
import java.util.List;
import org.junit.After;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CidadeRepositoryTest {

	@Autowired
	private CidadeRepository cidadeRepository;

	@After
	public void after() {
		cidadeRepository.deleteAll();

	}

	@Test
	public void deveSalvarUmaNovaCidade() {
		Cidade cidade = new Cidade("Maringá", Uf.PR);
		cidadeRepository.save(cidade);
		List<Cidade> cidades = cidadeRepository.findAll();
		Assert.assertEquals(cidade.getNome(), cidades.get(0).getNome());
	}

}
