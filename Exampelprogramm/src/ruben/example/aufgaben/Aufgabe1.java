package ruben.example.aufgaben;

import java.util.Scanner;

public class Aufgabe1
{



	/* Aufgabe:
	 *  Erstelle ein Programm, das zwei Zufallszahlen (zwischen 1 und 5) generiert und addiert.
	 *  Der Nutzer kann dann eine Zahl zwischen 1 und 10 eingeben und versuchen die Zahl zu erraten.
	 * Zusatz:
	 *  Das Programm läuft unendlich lange (Nutzung einer Schleife).
	 */



	public static void main(String[] args)
	{
		
		int a, b, g, y = 0;
		
		a = (int) (Math.random()*5);
		b = (int) (Math.random()*5);	
		g = a + b;
		
		while (g != y){
			
			Scanner x = new Scanner( System.in );
			y = x.nextInt();
			
			
			hatGewonnen(y, g);
			
		}
	}
	
	
	
	
	
	static void hatGewonnen (int eingabe, int ergebnis)
	{
	
		if ( eingabe > 10) {System.out.println("kleiner als 10!");}
		else if ( eingabe < 0) {System.out.println("größer als 1!");}
		else if (ergebnis == eingabe) {System.out.println( "Die Zahl war richtig!! " );System.out.println( ergebnis );}
		else {System.out.println( "Die Zahl war falsch. " );
			if (eingabe > ergebnis) {System.out.println( "die Zahl ist kleiner!" );}
			else {System.out.println( "die Zahl ist größer!" );}
		}
			
	}


}

