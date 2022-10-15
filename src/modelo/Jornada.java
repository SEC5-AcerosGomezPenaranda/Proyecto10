package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Jornada
{
	private String nombre;
	private ArrayList<Partido> encuentros;
	
	public Jornada(String elNombre, ArrayList<Partido> losEncuentros) 
	{
		this.nombre = elNombre;
		this.encuentros = losEncuentros;
		
	}
}
