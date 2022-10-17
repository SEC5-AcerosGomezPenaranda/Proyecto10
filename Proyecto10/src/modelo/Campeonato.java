package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Campeonato 
{
	private String nombre;
	private Temporada torneo;
	private ArrayList<EquipoReal> equipos;
	
	public Campeonato(String elNombre, Temporada elTorneo, ArrayList<EquipoReal> losEquipos) 
	{
		this.nombre = elNombre;
		this.torneo = elTorneo;
		this.equipos = losEquipos;
	}
}
