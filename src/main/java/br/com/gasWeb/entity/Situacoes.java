package br.com.gasWeb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Situacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsituacoes")
	private Long id;
	
	@Column(name="idEmpresaControlada")
	private Long idEmpresaControlada;
	
	private String descricao;
	
	@Column(name="dataCadastro")
	private Date dataCadastro;
	
	@Column(name="dataAlteracao")
	private Date dataAlteracao;
	
	@Column(name="idUsuarioCad")
	private Long idUsuarioCad;

	public Long getIdEmpresaControlada() {
		return idEmpresaControlada;
	}

	public void setIdEmpresaControlada(Long idEmpresaControlada) {
		this.idEmpresaControlada = idEmpresaControlada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Long getIdUsuarioCad() {
		return idUsuarioCad;
	}

	public void setIdUsuarioCad(Long idUsuarioCad) {
		this.idUsuarioCad = idUsuarioCad;
	}

	public Long getId() {
		return id;
	}
}
