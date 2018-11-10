package main;




import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import negocio.saludo.Persona;
import negocio.saludo.Saludo;




public class MainSinDelegado {

	public static void main(String[] args) {
		String url= "http://localhost:8080/soa_rest/servicios/saludo/wsb";
		Client cliente = ClientBuilder.newClient();
		//GET
		String res= cliente.target(url + "/Charlton/Heston").request().get(String.class);
		System.out.println(res);
		//POST
		res= cliente.target(url).request().post(Entity.text("Gwyneth, Paltrow"), String.class);

		System.out.println(res);
		//DELETE
		res= cliente.target(url + "?nombre=Miguel&apellido=Rios").request().delete(String.class);
		System.out.println(res);
		//PUT
		Form form= new Form();
		form.param("nombre", "Melania");
		form.param("apellido", "Trump");
		res= cliente.target(url).request().put(Entity.form(form), String.class);

		System.out.println(res);
		cliente.close();

		//PUT con json
		Client cliente2 = ClientBuilder.newClient();
		String url2= "http://localhost:8080/soa_rest/servicios/saludo/wsb/json";

		Persona p= new Persona("Pepe", "Romero");
		Saludo s= cliente2.target(url2).request(MediaType.APPLICATION_JSON).put(Entity.json(p), Saludo.class);
		System.out.println(s.getTexto());

		cliente2.close();
		}



}
