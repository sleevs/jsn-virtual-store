package br.com.jsn.api;

import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.jsn.model.Produto;





@javax.ws.rs.ApplicationPath("virtual_store_api")
public class JAXRSConfiguration  extends Application {
	
	
	  @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> resources = new java.util.HashSet<>();
	        addRestResourceClasses(resources);
	        return resources;
	    }

	
	  private void addRestResourceClasses(Set<Class<?>> resources) {
		  
		  resources.add( br.com.jsn.api.ProdutoApi.class);
	  }

}