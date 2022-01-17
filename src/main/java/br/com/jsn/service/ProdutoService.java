package br.com.jsn.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.jsn.model.Produto;
import br.com.jsn.repository.ProdutoRepository;

@Stateless
public class ProdutoService {

	
	@EJB
	ProdutoRepository produtoRepository;
	
	
	public List<Produto> listarProdutos() {
		
		return produtoRepository.listarProdutos() ;
		
	}

}
