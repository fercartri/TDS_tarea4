package uva.tds;

import java.util.ArrayList;

/**
 * Clase que representa un contacto de una agenda con información de su nombre
 * apellido
 * 
 * @author marcorr
 * Refactorización: @author fercarm
 *
 */
public class Agenda {

	private ArrayList<Persona> contactos;

	/**
	 * Método de creación de una agenda
	 */
	public Agenda() {
		this.contactos = new ArrayList<>();
	}

	/**
	 * Añade un contacto a la agenda
	 * @param persona la persona a añadir
	 * @return 0 si se ha podido añadir el contacto, 1 si datosContacto es nulo, 2 si 
	 * datosContacto no tiene tamaño 2, 3 si el nombre es nulo o vacío, 4 si el apellido
	 * es nulo o vacío
	 */
	public int addContacto(Persona persona) {
		int result = 0;
		
		if(persona == null){
			result = 1;
		}
		else{
			this.contactos.add(persona);
		}
		
		
		return result;
	}

	/**
	 * Obtiene un contacto de la agenda que coincida con el nombre proporcionado
	 * @param nombre el nombre del contacto a buscar
	 * @return una Persona buscada o nulo si no existe
	 */
	public Persona getContacto(String nombre) {
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i).getNombre().equals(nombre)) {
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
			if(this.contactos.get(i).getApellido().equals(nombre)) {
				this.contactos.get(i).setApellido(nuevoApellido);
				return 0;
			}
		}
		return 1;
	}
	
	


}
