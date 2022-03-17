package paquete1;
/**
 * Clase PruebaCancion para 
 * @author Sara Vadillo
 * @version 2.2022
 */

public class PruebaCancion {
	/**
	 * En la clase "Main" utilizamos varios objetos de la clase "Cancion",
	 * tambi�n utilizamos varias condiciones con "if" y distintos m�todos para saber si las canciones est�n sonando,
	 * las paramos o comparamos con otra canci�n.
	 * @param args, array de tipo String.
	 */
	public static void main(String[] args) {
			
		
			Cancion cancionPrueba = new Cancion();
			System.out.println(cancionPrueba);
			
			Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
			System.out.println(cancionClasico);
			
			Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
			Cancion segundaCancion = new Cancion("Don�t Stop Believin�", "Journey", 320, false);
			Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
			
			// Canciones nuevas para Git
			Cancion cuartaCancion = new Cancion("Crazy", "Aerosmith", 420, false);
			Cancion quintaCancion = new Cancion("Satisfaction", "Rolling Stones", 320, true);

			if (primeraCancion.reproducirCancion()) {
				System.out.println(primeraCancion.getTitulo() + "est� sonando");
			}
			if (primeraCancion.pararCancion()) {
				System.out.println(primeraCancion.getTitulo() + "stop");
			}
			if (primeraCancion.MismaCancion(cancionClasico)) {
				System.out.println("Parece que no son la misma canci�n");
			}
			Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
			Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
			
			mostrarCancionesyAutor(canciones);
			mostrarCancionMasLarga(canciones);

			mostrarSiguienteCancion(primeraCancion, canciones);
			mostrarSiguienteCancion(nueva, canciones);
		}

		/**
		 * M�todo para mostrar el t�tulo de la canci�n en la que est�s y la que sonar� despu�s
		 * @param miCancion, objeto clase Canci�n
		 * @param canciones array de canciones
		 */
		private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
			System.out.println("La canci�n que sonar� despu�s de " + miCancion.getTitulo() + " ser� "
					+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
		}

		/**
		 * M�todo para mostrar el t�tulo de la canci�n m�s larga.
		 * @param canciones, array de canciones
		 */
		private static void mostrarCancionMasLarga(Cancion[] canciones) {
			System.out.println("La canci�n m�s larga es: " + Cancion.MayorDuracion(canciones));
		}

		/**
		 * M�todo para mostrar el t�tulo de la canci�n y el nombre del grupo 
		 * @param canciones, array de canciones
		 */
		private static void mostrarCancionesyAutor(Cancion[] canciones) {
			for (int i = 0; i < canciones.length; i++) {
				System.out.println("La canci�n es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
			}
		}
		
}
