package uva.tds;

/**
 * Clase que representa una persona con nombre y apellido
 * @author fercarm
 */
public class Persona {
    
    private String nombre;
    private String apellido;

    /**
     * Construye un nuevo objeto Persona
     * @param nombre el nombre de dicha persona
     * @param apellido el apellido de dicha persona
     * @throws IllegalArgumentException si nombre es null
     * @throws IllegalArgumentException si apellido es null
     * @throws IllegalArgumentException si nombre es la cadena vacia
     * @throws IllegalArgumentException si apellido es la cadena vacia
     */
    public Persona(String nombre, String apellido){
        if(nombre == null || apellido == null)
            throw new IllegalArgumentException();

        if(nombre.length() < 1 || apellido.length() < 1)
            throw new IllegalArgumentException();

        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Consulta el nombre de la persona
     * @return un String con dicho nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Consulta el apellido de la persona
     * @return un String con dicho apellido
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * Modifica el nombre de la persona
     * @param nombre el nuevo nombre
     * @throws IllegalArgumentException si nombre es null
     * @throws IllegalArgumentException si nombre es la cadena vacia
     */
    public void setNombre(String nombre){
        if(nombre == null)
            throw new IllegalArgumentException();

        if(nombre.length() < 1)
            throw new IllegalArgumentException();

        this.nombre = nombre;
    }
    
    /**
     * Modifica el apellido de la persona
     * @param apellido el nuevo apellido
     * @throws IllegalArgumentException si apellido es null
     * @throws IllegalArgumentException si apellido es la cadena vacia
     */
    public void setApellido(String apellido){
        if(apellido == null)
            throw new IllegalArgumentException();

        if(apellido.length() < 1)
            throw new IllegalArgumentException();

        this.apellido = apellido;
    }
}
