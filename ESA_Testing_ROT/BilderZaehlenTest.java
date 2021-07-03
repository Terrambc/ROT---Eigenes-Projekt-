package ESA_Testing_ROT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BilderZaehlenTest {

	BilderZaehlen mengeBilder;
	
	@BeforeEach
	void setUp() throws Exception {
		mengeBilder = new BilderZaehlen();
		
	}

	@ParameterizedTest
	@CsvSource ({"Ob der Author hier Bilder versteckt hat? (Picture001)"})
	void gibtEsBilder(String bilderVorhanden) {
		
		//Act
		boolean sindBilderVorhanden = mengeBilder.validBilder(bilderVorhanden);
		
		//Assert
		assertTrue(sindBilderVorhanden, "Es sind keine Bilder vorhanden!");
	}
	
	
	@Test
	void anzahlDerBilder() {
		String anzahl = "Und hier haben wir Bilder (Picture) gemacht.";
		int expectedNumber = 1;
		assertEquals(BilderZaehlen.anzahlDerBilder(anzahl),expectedNumber, "Es wurden mehr Bilder erwartet.");
	}

}
