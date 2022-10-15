package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Alineacion {
	private Jugador capitan;
	private ArrayList<Jugador> delanteros;
	private ArrayList<Jugador> volantes;
	private ArrayList<Jugador> defensas;
	private Jugador arquero;
	
	public Alineacion(Jugador elCapitan, ArrayList<Jugador> losDelanteros, ArrayList<Jugador> losVolantes, ArrayList<Jugador> losDefensas, Jugador elArquero) {
		this.capitan = elCapitan;
		this.delanteros = losDelanteros;
		this.volantes = losVolantes;
		this.defensas = losDefensas;
		this.arquero = elArquero;
	}

		
}
