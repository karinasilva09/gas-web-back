package br.com.gasWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gasWeb.entity.Associados;
import br.com.gasWeb.entity.Grupos;
import br.com.gasWeb.entity.Situacoes;
import br.com.gasWeb.repository.AssociadosRepo;
import br.com.gasWeb.repository.GruposRepo;
import br.com.gasWeb.repository.SituacoesRepo;

@Service
public class AssociadosService{
	
	@Autowired
	private AssociadosRepo associadoRepo;
	
	@Autowired
	private SituacoesRepo situacoesRepo;
	
	@Autowired
	private GruposRepo gruposRepo;
	
	public List<Associados> findAll() {
		return associadoRepo.findAll();
	}
	
	public Optional<Associados> getById(Long id) {
		return associadoRepo.findById(id);
	}
	
	public List<Situacoes> findAllSituacoes() {
		return situacoesRepo.findAll();
	}
	
	public Optional<Situacoes> findSituacoesById(Long id) {
		return situacoesRepo.findById(id);
	}
	
	public List<Grupos> findAllGrupos() {
		return gruposRepo.findAll();
	}
	
	public Optional<Grupos> findGrupoById(Long id) {
		return gruposRepo.findById(id);
	}
	
	public List<Associados> getAssociadoDependente(Long id) {
		return associadoRepo.findAssociadoByAssociadoPrincipal(id);
	}
}
