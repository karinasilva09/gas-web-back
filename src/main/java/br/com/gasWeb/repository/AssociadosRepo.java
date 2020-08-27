package br.com.gasWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gasWeb.entity.Associados;

@Repository
public interface AssociadosRepo extends JpaRepository<Associados, Long>{

}
