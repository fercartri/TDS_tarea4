package uva.tds;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    void testPersonaConstructorValido(){
        Persona p = new Persona("N", "A");

        assertEquals(p.getNombre(), "N");
        assertEquals(p.getApellido(), "A");
    }

    @Test
    void testPersonaConstructorNoValidoNombreNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            Persona p = new Persona(null, "A");
        });
    }

    @Test
    void testPersonaConstructorNoValidoApellidoNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            Persona p = new Persona("A", null);
        });
    }

    @Test
    void testPersonaSetNombreValido(){
        Persona p = new Persona("N", "A");

        p.setNombre("Nuevo");

        assertEquals(p.getNombre(), "Nuevo");
    }

    @Test
    void testPersonaSetNombreNoValidoNull(){
        Persona p = new Persona("N", "A");

        assertThrows(IllegalArgumentException.class, () -> {
            p.setNombre(null);
        });
    }

    @Test
    void testPersonaSetApellidoValido(){
        Persona p = new Persona("N", "A");

        p.setApellido("Nuevo");

        assertEquals(p.getApellido(), "Nuevo");
    }

    @Test
    void testPersonaSetApellidoNoValidoNull(){
        Persona p = new Persona("N", "A");

        assertThrows(IllegalArgumentException.class, () -> {
            p.setApellido(null);
        });
    }
}
