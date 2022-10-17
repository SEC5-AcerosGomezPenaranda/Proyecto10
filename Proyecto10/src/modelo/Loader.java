package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Loader {
	
	
	
	public static CalculadoraJugadores cargarArchivo(String nombreArchivo) throws FileNotFoundException, IOException
	{
		Map<String, Jugador> jugadores = new HashMap<>();
		List<EquipoReal> equipos = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine();
		
		linea = br.readLine();
		while (linea != null) {
			String[] partes = linea.split(",");
			String nombreJugador = partes[0];
			String posicion = partes[1];
			String nombreEquipo = partes[2];
			int valor = Integer.parseInt(partes[3]);
			

			EquipoReal elEquipo = buscarEquipo(equipos, nombreEquipo);
			if (elEquipo == null) {
				elEquipo = new EquipoReal(nombreEquipo);
				equipos.add(elEquipo);
			}
			
			
			Jugador jugador = jugadores.get(nombreJugador);
			if (jugador == null) {
				jugador = new Jugador(nombreJugador, posicion, nombreEquipo, valor);
				jugadores.put(nombreJugador, jugador);
				elEquipo.agregarJugador(jugador);
			}
			
			
			
			linea = br.readLine();
		}
		br.close();
		
		CalculadoraJugadores calculadora = new CalculadoraJugadores(jugadores, equipos);
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
	
	
}
