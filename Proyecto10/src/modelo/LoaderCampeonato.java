package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoaderCampeonato {
	
	public static CalculadoraPartidos cargarArchivo(String nombreArchivo) throws FileNotFoundException, IOException
	{
		Map<Calendar, Partido> partidos = new HashMap<>();
		List<Jornada> jornadas = new ArrayList<>();
		
		
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		
		linea = br.readLine();
		while (linea != null) {
			
			String[] partes = linea.split(",");
			String nombreJornada = partes[0];
			int anio = Integer.parseInt(partes[1]);
			int mes = Integer.parseInt(partes[2]);
			int dia = Integer.parseInt(partes[3]);
			int hora = Integer.parseInt(partes[4]);
			int min = Integer.parseInt(partes[5]);
			int sec = Integer.parseInt(partes[6]);
			
			
			Calendar fecha = Calendar.getInstance();
			fecha.set(Calendar.YEAR, anio);
			fecha.set(Calendar.MONTH, mes);
			fecha.set(Calendar.DAY_OF_MONTH, dia);
			fecha.set(Calendar.HOUR_OF_DAY, hora);
			fecha.set(Calendar.MINUTE, min);
			fecha.set(Calendar.SECOND, sec);
					
			String local = partes[7];
			String visitante = partes[8];
			
			List<EquipoReal> equipos = CalculadoraJugadores.getEquipos();
			
			EquipoReal equipolocal = buscarEquipo(equipos, local);
			EquipoReal equipovisitante = buscarEquipo(equipos, visitante);
			
			Jornada laJornada = buscarJornada(jornadas, nombreJornada);
			if (laJornada == null) {
				laJornada = new Jornada(nombreJornada);
				jornadas.add(laJornada);
			}
			
			Partido partido = partidos.get(fecha);
			if (partido == null) {
				partido = new Partido(equipolocal, equipovisitante, fecha);
				partidos.put(fecha, partido);
				laJornada.agregarPartido(partido);
			}
			
			
			linea = br.readLine();
		}
		br.close();
		
		CalculadoraPartidos calculadora = new CalculadoraPartidos(partidos, jornadas);
		return calculadora;
		
		
	}
	private static EquipoReal buscarEquipo(List<EquipoReal> equipos, String nombreEquipos)
	{
		EquipoReal elEquipoReal = null;

		for (int i = equipos.size() - 1; i >= 0 && elEquipoReal == null; i--)
		{
			EquipoReal unEquipoReal = equipos.get(i);
			if (unEquipoReal.darNombre().equals(nombreEquipos))
			{
				elEquipoReal = unEquipoReal;
			}
		}

		return elEquipoReal;
	}
		
		private static Jornada buscarJornada(List<Jornada> jornadas, String nombreJornada)
		{
			Jornada laJornada = null;

			for (int i = jornadas.size() - 1; i >= 0 && laJornada == null; i--)
			{
				Jornada unaJornada = jornadas.get(i);
				if (unaJornada.darNombre().equals(nombreJornada))
				{
					laJornada = unaJornada;
				}
			}

			return laJornada;
	
	}
}
