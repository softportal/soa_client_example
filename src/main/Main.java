package main;



import negocio.localidad.DelegadoLocalidad;
import negocio.localidad.TLocalidad;
import negocio.saludo.DelegadoSaludo;
import negocio.saludo.Persona;
import negocio.saludo.Saludo;




public class Main {

	public static void main(String[] args) 
	{
		
		
		String name = "penswdssz";
		int lat = 100;
		int lon = 100;
		int act   = 1;
		
		String res;
		
		TLocalidad l = new TLocalidad(name, lat, lon, act);
		res = DelegadoLocalidad.getInstancia().insert_put(l);
		System.out.println(res);
		String a[] = res.split(" ");
		String id = a[a.length -1];
		
		System.out.println("Read by get: ");
		res= DelegadoLocalidad.getInstancia().read_get_id(id);
		System.out.println(res);
		
		System.out.println("Read by delete: ");
		res= DelegadoLocalidad.getInstancia().read_delete_id(id);
		System.out.println(res);
		
		System.out.println("Update");
		res = DelegadoLocalidad.getInstancia().update_post(id, "updated", "1", "2", "3");
		System.out.println(res);

		
		System.out.println("Read by post: ");
		res= DelegadoLocalidad.getInstancia().read_post_id(id);
		System.out.println(res);
		
		System.out.println("Delete by post: ");
		res = DelegadoLocalidad.getInstancia().delete_post(id);
		System.out.println(res);
		
		

		
		/*
	
	
	
		

		/*
		Persona p= new Persona ("Pepe", "Romero");
		Saludo s= DelegadoSaludo.getInstancia().saludarPUTjson(p);
		System.out.println(s.getTexto());
		*/
	}	

		

}
