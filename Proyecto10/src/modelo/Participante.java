package modelo;

import java.util.List;
import java.util.Map;

public class Participante extends Usuario
{
	private EquipoFantasia equipo;
	
	/*public Participante(EquipoFantasia elEquipo){
		this.equipo = elEquipo;
	}*/
	public Participante(String nombreUsuario, String pass) {
		super(nombreUsuario, pass);
	}

}
