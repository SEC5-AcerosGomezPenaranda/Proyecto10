package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EstadisticaRelevante
{
	private ArrayList<EquipoFantasia> tablaPosicionesEquipos;
	private ArrayList<Jugador> tablaPosicionesJugadores;
	
	public EstadisticaRelevante(ArrayList<EquipoFantasia> laTablaPosiciones, ArrayList<Jugador> laTablaJugadores) 
	{
		this.tablaPosicionesEquipos = laTablaPosiciones;
		this.tablaPosicionesJugadores = laTablaJugadores;
	}
	
}
