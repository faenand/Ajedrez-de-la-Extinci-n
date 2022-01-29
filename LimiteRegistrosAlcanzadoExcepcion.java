/**
 * Excepcion para limite de registros alcanzado
 * @author Fernando Mendoza Eslava
 * @version 1.0
 */

package ajedrez.excepciones;


public class LimiteRegistrosAlcanzadoExcepcion extends Exception{

	/**
	* Excepcion para arrojar cuando se alcanzo el limite de registros
	*/
	public LimiteRegistrosAlcanzadoExcepcion(){
	}

	/**
	* Excepcion para arrojar cuando se alcanzo el limite de registros, especificando el mensaje de la misma
	* @param msg -- El mensaje de la excepcion
	*/
	public LimiteRegistrosAlcanzadoExcepcion(String msg) {
        super(msg);
    }
}
