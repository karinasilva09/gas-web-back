package br.com.gasWeb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gasWeb.entity.Associados;
import br.com.gasWeb.entity.Grupos;
import br.com.gasWeb.entity.Situacoes;
import br.com.gasWeb.service.AssociadosService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/api/associados")
public class AssociadosController {
	
	@Autowired
	private AssociadosService associadosService;
	
	@GetMapping
	public List<Associados> findAll() {
		return associadosService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Associados> findById(@PathVariable(value = "id") long id) {
		return associadosService.getById(id);
	}
	
	@GetMapping(value = "/situacoes")
	public List<Situacoes> findAllSituacoes() {
		return associadosService.findAllSituacoes();
	}
	
	@GetMapping(value = "/situacao/{id}")
	public Optional<Situacoes> findSituacaoById(@PathVariable(value = "id") long id) {
		return associadosService.findSituacoesById(id);
	}
	
	@GetMapping(value = "/grupos")
	public List<Grupos> findAllGrupos() {
		return associadosService.findAllGrupos();
	}
	
	@GetMapping(value = "/grupo/{id}")
	public Optional<Grupos> findGrupoById(@PathVariable(value = "id") long id) {
		return associadosService.findGrupoById(id);
	}
}
