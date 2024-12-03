package uva.tds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AgendaTest {
	
	Agenda agenda;
	Persona p;
	
	@BeforeEach
	void setUp() {
		agenda = new Agenda();
		p = new Persona("n", "a");
	}

	@Test
	void testAddContactoDatosNulos() {
		assertThrows(IllegalArgumentException.class, () -> {
			agenda.addContacto(null);
		});
	}
	
	@Test
	void testAddContactoNombreNulo() {
		p.setNombre(null);
		assertEquals(3,agenda.addContacto(p));
	}
	
	@Test
	void testAddContactoNombreVacio() {
		p.setNombre("");
		assertEquals(3,agenda.addContacto(p));
	}
	
	@Test
	void testAddContactoApellidoNulo() {
		p.setApellido(null);
		assertEquals(4,agenda.addContacto(p));
	}
	
	@Test
	void testAddContactoApellidoVacio() {
		p.setApellido("");
		assertEquals(4,agenda.addContacto(p));
	}
	
	@Test
	void testAddContactoValido() {
		assertEquals(0,agenda.addContacto(p));
		assertEquals("a",agenda.getContacto("n").getApellido());
	}
	
	@Test
	void testGetContactoNoExistente() {
		assertNull(agenda.getContacto("n"));
	}
	
	@Test
	void testGetContactoNoExistenteNoVacio() {
		agenda.addContacto(p);
		assertNull(agenda.getContacto("p"));
	}
	
	@Test
	void testModificarContactoValido() {
		agenda.addContacto(p);
		assertEquals(0,agenda.modificarApellido("n", "p"));
		assertEquals("p",agenda.getContacto("n").getApellido());
	}
	
	@Test
	void testModificarContactoNoExistente() {
		assertEquals(1,agenda.modificarApellido("n", "p"));
	}
	
	@Test
	void testModificarContactoNoExistenteNoVacio() {
		agenda.addContacto(p);
		assertEquals(1,agenda.modificarApellido("l", "p"));
	}

}
