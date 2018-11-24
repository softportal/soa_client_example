package negocio.localidad.imp;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import negocio.localidad.DelegadoLocalidad;
import negocio.localidad.TLocalidad;

public class DelegadoLocalidadImp extends DelegadoLocalidad {
	
	protected final static String url= "http://localhost:8080/soa_rest/servicios/localidad/wsb";
	protected final static String url2= "http://localhost:8080/soa_rest/servicios/localidad/wsb/json";

	@Override
	public String read_get_id(String id) {
		// TODO Auto-generated method stub
		Client cliente = ClientBuilder.newClient();
		
		String res= cliente.target(url + "/read/"+id).request().get(String.class);
				
		cliente.close();
		
		return res;
	}
	@Override
	public String read_post_id(String id) {
		// TODO Auto-generated method stub
		Client cliente = ClientBuilder.newClient();
		
		String 	res= cliente.target(url).request().post(Entity.text(id), String.class);

		cliente.close();
		
		return res;
	}
	@Override
	public String read_delete_id(String id) {
		// TODO Auto-generated method stub
		
		Client cliente = ClientBuilder.newClient();

		String res= cliente.target(url + "?id="+id).request().delete(String.class);
		
		cliente.close();
		
		return res;
	}
	@Override
	public String insert_put(TLocalidad l) {
		Client cliente = ClientBuilder.newClient();

		String res= cliente.target(url2).request(MediaType.TEXT_PLAIN).put(Entity.json(l), String.class);
		
		cliente.close();
		
		return res;
	}
	@Override
	public String update_post(String id, String nombre, String longitud, String latitud, String activo) {
		// TODO Auto-generated method stub
		Client cliente = ClientBuilder.newClient();
		String data = id+", "+nombre+", "+longitud+", "+latitud+", "+activo;
		String 	res= cliente.target(url+ "/update").request().post(Entity.text(data), String.class);
		cliente.close();

		return res;
	}
	@Override
	public String delete_post(String id) {
		// TODO Auto-generated method stub
		Client cliente = ClientBuilder.newClient();
		
		String 	res= cliente.target(url+ "/delete").request().post(Entity.text(id), String.class);

		cliente.close();
		
		return res;
	}
	


}
