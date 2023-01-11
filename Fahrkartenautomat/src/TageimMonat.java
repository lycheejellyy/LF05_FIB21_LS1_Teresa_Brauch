import java.util.Scanner;

public class TageimMonat {
	public static void main(String[] args) {
		int tage = 0;
		int monat;
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Wie lautet der Monat (1-12): ");
		monat = tastatur.nextInt();

		switch (monat) {
			case 1, 3, 5, 6, 8, 10, 12:
				tage = 31;
				break;
			case 4, 7, 9, 11:
				tage = 30;
				break;
			case 2:
				tage = 28;
				break;
			default:
				System.out.println("Ung�ltige Eingabe!");
		}
		;

		// ...

		System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
		tastatur.close();
	}
}