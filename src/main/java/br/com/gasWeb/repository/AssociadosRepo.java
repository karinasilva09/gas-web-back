package br.com.gasWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.gasWeb.entity.Associados;

@Repository
public interface AssociadosRepo extends JpaRepository<Associados, Long>{
	
	@Query("SELECT a FROM associado a WHERE idAssociadoPrincipal = :principal")
	List<Associados> findAssociadoByAssociadoPrincipal(@Param("principal") Long idAssociadoPrincipal);

}
