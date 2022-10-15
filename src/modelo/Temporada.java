package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Temporada 
{
	private ArrayList<Jornada> fechas;
	private String nombre;
	
	public Temporada(ArrayList <Jornada> lasFechas, String elNombre) 
	{
		this.fechas = lasFechas;
		this.nombre = elNombre;
		
	}
}
