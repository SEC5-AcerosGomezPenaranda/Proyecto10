package modelo;

import java.util.ArrayList;
import java.util.List;

public class EquipoReal {
	private String nombre;
	
	private List<Jugador> jugadores;
	
	public EquipoReal(String elNombre) {
		this.nombre = elNombre;
		jugadores = new ArrayList<Jugador>();
		
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public void agregarJugador(Jugador nuevoJugador) {
		jugadores.add(nuevoJugador);
	}
	
	
}