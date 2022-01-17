package br.com.jsn.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JSN
 */
@Entity
@Table(name = "produto")
@XmlRootElement
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "produto_id")
	private Integer produtoId;
	@Size(max = 45)
	@Column(name = "produto_nome")
	private String produtoNome;
	@Size(max = 45)
	@Column(name = "produto_tipo")
	private String produtoTipo;
	@Size(max = 45)
	@Column(name = "produto_valor")
	private String produtoValor;

	public Produto() {
	}

	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public String getProdutoTipo() {
		return produtoTipo;
	}

	public void setProdutoTipo(String produtoTipo) {
		this.produtoTipo = produtoTipo;
	}

	public String getProdutoValor() {
		return produtoValor;
	}

	public void setProdutoValor(String produtoValor) {
		this.produtoValor = produtoValor;
	}

}
