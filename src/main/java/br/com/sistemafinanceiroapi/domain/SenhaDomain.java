package br.com.sistemafinanceiroapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SENHA")
public class SenhaDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name = "ID_CATEGORIA_SENHA")
	private CategoriaSenhaDomain categoriaSenhaDomain;
	
	@Column(name = "TITULO", nullable = false)
	private String titulo;
	
	@Column(name = "URL")
	private String url;
	
	@Column(name = "IDENTIFICADOR", nullable = false)
	private String identificador;
	
	@Column(name = "SENHA_ALFANUMERICA")
	private String senhaAlfaNumerica;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	@Column(name = "IS_BIOMETRIA", nullable = false)
	private Boolean isBiometria;
	
	@Column(name = "IS_ATIVO", nullable = false)
	private Boolean isAtivo;
	
	public SenhaDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public CategoriaSenhaDomain getCategoriaSenhaDomain() {
		return categoriaSenhaDomain;
	}

	public void setCategoriaSenhaDomain(CategoriaSenhaDomain categoriaSenhaDomain) {
		this.categoriaSenhaDomain = categoriaSenhaDomain;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getSenhaAlfaNumerica() {
		return senhaAlfaNumerica;
	}

	public void setSenhaAlfaNumerica(String senhaAlfaNumerica) {
		this.senhaAlfaNumerica = senhaAlfaNumerica;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getIsBiometria() {
		return isBiometria;
	}

	public void setIsBiometria(Boolean isBiometria) {
		this.isBiometria = isBiometria;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
