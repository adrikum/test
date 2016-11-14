package ruben.exampel;

import java.util.Scanner;



public class Tag1
{



	// main-Methode beginnt
	public static void main(String[] args)
	{
		
		
					/* Starte das Programm zuvor ein zwei mal, um dessen
					 * Funktionsweise zu erleben. Sollte das Programm dir
					 * zu unübersichtlich sein, füge ein paar Leerzeilen
					 * zwischen den Befehlen hinzu!
					 * 
					 * 	Üben kannst du dann in einer separaten Datei unter
					 * 	 ruben.example.aufgaben  Aufgabe1.java
					 */
		
		
		
		
		// Erstellen eines Scanners, der später Benutzereingaben in der Konsole erfassen kann
		Scanner s = new Scanner( System.in );
		
		
		
		// Erstellen der Variablen vom Typ 'int' - Ganzzahlen
		int zahl1;
		int zahl2;
		int zahlGesamt;
		int eingabe;
		
		
		
		// Iniziieren der Variablen (Wert zuweisen) indem man eine Zufallszahl zwischen eins und fünf in ihr speichert
		zahl1 = (int) (Math.random()*5);
		zahl2 = (int) (Math.random()*5);
		
		
		// 'zahl1' und 'zahl2' addiert in 'zahlGesamt' speichern
		zahlGesamt = zahl1 + zahl2;
		
		
		
		// Ausgabe um den Benutzer zu informieren und eingabe durch den Scanner, die in 'eingabe' gespeichert wird
		System.out.print( "Versuche die Zahl zwischen 1 und 10 zu erraten: " );
		eingabe = s.nextInt();
		
		
		
		// Überprüfen ob die Eingabe größer als 10 oder kleiner als 0 ist.
		if ( eingabe < 1 || eingabe > 10) {
			System.out.println( "Fehlerhafte Eingabe!" );
		}
		
		
		// Überprüfen ob Nutzer gewonnen oder verloren hat
		else if ( eingabe == zahlGesamt ) {
			System.out.println( " gewonnen!" );
		} else {
			System.out.println( " verlohren!" );
		}
			// -> an dieser Stelle nur "else" da ja nach dem 'gewonnen!' nur noch 'verloren!' kommen kann!
		
		
		
		
					/* Möchte man das Programm nun unendlich lang machen,
					 * umfasst man den gesamten oberen Block einfach mit
					 * einer "while (0==0) { ... }"-Schleife!
					 */
		
		
	}
	// main-Methode endet



}
