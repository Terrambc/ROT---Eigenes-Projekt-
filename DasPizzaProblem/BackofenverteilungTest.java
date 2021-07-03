package DasPizzaProblem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BackofenverteilungTest {

	Backofenverteilung menge; 


	@Test
	void testBerechneAnzahlderPizzas() {
		Backofen ofen = mock(Backofen.class);
		when(ofen.backofenMenge(3)).thenReturn(6);
		Backofenverteilung menge = new Backofenverteilung(ofen);
		
    	assertEquals(menge.berechneAnzahlderPizzas(3), 6, "Es ist genau die gewünschte Anzahl von Pizzas möglich.");
	
	}

}
