package br.com.jsnsoftware.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.jsnsoftware.dao.ProdutoDao;
import br.com.jsnsoftware.model.ProdutoModel;


/*
 * @author JSN - jeison muniz
 * backgroud:
 * escopo:
 * cenario:
 * */
@Stateless
public class ProdutoService {
	
	
	
	@EJB
	private ProdutoDao produtoDao ;
	
	
	
	

	public List<ProdutoModel> criarProduto(ProdutoModel p){
		
		return null ;
	}

	
	public List<ProdutoModel> listarProtutos(){
		
		return null ;
	}
	


	public ProdutoModel buscarProduto(Integer p){
		
		return null ;
	}
	
	
	

}
