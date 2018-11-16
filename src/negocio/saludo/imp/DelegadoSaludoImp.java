package negocio.saludo.imp;


import javax.ws.rs.client.Client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;




import negocio.saludo.DelegadoSaludo;
import negocio.saludo.Persona;
import negocio.saludo.Saludo;


public class DelegadoSaludoImp extends DelegadoSaludo {

		
	protected final static String url = "http://localhost:8080/soa_rest/servicios/saludo/wsb";
	protected final static String url2= "http://localhost:8080/soa_rest/servicios/saludo/wsb/json";

	@Override
	public String saludarPOST(String nombre, String apellido) 
	{
		
		Client cliente = ClientBuilder.newClient();
		
		String 	res= cliente.target(url).request().post(Entity.text(nombre + ", "+apellido), String.class);

		cliente.close();
		
		return res;
	}

	@Override
	public String saludarGET(String nombre, String apellido) 
	{
	
		Client cliente = ClientBuilder.newClient();
		
		String res= cliente.target(url + "/"+nombre+"/"+apellido).request().get(String.class);
				
		cliente.close();
		
		return res;
	}

	@Override
	public String saludarPUT(String nombre, String apellido)
	{
		Client cliente = ClientBuilder.newClient();

		Form form= new Form();
		form.param("nombre", nombre);
		form.param("apellido", apellido);
				
		String res= cliente.target(url).request().put(Entity.form(form), String.class);

		cliente.close();
		
		return res;
	}

	@Override
	public String saludarDELETE(String nombre, String apellido) 
	{
		Client cliente = ClientBuilder.newClient();

		String res= cliente.target(url + "?nombre="+nombre+"&apellido="+apellido).request().delete(String.class);
		
		cliente.close();
		
		return res;
	}

	@Override
	public Saludo saludarPUTjson(Persona p) 
	{
		
		
		Client cliente= ClientBuilder.newClient();
		
	
		Saludo s= cliente.target(url2).request(MediaType.APPLICATION_JSON).put(Entity.json(p), Saludo.class);
				
		cliente.close();
		
		return s;
	}

}
