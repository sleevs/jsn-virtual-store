package br.com.jsn.ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.jsn.model.Produto;
import br.com.jsn.service.ProdutoService;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class ProdutoWebService  {
	
	
	@EJB
	private ProdutoService produtoService ;

	@WebMethod 
	public List<Produto> listarPordutos() {
		
		return produtoService.listarProdutos();
	}

	
	@WebMethod 
	public String produtoTets() {
		
		return "APLICATION SOAP PRODUTO OK ";
	}

}
