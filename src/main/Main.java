package main;



import negocio.saludo.DelegadoSaludo;
import negocio.saludo.Persona;
import negocio.saludo.Saludo;




public class Main {

	public static void main(String[] args) 
	{
		
		String res;
		
		res= DelegadoSaludo.getInstancia().saludarGET("Charlton", "Heston");
		System.out.println(res);
		
		res= DelegadoSaludo.getInstancia().saludarPOST("Gwyneth", "Paltrow");
		System.out.println(res);
		
		res= DelegadoSaludo.getInstancia().saludarDELETE("Miguel", "Ríos");
		System.out.println(res);
		
		res= DelegadoSaludo.getInstancia().saludarPUT("Melania", "Trump");
		System.out.println(res);
			
		Persona p= new Persona ("Pepe", "Romero");
		Saludo s= DelegadoSaludo.getInstancia().saludarPUTjson(p);
		System.out.println(s.getTexto());
	}	

		

}
