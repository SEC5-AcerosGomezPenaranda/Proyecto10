package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalculadoraJugadores {

	private List<Jugador> jugadores;
	private static List<EquipoReal> equipos;

	public CalculadoraJugadores(Map<String, Jugador> jugadores, List<EquipoReal> elEquipo) {
		this.jugadores = new ArrayList<Jugador>(jugadores.values());
		this.equipos = elEquipo;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public static List<EquipoReal> getEquipos() {
		return equipos;
	}

}
