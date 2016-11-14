package ruben.exampel;



public class Schleifen
{



	public static void main(String[] args)
	{
		
		/* Mit Schleifen lassen sich bestimmte Operationen die oft
		 * hintereinander ablaufen einfach und effizient realisieren.
		 * Es gibt drei verschiedene Schleifen:
		 *  - while > vom Kopf aus ausgeführt (Bedingung wird erst überprüft, wenn zutreffend wird erst dann Schleife ausgeführt
		 *  - do-while > vom Fuß aus ausgeführt (Schleife wird erst ausgeführt und dann Bedingung geprüft)
		 *  - for > Zählschleife, die einfach und übersichtlich eine bekannte Menge an Wiederholungen ausführt
		 */
		
		int x = 5, y = 1;
		
		
		//fünf ausgaben, da von 5 bis 1 gezählt wird!
		while (x > 0)
		{
			System.out.print( x );
			x--;
		}
		
		
		//eine Ausgabe, obwohl y==1, da Bedingug erst nach erster Ausführung überprüft wird!
		do
		{
			System.out.print( y );
		} while (y != 1);
		
		
		//drei Ausgaben, da von a=0 bis a=4 gezählt wird (0, 1, 2)
		for (int a = 0; a < 3; a++)
		{
			System.out.print( a );
		}
		
	}



}
