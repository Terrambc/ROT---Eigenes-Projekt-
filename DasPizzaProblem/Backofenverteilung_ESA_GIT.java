package DasPizzaProblem;

public class Backofenverteilung {
	
	Backofen ofen;
	
	public Backofenverteilung(Backofen ofen){
		 this. ofen = ofen;
		}
	
	
	//Wieviele Pizzen k�nnen bei x �fen gleichzeitig gebacken werden?
	public int berechneAnzahlderPizzas(int mengeBackofen) {
		int anzahlPizzas = ofen.backofenMenge(mengeBackofen);
		return anzahlPizzas;
	}
	

}
