package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class CalculadoraEstadistica
{
	private ArrayList<Jugador> jugadores;
	private Jornada jornada;
	
	public CalculadoraEstadistica(ArrayList <Jugador> losJugadores, Jornada laJornada) 
	{
		this.jugadores = losJugadores;
		this.jornada = laJornada;
	}
}
