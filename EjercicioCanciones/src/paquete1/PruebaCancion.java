package paquete1;
/**
 * Clase PruebaCancion para 
 * @author Sara Vadillo
 * @version 2.2022
 */

public class PruebaCancion {
	/**
	 * En la clase "Main" utilizamos varios objetos de la clase "Cancion",
	 * también utilizamos varias condiciones con "if" y distintos métodos para saber si las canciones están sonando,
	 * las paramos o comparamos con otra canción.
	 * @param args, array de tipo String.
	 */
	public static void main(String[] args) {
			
		
			Cancion cancionPrueba = new Cancion();
			System.out.println(cancionPrueba);
			
			Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
			System.out.println(cancionClasico);
			
			Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
			Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
			Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
			
			// Canciones nuevas para Git
			Cancion cuartaCancion = new Cancion("Crazy", "Aerosmith", 420, false);
			Cancion quintaCancion = new Cancion("Satisfaction", "Rolling Stones", 320, true);

			if (primeraCancion.reproducirCancion()) {
				System.out.println(primeraCancion.getTitulo() + "está sonando");
			}
			if (primeraCancion.pararCancion()) {
				System.out.println(primeraCancion.getTitulo() + "stop");
			}
			if (primeraCancion.MismaCancion(cancionClasico)) {
				System.out.println("Parece que no son la misma canción");
			}
			Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
			Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
			
			mostrarCancionesyAutor(canciones);
			mostrarCancionMasLarga(canciones);

			mostrarSiguienteCancion(primeraCancion, canciones);
			mostrarSiguienteCancion(nueva, canciones);
		}

		/**
		 * Método para mostrar el título de la canción en la que estás y la que sonará después
		 * @param miCancion, objeto clase Canción
		 * @param canciones array de canciones
		 */
		private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
			System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
					+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
		}

		/**
		 * Método para mostrar el título de la canción más larga.
		 * @param canciones, array de canciones
		 */
		private static void mostrarCancionMasLarga(Cancion[] canciones) {
			System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
		}

		/**
		 * Método para mostrar el título de la canción y el nombre del grupo 
		 * @param canciones, array de canciones
		 */
		private static void mostrarCancionesyAutor(Cancion[] canciones) {
			for (int i = 0; i < canciones.length; i++) {
				System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
			}
		}
		
}
