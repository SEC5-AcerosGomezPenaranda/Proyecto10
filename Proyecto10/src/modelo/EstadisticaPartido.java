package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EstadisticaPartido 
{
	private boolean hayGanador;
	private HashMap<EquipoFantasia, String> goles;
	
	public EstadisticaPartido(boolean ganador, HashMap<EquipoFantasia, String> losGoles ) 
	{
		this.hayGanador = ganador;
		this.goles = losGoles;
	}
	

}
