
public class ArrayUebung {

	public static void main(String args[]) {

		// 1. Deklaration eines Arrays für ganze Zahlen.
		int[] myArray;

		// 2. Initialisierung des Arrays mit 100 Elementen.
		myArray = new int[100];

		// 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
		for (int i = 0; i < myArray.length; i++)
			System.out.println(myArray[i]);

		// 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
		for (int i = 0; i < myArray.length; i++)
			myArray[i] = i + 1;

		// 5. Geben Sie den Wert an der Stelle 89 des Arrays aus.
		System.out.println(myArray[88]);

		// 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
		myArray[49] = 1060;

		// Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays z
		//  2020.
		myArray[0] = 2020;
		myArray[myArray.length - 1] = 2020;

		// 7. Erneutes ausgeben des Arrayinhalts.
		// Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
		for (int i = 0; i < 100; i++)
			System.out.println("Index: " + i + " - Inhalt: " + myArray[i]);

		// 8. Berechnung des Durchschnitts aller Arrayelemente
		double average = 0;
		for (int i = 0; i < myArray.length; i++) {
			average += myArray[i];
		}
		average /= myArray.length;
		System.out.println("Durchschnitt = " + average);

	}

}