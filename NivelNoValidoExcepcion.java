/**
 * Excepcion para niveles no validos
 * @author Fernando Mendoza Eslava
 * @version 1.0
 */

//package ajedrez.excepciones;

public class NivelNoValidoExcepcion extends Exception{

	/**
	* Excepcion para arrojar cuando un nivel no es valido
	*/
	public NivelNoValidoExcepcion(){
	}

	/**
	* Excepcion para arrojar cuando un nivel no es valido, especificando el mensaje de la misma
	* @param msg -- El mensaje de la excepcion
	*/
	public NivelNoValidoExcepcion(String msg) {
        super(msg);
    }
}
