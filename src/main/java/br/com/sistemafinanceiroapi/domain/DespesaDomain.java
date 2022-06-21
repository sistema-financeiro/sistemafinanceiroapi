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

/*

	Código: 						0001
	Categoria Despesa:				Despesa Fixa
	Favorecido:						PJ Serviços Contábeis
	Produto ou Serviço:				Assessoria de Contabilidade
	Data Vencimento:				05/06/2022
	Data Pagamento:					
	Valor Multa por Atraso:			R$ 00,00
	Valor Final:					R$ 200,00
	Recorrente ?:					Sim
	Situação do Pagamento:			Atraso
	Fonte do Pagamento:				José Quintino - Banco do Brasil - Saldo de Conta Corrente (71.746-0)
	
*/

@Entity
@Table(name = "TB_DESPESA")
public class DespesaDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name = "ID_CATEGORIA_DESPESA", nullable = false)
	private CategoriaDespesaDomain categoriaDespesaDomain;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA_FAVORECIDO")
	private PessoaDomain pessoaFavorecido;
	
	@Column(name = "DATA_VENCIMENTO", nullable = false)
	private Date dataVencimento;
	
	@Column(name = "DATA_PAGAMENTO")
	private Date dataPagamento;
	
	@Column(name = "VALOR_FINAL", nullable = false)
	private Double valorFinal;
	
	public DespesaDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public CategoriaDespesaDomain getCategoriaDespesaDomain() {
		return categoriaDespesaDomain;
	}

	public void setCategoriaDespesaDomain(CategoriaDespesaDomain categoriaDespesaDomain) {
		this.categoriaDespesaDomain = categoriaDespesaDomain;
	}

	public PessoaDomain getPessoaFavorecido() {
		return pessoaFavorecido;
	}

	public void setPessoaFavorecido(PessoaDomain pessoaFavorecido) {
		this.pessoaFavorecido = pessoaFavorecido;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

}
