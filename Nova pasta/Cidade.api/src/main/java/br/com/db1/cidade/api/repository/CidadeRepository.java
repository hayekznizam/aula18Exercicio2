package br.com.db1.cidade.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.cidade.api.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	

}
