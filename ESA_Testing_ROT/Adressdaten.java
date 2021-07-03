package ESA_Testing_ROT;



/**
 * 
 * @author Christina.Griegel
 *
 */


public class Adressdaten {


	public static void main(String[] args) {
		
		personData("Christina", "Test");
		hundeData("Merlin");
	}
	
	
	public static String personData(String vorname, String nachname) {

	if (vorname.equals("") && nachname.equals("")) {
		throw new IllegalArgumentException("Wollen Sie Ihren Namen nicht mitteilen? Vorname und Nachname fehlt!");	
	}
			
	if (vorname.equals("")) {
		throw new IllegalArgumentException("Der Vorname fehlt!");
	}
	
	if (nachname.equals("")) {
		throw new IllegalArgumentException("Der Nachname fehlt!");
	}
	

		System.out.println("Name: " + vorname + " " + nachname);
		return vorname + nachname;
		
	}

	public static String hundeData(String hundename){
		
		System.out.println("Hund: " + hundename);
		return hundename;		
	}
}
