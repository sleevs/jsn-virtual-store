package br.com.jsn.api;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.jsn.model.Produto;
import br.com.jsn.service.ProdutoService;

@Stateless
@Path("/produto")
public class ProdutoApi  {
	
	
	@EJB
	ProdutoService produtoService;
	
	
	
	@GET
	@Path("listar")
	@Produces({"application/xml", "application/json"})
	public List<Produto> listar() {
		return produtoService.listarProdutos() ;
	}
	

	@GET
	@Path("teste")
	//@Produces(MediaType.APPLICATION_JSON)
	public String teste() {
		return "APPLICATION API OK";
	}
	
	
}
