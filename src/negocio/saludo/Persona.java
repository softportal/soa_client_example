package negocio.saludo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona 
{
	protected String nombre;
	protected String apellido;
	
	public Persona()
	{
		this.nombre = null;
		this.apellido = null;
	}
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
