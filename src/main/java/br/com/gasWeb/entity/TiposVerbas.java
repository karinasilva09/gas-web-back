package br.com.gasWeb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="verbas")
public class TiposVerbas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idVerba")
	private Long id;
	
	@Column(name="idEmpresaControlada")
	private Long idEmpresaControlada;
	
	@Column(name="idEmpresaRepasse")
	private Long idEmpresaRepasse;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="percentRepasse")
	private Float percentRepasse;
	
	@Column(name="informeRend")
	private String informeRend;
	
	@Column(name="tipoVerba")
	private String tipoVerba;
	
	@Column(name="dataCadastro")
	private Date dataCadastro;
	
	@Column(name="dataAlteracao")
	private Date dataAlteracao;
	
	@Column(name="planoSaudeSN")
	private Date planoSaudeSN;
	
	@Column(name="planoSaudeSN_2")
	private Date planoSaudeSN_2;
	
	@Column(name="idVerbaCopart")
	private Date idVerbaCopart;

	public Long getIdEmpresaControlada() {
		return idEmpresaControlada;
	}

	public void setIdEmpresaControlada(Long idEmpresaControlada) {
		this.idEmpresaControlada = idEmpresaControlada;
	}

	public Long getIdEmpresaRepasse() {
		return idEmpresaRepasse;
	}

	public void setIdEmpresaRepasse(Long idEmpresaRepasse) {
		this.idEmpresaRepasse = idEmpresaRepasse;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPercentRepasse() {
		return percentRepasse;
	}

	public void setPercentRepasse(Float percentRepasse) {
		this.percentRepasse = percentRepasse;
	}

	public String getInformeRend() {
		return informeRend;
	}

	public void setInformeRend(String informeRend) {
		this.informeRend = informeRend;
	}

	public String getTipoVerba() {
		return tipoVerba;
	}

	public void setTipoVerba(String tipoVerba) {
		this.tipoVerba = tipoVerba;
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

	public Date getPlanoSaudeSN() {
		return planoSaudeSN;
	}

	public void setPlanoSaudeSN(Date planoSaudeSN) {
		this.planoSaudeSN = planoSaudeSN;
	}

	public Date getPlanoSaudeSN_2() {
		return planoSaudeSN_2;
	}

	public void setPlanoSaudeSN_2(Date planoSaudeSN_2) {
		this.planoSaudeSN_2 = planoSaudeSN_2;
	}

	public Date getIdVerbaCopart() {
		return idVerbaCopart;
	}

	public void setIdVerbaCopart(Date idVerbaCopart) {
		this.idVerbaCopart = idVerbaCopart;
	}

	public Long getId() {
		return id;
	}
}
