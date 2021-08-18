package br.com.jsnsoftware.controller;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.jsnsoftware.model.ProdutoModel;




/*
 * autor:
 * backgroud:
 * escopo:
 * cenario:
 * */

@Stateless
@Path("produto_controller")
public class ProdutoController {
	
	
	
	@GET
    @Path("/teste")
    @Produces({MediaType.APPLICATION_JSON})
    public String testeRest() {
        return "JEE APPLICATION - TESTE OK";
    }
	
	@GET
    @Path("/buscarId/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public ProdutoModel find(@PathParam("id") Integer id) {
        return null;
    }
	
	


    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(ProdutoModel entity) {
    	//contaDao.create(entity);
    }
    
    
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, ProdutoModel entity) {
    	//contaDao.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
    //	contaDao.remove(contaDao.find(id));
    }


}
