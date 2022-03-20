package paquete1;
/**
 * Clase Cancion para construir canciones y sus m�todos.
 * @version 1.2022
 * @author Sara Vadillo
 */
public class Cancion {
		/**
		 * 	atributo
		 */
		private String titulo;
		/**
		 * 	atributo
		 */
		private String grupo;
		/**
		 * 	atributo
		 */
		private int duracion;
		/**
		 * 	atributo
		 */
		private boolean sonando;
		
		// Definimos los constructores
		/**
		 * Constructor por defecto que inicializa t�tulo vac�o, duraci�n cero 
		 * y no est� sonando, que le da un valor inicial "false".
		 */

		Cancion() // Constructor sin par�metros
		{
			this.titulo = "";
			this.duracion = 0;
			this.sonando = false;
		}
		/**
		 * Constructor que pide 2 atributos, titulo de la canci�n y duraci�n de la canci�n.
		 * @param titulo, lleva el t�tulo de la canci�n.
		 * @param duracion, Es la duraci�n de la canci�n en segundos.
		 */

		Cancion(String titulo, int duracion)// constructor con 2 par�metros
		{
			this.titulo = titulo;
			this.duracion = duracion;
			this.sonando = false;
		}
		/**
		 * Constructor que pide 4 atributos. 
		 * @param titulo, lleva el t�tulo de la canci�n.
		 * @param grupo, El grupo que canta la canci�n.
		 * @param duracion, Es la duraci�n de la canci�n en segundos.
		 * @param sonando, nos devuelve un valor "true" si est� sonando, y "false" si no.
		 */

		Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 par�metros
		{
			this.titulo = titulo;
			this.duracion = duracion;
			this.sonando = sonando;
			this.grupo = grupo;
		}
		/**
		 * M�todo que pone el atributo sonando a "true", reproduce la canci�n.
		 * @return, devuelve booleano indicando si se est� reproduciendo la canci�n.
		 */

		boolean reproducirCancion() {
			if (this.sonando) {
				return false;
			} else {
				this.sonando = true;
				return true;
			}
		}
		/**
		 * M�todo que pone el atributo sonando a "false", para la canci�n.
		 * @return, devuelve booleano indicando si para la canci�n.
		 */

		boolean pararCancion() {
			if (!this.sonando) {
				return false;
			} else {
				this.sonando = false;
				return true;
			}
		}
		/**
		// meter m�todos get/set/toString()
		 * 
		 * @return,devuelve t�tulo de la canci�n
		 */
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getGrupo() {
			return grupo;
		}

		public void setGrupo(String grupo) {
			this.grupo = grupo;
		}
		
		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		
		/**m�todo que devuelve si est� sonando la canci�n
		 * 
		 * @return, devuelve booleano indicando si suena la canci�n
		 */
		
		public boolean isSonando() {
			return sonando;
		}

		public void setSonando(boolean sonando) {
			this.sonando = sonando;
		}
		
		/**
		 * M�todo que compara que el t�tulo de la canci�n y el grupo para saber si la misma canci�n. 
		 * @param cancion, objeto canci�n.
		 * @return , devuelve booleano para saber si es la misma cancion.
		 */

		boolean MismaCancion(Cancion cancion) {
			if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
				return true;
			else
				return false;
		}
		
		/**
		 * M�todo para saber que canci�n es m�s larga.
		 * @param canciones, array de canciones.
		 * @return, devuelve  del array canciones la posici�n poxMax(el t�tulo de la canci�n m�s larga)
		 */
		public static String MayorDuracion(Cancion[] canciones) {
			int posMax = 0;
			int max = 0;
			for (int i = 0; i < canciones.length; i++) {
				if (canciones[i].duracion > max) {
					posMax = i;
					max = canciones[i].duracion;
				}
			}
			return canciones[posMax].titulo;

		}
		
		/** El m�todo SiguienteCanci�n pasa de un array de  canciones 
		 * y nos dir� cu�l es la siguiente canci�n..
		 * 
		 * @param canciones, array de canciones.
		 * @param titulo,	lleva el t�tulo de la canci�n.
		 * @return, devuelve  del array canciones la posici�n siguiente(el t�tulo de la canci�n siguiente)
		 */
		static String SiguienteCancion(Cancion[] canciones, String titulo) {
			int pos = 0;
			int siguiente = 0;
			for (int i = 0; i < canciones.length; i++) {
				if (titulo == canciones[i].titulo) {
					pos = i;
				}
			}
			if (pos == canciones.length - 1) {
				siguiente = 0;
			} else {
				siguiente = pos + 1;
			}
			return canciones[siguiente].titulo;
		}
		
		/**
		 * M�todo que devuelve informaci�n de la canci�n: t�tulo, autor, grupo, duraci�n y si est� sonando o no.
		 */

		@Override 
		public String toString() { 
			return "Datos de la canci�n [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion 
					+ ", sonando=" + sonando+ "]"; 
		}

}
