package br.com.jsnsoftware.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * @author JSN - jeison muniz
 * backgroud:
 * escopo:
 * cenario:
 * */


@Entity
@Table(name = "cliente")
@XmlRootElement
public class ClienteModel  implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	

}
