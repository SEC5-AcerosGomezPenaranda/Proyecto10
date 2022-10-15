package modelo;

public class Jugador 
{
	private String nombre;
	private String posicion;
	private int puntuacion;
	private double valor;
	private EstadisticaJugador estadisticasGlobales;
	
	public Jugador(String elNombre, String laPosicion,int laPuntuacion, double elValor, EstadisticaJugador lasEstadisticasGlobales) 
	{
		this.nombre = elNombre;
		this.posicion = laPosicion;
		this.puntuacion = laPuntuacion;
		this.valor = elValor;
		this.estadisticasGlobales = lasEstadisticasGlobales;
	}

}
