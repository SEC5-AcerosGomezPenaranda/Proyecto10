package modelo;

public class EstadisticaJugador 
{
	private int amarillas;
	private double minutosJugados;
	private int goles;
	private int asistencias;
	private int penaltiesAtajados;
	private int penaltiesErrados;
	private int golesRecibidos;
	
	public EstadisticaJugador(int lasAmarillas, double losMinutosJugados, int losGoles, int lasAsistencias, int losPenaltiesAtajados, int losPenaltiesErrados, int losGolesRecibidos) 
	{
		this.amarillas = lasAmarillas;
		this.minutosJugados = losMinutosJugados;
		this.goles = losGoles;
		this.asistencias = lasAsistencias;
		this.penaltiesAtajados = losPenaltiesAtajados;
		this.penaltiesErrados = losPenaltiesErrados;
		this.golesRecibidos = losGolesRecibidos;
		
	}
}
