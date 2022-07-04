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
@Table(name = "TB_DESPESA_PRODUTO_SERVICO")
public class DespesaProdutoServicoDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name = "ID_DESPESA")
	private DespesaDomain despesaDomain;
	
	@OneToOne
	@JoinColumn(name = "ID_PRODUTO_SERVICO")
	private ProdutoServicoDomain produtoServicoDomain;
	
	@Column(name = "VALOR_UNITARIO", nullable = false)
	private Double valorUnitario;
	
	@Column(name = "QUANTIDADE", nullable = false)
	private Integer quantidade;
	
	public DespesaProdutoServicoDomain() { }

	public DespesaProdutoServicoDomain(DespesaDomain despesaDomain, ProdutoServicoDomain produtoServicoDomain, Double valorUnitario, Integer quantidade) {
		this.despesaDomain = despesaDomain;
		this.produtoServicoDomain = produtoServicoDomain;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public DespesaDomain getDespesaDomain() {
		return despesaDomain;
	}

	public void setDespesaDomain(DespesaDomain despesaDomain) {
		this.despesaDomain = despesaDomain;
	}

	public ProdutoServicoDomain getProdutoServicoDomain() {
		return produtoServicoDomain;
	}

	public void setProdutoServicoDomain(ProdutoServicoDomain produtoServicoDomain) {
		this.produtoServicoDomain = produtoServicoDomain;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
