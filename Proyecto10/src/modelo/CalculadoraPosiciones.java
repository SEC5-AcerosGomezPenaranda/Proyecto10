package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CalculadoraPosiciones 
{
	private PuntuacionEquipo puntuacionEquipo;
	private ArrayList<PuntuacionJugador> puntuacionJugadores;
	
	public CalculadoraPosiciones(PuntuacionEquipo laPuntuacionEquipo, ArrayList<PuntuacionJugador> lasPuntuacionesJugadores)
	{
		this.puntuacionEquipo = laPuntuacionEquipo;
		this.puntuacionJugadores = lasPuntuacionesJugadores;
	}
	
}
