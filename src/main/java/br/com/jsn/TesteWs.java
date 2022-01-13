package br.com.jsn;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class TesteWs {
	
	
	@WebMethod 
	String getHelloWorldAsString() {
		
		return "String teste";
	}

}
