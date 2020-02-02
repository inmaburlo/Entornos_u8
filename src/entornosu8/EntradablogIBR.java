
package entornosu8;

/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 01/02/2020 .
 * @author Inma
 * v3.8.22.
 */

public class EntradablogIBR {
    /**
     * separador es el carácter que separa ENTRADA DE del
     * nombre del autor
     */

	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	

    /**
     * Constructor de la clase. 
     * Recibe como parámetro el número de entrada(id),el nombre del autor de la entrada (autor)
     * y el texto que contiene(texto).Si el número de entrada es negativo, lanza una excepción.
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
	public EntradablogIBR(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

    /**
     * Devuelve los datos del objeto mediante un String
     * @return
     */
    @Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}

    /**
     * Devuelve el número de la entrada
     * @return
     */
	public int getId(){
		return this.id;
	}


    /**
     * Devuelve el texto completo de la entrada
     * @return
     */
	public String getTexto(){
		return this.texto;
	}

    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas
     * @return
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}


    /**
     * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return
     */
	public String devuelveAutor(){
		return this.autor;
	}
	
	}

