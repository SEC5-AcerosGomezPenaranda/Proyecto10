package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
import uniandes.dpoo.taller0.modelo.Atleta;
import uniandes.dpoo.taller0.modelo.Evento;
*/

public class Consola {
	/**
	 * Esta es la calculadora de estadísticas que se usará para hacer todas las
	 * operaciones de la aplicación. Esta calculadora también contiene toda la
	 * información sobre los atletas después de que se cargue desde un archivo.
	 */
	private CalculadoraJugadores calculadoraJ;
	private CalculadoraPartidos calculadoraP;
	private CalculadoraPosiciones calculadoraPos;
	private CalculadoraEstadistica calculadoraE;

	/**
	 * Ejecuta la aplicación: le muestra el menú al usuario y la pide que ingrese
	 * una opción, y ejecuta la opción seleccionada por el usuario. Este proceso se
	 * repite hasta que el usuario seleccione la opción de abandonar la aplicación.
	 */
	public void ejecutarAplicacion() {
		ejecutarCargarCampeonato();

		Map<String, Administrador> Admins = new HashMap<>();
		Map<String, Participante> Partis = new HashMap<>();

		String rutaUsuarios = "Archivos/Usuarios.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(rutaUsuarios));
			String linea = br.readLine();
			linea = br.readLine();

			while (linea != null) {
				String[] partes = linea.split(",");
				String rol = partes[0];
				String nombreUsuario = partes[1];
				String pass = partes[2];

				if (rol.contentEquals("administrador")) {
					Administrador elAdmin = Admins.get(nombreUsuario);
					if (elAdmin == null) {
						elAdmin = new Administrador(nombreUsuario, pass);
						Admins.put(nombreUsuario, elAdmin);
					}
				} else if (rol.contentEquals("participante")) {
					Participante elParticipante = Partis.get(nombreUsuario);
					if (elParticipante == null) {
						elParticipante = new Participante(nombreUsuario, pass);
						Partis.put(nombreUsuario, elParticipante);
					}
				}
			}
		} catch (FileNotFoundException f) {

		} catch (IOException e) {

		}

		System.out.println("Futbol Fantasía\n");
		String user = input("Nombre de usuario");
		String password = input("\nContraseña");

		Administrador adm = Admins.get(user);
		Participante parti = Partis.get(user);

		if (adm != null) {
			String admi = adm.getNombreUsuario();
			String contra = adm.getContrasena();
			if (admi.equals(user) && contra.equals(password)) {
				boolean continuar = true;
				while (continuar) {
					try {
						mostrarMenuAdministrador();
						int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
						if (opcion_seleccionada == 1) {

						}
						/*
						 * else if (opcion_seleccionada == 2 && calculadora != null)
						 * ejecutarAtletasPorAnio(); else if (opcion_seleccionada == 3 && calculadora !=
						 * null) ejecutarMedallasEnRango();
						 * 
						 * else if (calculadora == null) { System.out.
						 * println("Para poder ejecutar esta opción primero debe cargar un archivo de atletas."
						 * ); }
						 */
						else {
							System.out.println("Por favor seleccione una opción válida.");
						}
					} catch (NumberFormatException e) {
						System.out.println("Debe seleccionar uno de los números de las opciones.");
					}
				}

			} else {
				while (!admi.equals(user) || !contra.equals(password))
					System.out.println("Datos incorrectos. Intente nuevamente: ");
				user = input("\nNombre de usuario: ");
				password = input("\nContraseña: ");
			}

		} else if (parti != null) {
			String partici = parti.getNombreUsuario();
			String contra = parti.getContrasena();
			if (partici.equals(user) && contra.equals(password)) {
				boolean continuar = true;
				while (continuar) {
					try {
						mostrarMenuParticipante();
						int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
						if (opcion_seleccionada == 1) {

						}
						/*
						 * else if (opcion_seleccionada == 2 && calculadora != null)
						 * ejecutarAtletasPorAnio(); else if (opcion_seleccionada == 3 && calculadora !=
						 * null) ejecutarMedallasEnRango();
						 * 
						 * else if (calculadora == null) { System.out.
						 * println("Para poder ejecutar esta opción primero debe cargar un archivo de atletas."
						 * ); } else { System.out.println("Por favor seleccione una opción válida."); }
						 */
					} catch (NumberFormatException e) {
						System.out.println("Debe seleccionar uno de los números de las opciones.");
					}
				}

			} else {
				while (!partici.equals(user) || !contra.equals(password))
					System.out.println("Datos incorrectos. Intente nuevamente: ");
				user = input("\nNombre de usuario: ");
				password = input("\nContraseña: ");
			}
		}
	}

	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */
	public void mostrarMenuAdministrador() {
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Iniciar sesion como participante");
		System.out.println("2. Iniciar sesion como administrador");
		System.out.println("3. Salir");

	}

	public void mostrarMenuParticipante() {
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Iniciar sesion como participante");
		System.out.println("2. Iniciar sesion como administrador");
		System.out.println("3. Salir");

	}

	/**
	 * Este método le pide al usuario el nombre de un archivo con información de los
	 * atletas, lo carga usando la clase LoaderOlimpicos y crea un objeto de tipo
	 * CalculadoraEstadisticas para que sea usado por las otras opciones de la
	 * consola.
	 */

	private void ejecutarCargarCampeonato() {

		try {
			calculadoraJ = Loader.cargarArchivo("Archivos/Libro2.csv");
			calculadoraP = LoaderCampeonato.cargarArchivo("Archivos/Jornadas.txt");

			/*
			 * System.out.println("Se cargó el archivo " + archivo +
			 * " con información de los Juegos Olímpicos."); Collection<String> eventos =
			 * calculadora.darNombresDeportes();
			 * System.out.println("Los deportes para los que se tiene información son:");
			 * for (String dep : eventos) { System.out.println(" - " + dep); }
			 */
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: el archivo indicado no se encontró.");
		} catch (IOException e) {
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Este método sirve para imprimir un mensaje en la consola pidiéndole
	 * información al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrará al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 */
	public String input(String mensaje) {
		try {
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Este es el método principal de la aplicación, con el que inicia la ejecución
	 * de la aplicación
	 * 
	 * @param args Parámetros introducidos en la línea de comandos al invocar la
	 *             aplicación
	 */
	public static void main(String[] args) {
		Consola consola = new Consola();
		consola.ejecutarAplicacion();
	}

}
