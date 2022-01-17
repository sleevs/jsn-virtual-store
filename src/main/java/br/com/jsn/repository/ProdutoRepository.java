package br.com.jsn.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.jsn.model.Produto;


/**
*
* @author JSN
*/
@Stateless
public class ProdutoRepository extends AbstractFacade<Produto>{
	
	

	public ProdutoRepository(Class<Produto> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}



	@PersistenceContext(unitName = "VirtualStorePU")
	private EntityManager em;
	

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	


	public List<Produto> listarProdutos() {

		try {
			System.out.println("ACESSO AO BANCO DE DADOS : ADICIONAR LOG NA OPERAÇÃO AQUI ");
			Query query = em.createQuery("SELECT p FROM Produto p", Produto.class);
			return (List<Produto>) query.getResultList();
			
		} catch (Exception e) {
			System.out.println("ACESSO AO BANCO DE DADOS : EXCEPTION ADICIONAR LOG AQUI ");
			System.out.println("DEFINIR EXCEPTION PARA ESTE PROCESSO " + e.getMessage());

		}

		return null;
	}


}
