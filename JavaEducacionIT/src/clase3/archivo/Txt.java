
package clase3.archivo;

public class Txt extends Archivo {

	public Txt() {
		this.tipo = "TXT";
	}
	
	public Txt(String nombre, Long tamanio) {
		/*
		setNombre(nombre);
		
		setTamanio(tamanio);
		*/
		this.tipo = "TXT";
		
		this.nombre = nombre;
		
		this.tamanio = tamanio;
	}
}