package modelo;

public class EquipoFantasia 
{
	private String nombre;
	private double presupuesto;
	private int puntuacion;
	private Alineacion alineacion;
	
	public EquipoFantasia(String nombre, double presupuesto, int puntuacion, Alineacion laAlineacion)
	{
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.puntuacion = puntuacion;
		this.alineacion = laAlineacion;
	}
	
}
