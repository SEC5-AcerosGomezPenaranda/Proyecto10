package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Partido 
{
	private EstadisticaPartido reporte;
	private EquipoReal local;
	private EquipoReal visitante;
	private ArrayList<EstadisticaJugador> desempeños;
	
	public Partido(EstadisticaPartido elReporte, EquipoReal elLocal, EquipoReal elVisitante, ArrayList<EstadisticaJugador> losDesempeños)
	{
		this.reporte = elReporte;
		this.local = elLocal;
		this.visitante = elVisitante;
		this.desempeños = losDesempeños;
	}
	
	
}
