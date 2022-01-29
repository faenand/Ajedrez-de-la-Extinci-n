/**
 * Excepcion para eliminaciones en un Tablero no validas
 * @author Fernando Mendoza Eslava
 * @version 1.0
 */

package ajedrez.excepciones;

public class EliminacionInvalidaExcepcion extends Exception{

	/**
	* Excepcion para arrojar cuando una eliminacion no es valida
	*/
	public EliminacionInvalidaExcepcion(){
	}

	/**
	* Excepcion para arrojar cuando una eliminacion no es valida, especificando el mensaje de la misma
	* @param msg -- El mensaje de la excepcion
	*/
	public EliminacionInvalidaExcepcion(String msg) {
        super(msg);
    }
}
