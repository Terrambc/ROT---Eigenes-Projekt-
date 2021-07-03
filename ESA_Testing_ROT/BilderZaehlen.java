package ESA_Testing_ROT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BilderZaehlen {

	public static void main (String[] args) throws IOException{
		ArrayList<String> arrayTextDatei = new ArrayList<String>();
		BufferedReader textBilder = new BufferedReader(new FileReader("testText.txt"));
		String zeile = textBilder.readLine();
		
		 while(zeile != null){
            arrayTextDatei.add(String.valueOf(zeile));
            zeile = textBilder.readLine();
		 }
		
		 String kompletterText = String.join("", arrayTextDatei);
		
		 validBilder(kompletterText);
		 anzahlDerBilder(kompletterText);
		 
		 
		 
		 		 
		 textBilder.close();
		
		 
	}
	
	public static boolean validBilder(String text) {
		String[] einzelneWoerter = text.split(" ");
		boolean wert = false;
		
		for (int i=0; i<einzelneWoerter.length; i++) {
			if (einzelneWoerter[i].contains("Picture")) {
				wert = true;	
			} 
		}
		System.out.println(wert);
		return wert;
		    
	}
	
	public static int anzahlDerBilder(String text) {
		String[] einzelneWoerter = text.split(" ");
		int counter = 0;
		
		for (int i=0; i<einzelneWoerter.length; i++) {
			if (einzelneWoerter[i].contains("Picture")) {
				counter++;
			}
		}

		System.out.println(counter);
		return counter;
		
	}
	

}


