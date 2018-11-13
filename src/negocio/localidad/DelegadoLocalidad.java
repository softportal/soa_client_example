package negocio.localidad;

import negocio.localidad.imp.DelegadoLocalidadImp;

public abstract class DelegadoLocalidad {
	protected static DelegadoLocalidad instancia;
	
	public static DelegadoLocalidad getInstancia()
	{
		if (instancia == null) instancia = new DelegadoLocalidadImp();
		
		return instancia;
	}
	
	public abstract String read_get_id(String id);
	public abstract String read_post_id(String id);
	public abstract String read_delete_id(String id);
	public abstract String insert_put(TLocalidad l);
	
}
