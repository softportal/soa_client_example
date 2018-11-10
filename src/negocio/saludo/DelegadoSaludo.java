package negocio.saludo;

import negocio.saludo.imp.DelegadoSaludoImp;

public abstract class DelegadoSaludo {
	protected static DelegadoSaludo instancia;
	
	public static DelegadoSaludo getInstancia()
	{
		if (instancia == null) instancia= new DelegadoSaludoImp();
		return instancia;
	}
	
	public abstract String saludarPOST(String nombre, String apellido);
	public abstract String saludarGET(String nombre, String apellido);
	public abstract String saludarPUT(String nombre, String apellido);
	public abstract String saludarDELETE(String nombre, String apellido);
	public abstract Saludo saludarPUTjson(Persona p);

}
