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
	 * @return la persona buscada
	 * @throws IllegalArgumentException si nombre es null
	 * @throws IllegalArgumentException si no existe ninguna persona con dicho nombre en la agenda
	 */
	public Persona getContacto(String nombre) {
		if(nombre == null)
			throw new IllegalArgumentException();

		for(Persona p : contactos)
			if(p.getNombre().equals(nombre))
				return p;

		throw new IllegalArgumentException();
	}
	
	/**
	 * Modifica el apellido del contacto con el nombre proporcionado
	 * @param nombre El nombre del contacto a modificar
	 * @param nuevoApellido El nuevo apellido a asignar
	 * @throws IllegalArgumentException si nombre es null
	 * @throws IllegalArgumentException si apellido es null
	 * @throws IllegalArgumentException si no existe ninguna persona con dicho nombre en la agenda
	 */
	public void modificarApellido(String nombre, String nuevoApellido) {
		if(nombre == null || nuevoApellido == null)
			throw new IllegalArgumentException();

		for(Persona p : contactos){
			if(p.getNombre().equals(nombre)){
				p.setApellido(nuevoApellido);
				return;
			}
		}

		throw new IllegalArgumentException();
	}
}
