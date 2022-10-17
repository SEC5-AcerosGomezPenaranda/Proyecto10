package modelo;

public class Jugador 
{
	private String nombre;
	private String posicion;
	private String equipo;
	private int puntuacion;
	private double valor;
	private EstadisticaJugador estadisticasGlobales;
	
	public Jugador(String elNombre, String laPosicion, String elEquipo, int elValor) 
	{
		this.nombre = elNombre;
		this.posicion = laPosicion;
		this.equipo = elEquipo;
		this.valor = elValor;
	}
	
	

}
