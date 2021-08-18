package br.com.jsnsoftware.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.jsnsoftware.model.ProdutoModel;

/*
 * @author JSN - jeison muniz
 * backgroud:
 * escopo:
 * cenario:
 * */
@Stateless
public class ProdutoDao extends AbstractDao<ProdutoModel>{
	
	/*
	 * operation:
	 * resonsability:
	 * */

	//@PersistenceContext(unitName = "VivoDeBicoPU")
	private EntityManager em;

	
	

	public ProdutoDao(Class<ProdutoModel> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	/*
	 * operation:
	 * resonsability:
	 * */

	public List<ProdutoModel> buscarTodosProdutos() {

		try {

			TypedQuery<ProdutoModel> q = em.createQuery(
					"SELECT c FROM Conta c WHERE c.contaEmail = :email AND c.contaSenha = :senha", ProdutoModel.class);
			// .setParameter("email", contaEmail).setParameter("senha", contaSenha);

			return (List<ProdutoModel>) q.getSingleResult();

		} catch (Exception e) {

		}
		return null ;
	}

}
