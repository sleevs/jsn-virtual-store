package br.com.jsnsoftware.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/*
 * @author JSN - jeison muniz
 * backgroud:
 * escopo:
 * cenario:
 * */


@Entity
@Table(name = "produto")
@XmlRootElement
public class ProdutoModel implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "produto_id")
	    private Integer produtoId;
	    @Size(max = 45)
	    @Column(name = "produto_tipo")
	    private String produtoTipo;
	    @Size(max = 45)
	    @Column(name = "produto_categoria")
	    private String produtoCategoria;
	    @Lob
	    @Size(max = 16777215)
	    @Column(name = "produto_descicao")
	    private String produtoDescricao;
	    @Column(name = "produto_data")
	    @Temporal(TemporalType.DATE)
	    private Date produtoData;
	    
	    @Lob
	    @Size(max = 65535)
	    @Column(name = "produto_imagem")
	    private String produtoImagem;
	    
	    public ProdutoModel() {
	    	
	    }

		public Integer getProdutoId() {
			return produtoId;
		}

		public void setProdutoId(Integer produtoId) {
			this.produtoId = produtoId;
		}

		public String getProdutoTipo() {
			return produtoTipo;
		}

		public void setProdutoTipo(String produtoTipo) {
			this.produtoTipo = produtoTipo;
		}

		public String getProdutoCategoria() {
			return produtoCategoria;
		}

		public void setProdutoCategoria(String produtoCategoria) {
			this.produtoCategoria = produtoCategoria;
		}

		public String getProdutoDescricao() {
			return produtoDescricao;
		}

		public void setProdutoDescricao(String produtoDescricao) {
			this.produtoDescricao = produtoDescricao;
		}

		public Date getProdutoData() {
			return produtoData;
		}

		public void setProdutoData(Date produtoData) {
			this.produtoData = produtoData;
		}

		public String getProdutoImagem() {
			return produtoImagem;
		}

		public void setProdutoImagem(String produtoImagem) {
			this.produtoImagem = produtoImagem;
		}
	   
	   
	    

}
