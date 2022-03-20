package paquete1;
/**
 * Clase Cancion para construir canciones y sus métodos.
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
		 * Constructor por defecto que inicializa título vacío, duración cero 
		 * y no está sonando, que le da un valor inicial "false".
		 */

		Cancion() // Constructor sin parámetros
		{
			this.titulo = "";
			this.duracion = 0;
			this.sonando = false;
		}
		/**
		 * Constructor que pide 2 atributos, titulo de la canción y duración de la canción.
		 * @param titulo, lleva el título de la canción.
		 * @param duracion, Es la duración de la canción en segundos.
		 */

		Cancion(String titulo, int duracion)// constructor con 2 parámetros
		{
			this.titulo = titulo;
			this.duracion = duracion;
			this.sonando = false;
		}
		/**
		 * Constructor que pide 4 atributos. 
		 * @param titulo, lleva el título de la canción.
		 * @param grupo, El grupo que canta la canción.
		 * @param duracion, Es la duración de la canción en segundos.
		 * @param sonando, nos devuelve un valor "true" si está sonando, y "false" si no.
		 */

		Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
		{
			this.titulo = titulo;
			this.duracion = duracion;
			this.sonando = sonando;
			this.grupo = grupo;
		}
		/**
		 * Método que pone el atributo sonando a "true", reproduce la canción.
		 * @return, devuelve booleano indicando si se está reproduciendo la canción.
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
		 * Método que pone el atributo sonando a "false", para la canción.
		 * @return, devuelve booleano indicando si para la canción.
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
		// meter métodos get/set/toString()
		 * 
		 * @return,devuelve título de la canción
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
		
		/**método que devuelve si está sonando la canción
		 * 
		 * @return, devuelve booleano indicando si suena la canción
		 */
		
		public boolean isSonando() {
			return sonando;
		}

		public void setSonando(boolean sonando) {
			this.sonando = sonando;
		}
		
		/**
		 * Método que compara que el título de la canción y el grupo para saber si la misma canción. 
		 * @param cancion, objeto canción.
		 * @return , devuelve booleano para saber si es la misma cancion.
		 */

		boolean MismaCancion(Cancion cancion) {
			if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
				return true;
			else
				return false;
		}
		
		/**
		 * Método para saber que canción es más larga.
		 * @param canciones, array de canciones.
		 * @return, devuelve  del array canciones la posición poxMax(el título de la canción más larga)
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
		
		/** El método SiguienteCanción pasa de un array de  canciones 
		 * y nos dirá cuál es la siguiente canción..
		 * 
		 * @param canciones, array de canciones.
		 * @param titulo,	lleva el título de la canción.
		 * @return, devuelve  del array canciones la posición siguiente(el título de la canción siguiente)
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
		 * Método que devuelve información de la canción: título, autor, grupo, duración y si está sonando o no.
		 */

		@Override 
		public String toString() { 
			return "Datos de la canción [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion 
					+ ", sonando=" + sonando+ "]"; 
		}

}
