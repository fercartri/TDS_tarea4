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
	 * @throws IllegalArgumentException si persona es null
	 */
	public void addContacto(Persona persona) {
		if(persona == null)
			throw new IllegalArgumentException();

		contactos.add(persona);
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
	 * @throws IllegalArgumentException si no existe una persona en la agenda con dicho nombre
	 */
	public void modificarApellido(String nombre, String nuevoApellido) {
		for(int i=0;i<this.contactos.size();i++) {
			if(this.contactos.get(i).getApellido().equals(nombre)) {
				this.contactos.get(i).setApellido(nuevoApellido);
				return;
			}
		}

		throw new IllegalArgumentException();
	}
	
	


}
