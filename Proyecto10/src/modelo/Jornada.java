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
	
	public Jornada(String elNombre) 
	{
		this.nombre = elNombre;
		this.encuentros = new ArrayList<>();
		
	}
	
	public String darNombre() {
		return nombre;
	}
	public void agregarPartido(Partido nuevoPartido) {
		encuentros.add(nuevoPartido);
	}
}
