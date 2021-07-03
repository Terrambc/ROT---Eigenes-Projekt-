package ESA_Testing_ROT;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class BerechnungHonorarAuthorTest {

	BerechnungHonorarAuthor datenAuthor;
	
	@BeforeEach
	void setUp() throws Exception {
		datenAuthor = new BerechnungHonorarAuthor();
	}

	@ParameterizedTest
	@CsvSource ({"Das ist ein Test! Wie immer ohne Gewähr."}) 
	void isTextValid(String text) {
		
					
		//Act
		boolean isTextValid = datenAuthor.validText(text);
		
		//Assert
		assertTrue(isTextValid, "Das ist nicht korrekt");
		
	}
	
	@Test
	void isHonorarDouble() {
		//Arrange
		double number = 6.00;
		double moneyNumber = 6.00;
		
		
		//Assert
		assertEquals(BerechnungHonorarAuthor.honorarSumme(number),moneyNumber, "Es wurde eine andere Summe erwartet.");
	}

}
