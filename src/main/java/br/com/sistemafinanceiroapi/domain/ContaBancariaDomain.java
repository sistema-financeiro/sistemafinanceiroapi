package br.com.sistemafinanceiroapi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONTA_BANCARIA")
public class ContaBancariaDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name = "ID_CATEGORIA_CONTA_BANCARIA")
	private CategoriaContaBancariaDomain categoriaContaBancariaDomain;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA_INSTITUICAO_FINANCEIRA")
	private PessoaDomain pessoaInstituicaoFinanceira;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA_TITULAR_CONTA_BANCARIA")
	private PessoaDomain pessoaTitularContaBancaria;
	
	@Column(name = "NUMERO_AGENCIA")
	private String numeroAgencia;
	
	@Column(name = "NUMERO_CONTA", nullable = false)
	private String numeroConta;
	
	@Column(name = "DATA_ABERTURA", nullable = false)
	private Date dataAberturaConta;
	
	@Column(name = "DATA_ENCERRAMENTO")
	private Date dataEncerramento;
	
	@Column(name = "E_ATIVO", nullable = false)
	private Boolean eAtivo;
	
	public ContaBancariaDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public CategoriaContaBancariaDomain getCategoriaContaBancariaDomain() {
		return categoriaContaBancariaDomain;
	}

	public void setCategoriaContaBancariaDomain(CategoriaContaBancariaDomain categoriaContaBancariaDomain) {
		this.categoriaContaBancariaDomain = categoriaContaBancariaDomain;
	}

	public PessoaDomain getPessoaInstituicaoFinanceira() {
		return pessoaInstituicaoFinanceira;
	}

	public void setPessoaInstituicaoFinanceira(PessoaDomain pessoaInstituicaoFinanceira) {
		this.pessoaInstituicaoFinanceira = pessoaInstituicaoFinanceira;
	}

	public PessoaDomain getPessoaTitularContaBancaria() {
		return pessoaTitularContaBancaria;
	}

	public void setPessoaTitularContaBancaria(PessoaDomain pessoaTitularContaBancaria) {
		this.pessoaTitularContaBancaria = pessoaTitularContaBancaria;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Date getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(Date dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public Boolean geteAtivo() {
		return eAtivo;
	}

	public void seteAtivo(Boolean eAtivo) {
		this.eAtivo = eAtivo;
	} 

}
