package ruben.exampel;



public class Schleifen
{



	public static void main(String[] args)
	{
		
		/* Mit Schleifen lassen sich bestimmte Operationen die oft
		 * hintereinander ablaufen einfach und effizient realisieren.
		 * Es gibt drei verschiedene Schleifen:
		 *  - while > vom Kopf aus ausgef�hrt (Bedingung wird erst �berpr�ft, wenn zutreffend wird erst dann Schleife ausgef�hrt
		 *  - do-while > vom Fu� aus ausgef�hrt (Schleife wird erst ausgef�hrt und dann Bedingung gepr�ft)
		 *  - for > Z�hlschleife, die einfach und �bersichtlich eine bekannte Menge an Wiederholungen ausf�hrt
		 */
		
		int x = 5, y = 1;
		
		
		//f�nf ausgaben, da von 5 bis 1 gez�hlt wird!
		while (x > 0)
		{
			System.out.print( x );
			x--;
		}
		
		
		//eine Ausgabe, obwohl y==1, da Bedingug erst nach erster Ausf�hrung �berpr�ft wird!
		do
		{
			System.out.print( y );
		} while (y != 1);
		
		
		//drei Ausgaben, da von a=0 bis a=4 gez�hlt wird (0, 1, 2)
		for (int a = 0; a < 3; a++)
		{
			System.out.print( a );
		}
		
	}



}
