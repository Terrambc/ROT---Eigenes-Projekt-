package ESA_Testing_ROT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdressdatenTest {

	Adressdaten informationen; 
	
	@BeforeEach
	void setUp() throws Exception {
		informationen = new Adressdaten();
	}

	@Test
	void testPersonData() {
		Throwable exception = assertThrows(IllegalArgumentException.class, 
				()-> {Adressdaten.personData("Christina","");});
		System.out.println(exception + "\n");
		
	}

	@Test
	void testHundeData() {
		assertEquals(informationen.hundeData("Merlin"), "Woody", "Hundename ist nicht richtig!");
	}

}
