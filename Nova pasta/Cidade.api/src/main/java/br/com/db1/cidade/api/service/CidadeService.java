package br.com.db1.cidade.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.cidade.api.model.Cidade;
import br.com.db1.cidade.api.model.Uf;
import br.com.db1.cidade.api.repository.CidadeRepository;


@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public Cidade salvaCidade(String nome, Uf uf) {
		Cidade cidade = new Cidade(nome, uf);
		cidadeRepository.save(cidade);
		return cidade;
		
	}

}
