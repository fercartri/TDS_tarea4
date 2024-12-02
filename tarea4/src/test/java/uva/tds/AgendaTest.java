package uva.tds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AgendaTest {
	
	Agenda agenda;
	String[] datosContacto;
	
	@BeforeEach
	void setUp() {
		agenda=new Agenda();
		datosContacto=new String[2];
		datosContacto[0]="n";
		datosContacto[1]="a";
	}

	@Test
	void testAddContactoDatosNulos() {
		assertEquals(1,agenda.addContacto(null));
	}
	
	@Test
	void testAddContactoDatosSizeIncorrecta() {
		assertEquals(2,agenda.addContacto(new String[3]));
	}
	
	@Test
	void testAddContactoNombreNulo() {
		datosContacto[0]=null;
		assertEquals(3,agenda.addContacto(datosContacto));
	}
	
	@Test
	void testAddContactoNombreVacio() {
		datosContacto[0]="";
		assertEquals(3,agenda.addContacto(datosContacto));
	}
	
	@Test
	void testAddContactoApellidoNulo() {
		datosContacto[1]=null;
		assertEquals(4,agenda.addContacto(datosContacto));
	}
	
	@Test
	void testAddContactoApellidoVacio() {
		datosContacto[1]="";
		assertEquals(4,agenda.addContacto(datosContacto));
	}
	
	@Test
	void testAddContactoValido() {
		assertEquals(0,agenda.addContacto(datosContacto));
		assertEquals("a",agenda.getContacto("n")[1]);
	}
	
	@Test
	void testGetContactoNoExistente() {
		assertNull(agenda.getContacto("n"));
	}
	
	@Test
	void testGetContactoNoExistenteNoVacio() {
		agenda.addContacto(datosContacto);
		assertNull(agenda.getContacto("p"));
	}
	
	@Test
	void testModificarContactoValido() {
		agenda.addContacto(datosContacto);
		assertEquals(0,agenda.modificarApellido("n", "p"));
		assertEquals("p",agenda.getContacto("n")[1]);
	}
	
	@Test
	void testModificarContactoNoExistente() {
		assertEquals(1,agenda.modificarApellido("n", "p"));
	}
	
	@Test
	void testModificarContactoNoExistenteNoVacio() {
		agenda.addContacto(datosContacto);
		assertEquals(1,agenda.modificarApellido("l", "p"));
	}

}
