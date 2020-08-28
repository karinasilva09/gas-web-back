package br.com.gasWeb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idgrupos")
	private Long id;
	
	@Column(name="idEmpresaControlada")
	private Long idEmpresaControlada;
	
	@Column(name="nomeGrupo")
	private String nomeGrupo;
	
	@Column(name="dataCadastro")
	private String dataCadastro;
	
	@Column(name="dataAlteracao")
	private String dataAlteracao;

	public Long getIdEmpresaControlada() {
		return idEmpresaControlada;
	}

	public void setIdEmpresaControlada(Long idEmpresaControlada) {
		this.idEmpresaControlada = idEmpresaControlada;
	}

	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Long getId() {
		return id;
	}
}
