package uva.tds;

import java.util.ArrayList;

/**
 * Clase que representa un contacto de una agenda con información de su nombre
 * apellido
 * 
 * @author marcorr
 *
 */
public class Agenda {

	private ArrayList<String[]> contactos;

	/**
	 * Método de creación de una agenda
	 * 
	 */
	public Agenda() {
		this.contactos=new ArrayList<>();
	}

	/**
	 * Añade un contacto a la agenda
	 * @param datosContacto información del contacto. En la posicion 0, se
	 *                      proporciona el nombre en la posición 1 se proporciona el
	 *                      apellido
	 * @return 0 si se ha podido añadir el contacto, 1 si datosContacto es nulo, 2 si 
	 * datosContacto no tiene tamaño 2, 3 si el nombre es nulo o vacío, 4 si el apellido
	 * es nulo o vacío
	 */
	public int addContacto(String[] datosContacto) {
		int result = 0;
		if (datosContacto == null) {
			result = 1;
		} else {
			if (datosContacto.length != 2) {
				result = 2;
			} else {
				if (datosContacto[0] == null) {
					result = 3;
				} else {
					if (datosContacto[0].isEmpty()) {
						result = 3;
					} else {
						if (datosContacto[1] == null) {
							result = 4;
						} else {
							if (datosContacto[1].isEmpty()) {
								result = 4;
							}else {
								this.contactos.add(datosContacto);
							}
						}
					}
				}
			}
		}
		
		return result;
	}

	/**
	 * Obtiene un contacto de la agenda que coincida con el nombre proporcionado
	 * @param nombre el nombre del contacto a buscar
	 * @return El contacto buscado (nombre y apellido) o nulo si no existe
	 */
	public String[] getContacto(String nombre) {
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i)[0].equals(nombre)) {
				return this.contactos.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Modifica el apellido del contacto con el nombre proporcionado
	 * @param nombre El nombre del contacto a modificar
	 * @param nuevoApellido El nuevo apellido a asignar
	 * @return 1 si no existe el contacto con el nombre indicado y 0 si
	 * se ha realizado la modificación correctamente
	 */
	public int modificarApellido(String nombre,String nuevoApellido) {
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i)[0].equals(nombre)) {
				this.contactos.get(i)[1]=nuevoApellido;
				return 0;
			}
		}
		return 1;
	}
	
	


}
