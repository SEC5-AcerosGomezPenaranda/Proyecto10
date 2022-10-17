package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class CalculadoraPartidos {
	
	private static List<Partido> partidos;
	private List<Jornada> jornadas;
	
	
	public CalculadoraPartidos(Map<Calendar, Partido> partidos, List<Jornada> laJornada) {
		this.partidos = new ArrayList<Partido>(partidos.values());
		this.jornadas = laJornada;
	}
	
	public List<Partido> getJugadores(){
		return partidos;
	}
	
	public List<Jornada> getEquipos(){
		return jornadas;
	}

}
