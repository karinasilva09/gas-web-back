package br.com.gasWeb.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="associado")
public class Associados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAssociado")
	private Long id;

	@Column(name="idSituacoes")
	private Long idSituacoes;
	
	@Column(name="idEmpresaControlada")
	private Long idEmpresaControlada;
	
	@Column(name="idgrupos")
	private Long idGrupos;
	
	@Column(name="idAssociadoPrincipal")
	private Long idAssociadoPrincipal;
	
	@Column(name="idEmpresaAssociada")
	private Long idEmpresaAssociada;
	
	@Column(name="matriculaAssociado")
	private String matriculaAssociado;
	
	@Column(name="matriculaEmpresaAssociada")
	private String matriculaEmpresaAssociada;
	
	@Column(name="dataAdmissaoAssociacao")
	private Date dataAdmissaoAssociacao;
	
	@Column(name="dataAdmissaoEmpresa")
	private Date dataAdmissaoEmpresa;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="guerra")
	private String guerra;
	
	@Column(name="situacao")
	private String situacao;
	
	@Column(name="motivo")
	private String motivo;
	
	@Column(name="grauParentesco")
	private String grauParentesco;
	
	@Column(name="dataDesligamento")
	private String dataDesligamento;
	
	@Column(name="tel1")
	private String tel1;
	
	@Column(name="ramalTel1")
	private String ramalTel1;
	
	@Column(name="recadoTel1")
	private String recadoTel1;

	@Column(name="tel2")
	private String tel2;
	
	@Column(name="ramalTel2")
	private String ramalTel2;
	
	@Column(name="recadoTel2")
	private String recadoTel2;
	
	@Column(name="tel3")
	private String tel3;
	
	@Column(name="ramalTel3")
	private String ramalTel3;
	
	@Column(name="recadoTel3")
	private String recadoTel3;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="eMail")
	private String eMail;
	
	@Column(name="recebeNovidades")
	private int recebeNovidades;
	
	@Column(name="docCPF")
	private String docCPF;
	
	@Column(name="docIdentidade")
	private String docIdentidade;
	
	@Column(name="docOrgExp")
	private String docOrgExp;
	
	@Column(name="docDataExp")
	private Date docDataExp;
	
	@Column(name="docProfis")
	private String docProfis;
	
	@Column(name="docDataVencDocProfis")
	private Date docDataVencDocProfis;
	
	@Column(name="docAvisaVencCarta")
	private Boolean docAvisaVencCarta;
	
	@Column(name="docAvisaVencEmail")
	private Boolean docAvisaVencEmail;
	
	@Column(name="tipoSang")
	private String tipoSang;
	
	@Column(name="fatorRH")
	private String fatorRH;
	
	@Column(name="pai")
	private String pai;
	
	@Column(name="mae")
	private String mae;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(name="dataNascimento")
	private Date dataNascimento;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="dataCadastro")
	private Date dataCadastro;
	
	@Column(name="dataAlteracao")
	private Date dataAlteracao;
	
	@Column(name="primeiroLogin")
	private String primeiroLogin;

	public Long getIdSituacoes() {
		return idSituacoes;
	}

	public void setIdSituacoes(Long idSituacoes) {
		this.idSituacoes = idSituacoes;
	}

	public Long getIdEmpresaControlada() {
		return idEmpresaControlada;
	}

	public void setIdEmpresaControlada(Long idEmpresaControlada) {
		this.idEmpresaControlada = idEmpresaControlada;
	}

	public Long getIdGrupos() {
		return idGrupos;
	}

	public void setIdGrupos(Long idGrupos) {
		this.idGrupos = idGrupos;
	}

	public Long getIdAssociadoPrincipal() {
		return idAssociadoPrincipal;
	}

	public void setIdAssociadoPrincipal(Long idAssociadoPrincipal) {
		this.idAssociadoPrincipal = idAssociadoPrincipal;
	}

	public Long getIdEmpresaAssociada() {
		return idEmpresaAssociada;
	}

	public void setIdEmpresaAssociada(Long idEmpresaAssociada) {
		this.idEmpresaAssociada = idEmpresaAssociada;
	}

	public String getMatriculaAssociado() {
		return matriculaAssociado;
	}

	public void setMatriculaAssociado(String matriculaAssociado) {
		this.matriculaAssociado = matriculaAssociado;
	}

	public String getMatriculaEmpresaAssociada() {
		return matriculaEmpresaAssociada;
	}

	public void setMatriculaEmpresaAssociada(String matriculaEmpresaAssociada) {
		this.matriculaEmpresaAssociada = matriculaEmpresaAssociada;
	}

	public Date getDataAdmissaoAssociacao() {
		return dataAdmissaoAssociacao;
	}

	public void setDataAdmissaoAssociacao(Date dataAdmissaoAssociacao) {
		this.dataAdmissaoAssociacao = dataAdmissaoAssociacao;
	}

	public Date getDataAdmissaoEmpresa() {
		return dataAdmissaoEmpresa;
	}

	public void setDataAdmissaoEmpresa(Date dataAdmissaoEmpresa) {
		this.dataAdmissaoEmpresa = dataAdmissaoEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGuerra() {
		return guerra;
	}

	public void setGuerra(String guerra) {
		this.guerra = guerra;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getDataDesligamento() {
		return dataDesligamento;
	}

	public void setDataDesligamento(String dataDesligamento) {
		this.dataDesligamento = dataDesligamento;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getRamalTel1() {
		return ramalTel1;
	}

	public void setRamalTel1(String ramalTel1) {
		this.ramalTel1 = ramalTel1;
	}

	public String getRecadoTel1() {
		return recadoTel1;
	}

	public void setRecadoTel1(String recadoTel1) {
		this.recadoTel1 = recadoTel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getRamalTel2() {
		return ramalTel2;
	}

	public void setRamalTel2(String ramalTel2) {
		this.ramalTel2 = ramalTel2;
	}

	public String getRecadoTel2() {
		return recadoTel2;
	}

	public void setRecadoTel2(String recadoTel2) {
		this.recadoTel2 = recadoTel2;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getRamalTel3() {
		return ramalTel3;
	}

	public void setRamalTel3(String ramalTel3) {
		this.ramalTel3 = ramalTel3;
	}

	public String getRecadoTel3() {
		return recadoTel3;
	}

	public void setRecadoTel3(String recadoTel3) {
		this.recadoTel3 = recadoTel3;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getRecebeNovidades() {
		return recebeNovidades;
	}

	public void setRecebeNovidades(int recebeNovidades) {
		this.recebeNovidades = recebeNovidades;
	}

	public String getDocCPF() {
		return docCPF;
	}

	public void setDocCPF(String docCPF) {
		this.docCPF = docCPF;
	}

	public String getDocIdentidade() {
		return docIdentidade;
	}

	public void setDocIdentidade(String docIdentidade) {
		this.docIdentidade = docIdentidade;
	}

	public String getDocOrgExp() {
		return docOrgExp;
	}

	public void setDocOrgExp(String docOrgExp) {
		this.docOrgExp = docOrgExp;
	}

	public Date getDocDataExp() {
		return docDataExp;
	}

	public void setDocDataExp(Date docDataExp) {
		this.docDataExp = docDataExp;
	}

	public String getDocProfis() {
		return docProfis;
	}

	public void setDocProfis(String docProfis) {
		this.docProfis = docProfis;
	}

	public Date getDocDataVencDocProfis() {
		return docDataVencDocProfis;
	}

	public void setDocDataVencDocProfis(Date docDataVencDocProfis) {
		this.docDataVencDocProfis = docDataVencDocProfis;
	}

	public Boolean getDocAvisaVencCarta() {
		return docAvisaVencCarta;
	}

	public void setDocAvisaVencCarta(Boolean docAvisaVencCarta) {
		this.docAvisaVencCarta = docAvisaVencCarta;
	}

	public Boolean getDocAvisaVencEmail() {
		return docAvisaVencEmail;
	}

	public void setDocAvisaVencEmail(Boolean docAvisaVencEmail) {
		this.docAvisaVencEmail = docAvisaVencEmail;
	}

	public String getTipoSang() {
		return tipoSang;
	}

	public void setTipoSang(String tipoSang) {
		this.tipoSang = tipoSang;
	}

	public String getFatorRH() {
		return fatorRH;
	}

	public void setFatorRH(String fatorRH) {
		this.fatorRH = fatorRH;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public String getPrimeiroLogin() {
		return primeiroLogin;
	}

	public void setPrimeiroLogin(String primeiroLogin) {
		this.primeiroLogin = primeiroLogin;
	}

	public Long getId() {
		return id;
	}
}
