package uva.tds;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class AgendaTest {
	
	Agenda agenda;
	Persona p;
	
	@BeforeEach
	void setUp() {
		agenda = new Agenda();
		p = new Persona("n", "a");
	}

	@Test
	void testAgendaAddContactoValido(){
		Persona extra = new Persona("X", "X");
		
		agenda.addContacto(extra);
		agenda.addContacto(p);

		assertEquals(agenda.getContacto("n"), p);
	}

	@Test
	void testAgendaAddContactoNoValidoPersonaNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			agenda.addContacto(null);
		});
	}

	@Test
	void testAgendaGetContactoNoValidoNombreNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			agenda.getContacto(null);
		});
	}

	@Test
	void testAgendaGetContactoNoValidoNombreNoExistente(){
		assertThrows(IllegalArgumentException.class, () -> {
			agenda.getContacto("No");
		});
	}

	@Test
	void testAgendaModificarApellidoValido(){
		agenda.addContacto(p);
		agenda.modificarApellido("n", "Nuevo");

		assertEquals(agenda.getContacto("n").getApellido(), "Nuevo");
	}

	@Test
	void testAgendaModificarApellidoNoValidoNombreNull(){
		agenda.addContacto(p);

		assertThrows(IllegalArgumentException.class, () -> {
			agenda.modificarApellido(null, "Nuevo");
		});
	}

	@Test
	void testAgendaModificarApellidoNoValidoApellidoNull(){
		agenda.addContacto(p);

		assertThrows(IllegalArgumentException.class, () -> {
			agenda.modificarApellido("n", null);
		});
	}

	@Test
	void testAgendaModificarApellidoNoValidoNombreNoExistente(){
		agenda.addContacto(p);

		assertThrows(IllegalArgumentException.class, () -> {
			agenda.modificarApellido("No", "Nuevo");
		});
	}
}