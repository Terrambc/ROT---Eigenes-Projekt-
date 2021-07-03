package DasPizzaProblem;

public class Backofenverteilung {
	
	Backofen ofen;
	
	public Backofenverteilung(Backofen ofen){
		 this. ofen = ofen;
		}
	
	
	//Wieviele Pizzen können bei x Öfen gleichzeitig gebacken werden?
	public int berechneAnzahlderPizzas(int mengeBackofen) {
		int anzahlPizzas = ofen.backofenMenge(mengeBackofen);
		return anzahlPizzas;
	}
	

}
