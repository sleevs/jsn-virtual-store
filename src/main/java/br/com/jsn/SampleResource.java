package br.com.jsn;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/sample")
public class SampleResource {

	@Inject
	@ConfigProperty(name = "message")
	private String message;


	@GET
	@Path("teste_")
	public Response message() {
		return Response.ok(message).build();
	}
	
	@GET
	@Path("teste")
	public String teste() {
		return " TEST APLICATION ";
	}
	

}
