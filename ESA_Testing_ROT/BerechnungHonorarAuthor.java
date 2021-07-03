package ESA_Testing_ROT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BerechnungHonorarAuthor {

	public static void main (String[] args) throws IOException{
		ArrayList<String> arrayTextDatei = new ArrayList<String>();
		
		BufferedReader textAuthor = new BufferedReader(new FileReader("testText.txt"));
		String zeile = textAuthor.readLine();
		
		 while(zeile != null){
             arrayTextDatei.add(String.valueOf(zeile));
             zeile = textAuthor.readLine();
		 }
		
		 String zeichenText = String.join("", arrayTextDatei);
		 
		 
		 countCharsOhneLeerzeichen(zeichenText);
		 		 
		 textAuthor.close();
		
		 
	}
	
	public boolean validText (String text) {
		
		if (text.equals("")) {
			return false; 
		} else {
			return true;
			}		
	}
	

	public static double countCharsOhneLeerzeichen(String text) {
        
		//System.out.println(text.replace(" ", "").length());
		//System.out.println(text);
		long numberZeichen = text.replace(" ", "").length();
		
		return honorarSumme(numberZeichen);
		
		
	}

	public static long honorarSumme(double numberZeichen) {
		var honorar = numberZeichen * 1.00;
		
		System.out.println("Das Honorar beträgt: " + honorar + " €.");
		
		return (long) honorar;
	}
	
}
