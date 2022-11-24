package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Partido {
	private EquipoReal local;
	private EquipoReal visitante;
	private Calendar fecha;
	private ArrayList<EstadisticaJugador> desempeños;

	public Partido(EquipoReal elLocal, EquipoReal elVisitante, Calendar laFecha) {
		this.local = elLocal;
		this.visitante = elVisitante;
		this.fecha = laFecha;
		desempeños = new ArrayList<EstadisticaJugador>();
	}

}
