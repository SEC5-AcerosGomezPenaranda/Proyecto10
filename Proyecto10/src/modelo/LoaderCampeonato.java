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

public class LoaderCampeonato {
	
	public static CalculadoraJugadores cargarArchivo(String nombreArchivo) throws FileNotFoundException, IOException
	{
		Map<String, Partido> partidos = new HashMap<>();
		
		
		
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
			
			String local = partes[7];
			String visitante = partes[8];
			
			
			EquipoReal local = buscarEquipo();
			linea = br.readLine();
		}
		br.close();
		
		
	}
	

}
