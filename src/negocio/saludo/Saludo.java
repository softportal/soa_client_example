package negocio.saludo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Saludo {
	String texto;
	
	public Saludo()
	{
		this.texto=null; 
	}
	
	public Saludo(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


	

}
