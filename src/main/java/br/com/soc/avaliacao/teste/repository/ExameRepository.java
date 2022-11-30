package br.com.soc.avaliacao.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.soc.avaliacao.teste.model.Exame;
import br.com.soc.avaliacao.teste.model.StatusExame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

	List<Exame> findByStatus(StatusExame status);
	
}
