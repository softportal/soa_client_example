package main;



import negocio.localidad.DelegadoLocalidad;
import negocio.localidad.TLocalidad;
import negocio.saludo.DelegadoSaludo;
import negocio.saludo.Persona;
import negocio.saludo.Saludo;




public class Main {

	public static void main(String[] args) 
	{
		
		String res;
		String id = "1";
		System.out.println("Read by get: ");
		res= DelegadoLocalidad.getInstancia().read_get_id(id);
		System.out.println(res);
		
		System.out.println("Read by delete: ");
		res= DelegadoLocalidad.getInstancia().read_delete_id(id);
		System.out.println(res);

		
		System.out.println("Read by post: ");
		res= DelegadoLocalidad.getInstancia().read_post_id(id);
		System.out.println(res);
		
		System.out.println("insert bcn");
		TLocalidad l = new TLocalidad("Barcelona", 100, 100, 1);
		res = DelegadoLocalidad.getInstancia().insert_put(l);


		/*
		Persona p= new Persona ("Pepe", "Romero");
		Saludo s= DelegadoSaludo.getInstancia().saludarPUTjson(p);
		System.out.println(s.getTexto());
		*/
	}	

		

}
