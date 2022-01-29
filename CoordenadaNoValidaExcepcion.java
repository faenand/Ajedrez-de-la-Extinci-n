/**
 * Excepcion para coordenadas no validas
 * @author Fernando Mendoza Eslava
 * @version 1.0
 */

package ajedrez.excepciones;


public class CoordenadaNoValidaExcepcion extends Exception{

	/**
	* Excepcion para arrojar cuando una coordenada no es valida
	*/
	public CoordenadaNoValidaExcepcion(){
	}

	/**
	* Excepcion para arrojar cuando una coordenada no es valida, especificando el mensaje de la misma
	* @param msg -- El mensaje de la excepcion
	*/
	public CoordenadaNoValidaExcepcion(String msg) {
        super(msg);
    }
}
