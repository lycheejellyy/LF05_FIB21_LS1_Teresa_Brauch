import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		// Variablen und Scanner Deklaration
		Scanner tastatur = new Scanner(System.in);
		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;

		// Willkommensmessage
		begruessung();
		// Fahrkarte ausw�hlen
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		// Geldeingabe
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		// Fahrkartenausgabe
		fahrkartenausgabe();
		// Rueckgeldausgabe
		rueckgeldausgabe(eingezahlterGesamtbetrag, zuZahlenderBetrag);
		// Verabschiedungsmessage
		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir w�nschen Ihnen eine gute Fahrt.");
		tastatur.close();
	}

	// Methode f�r Willkommensmessage
	public static void begruessung() {
		System.out.println("Herzlich Willkommen!\n");
	}
	
	// Methode f�r Fahrkartenbestellung
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		double zuZahlenderBetrag = 0;
		int ticketanzahl;
		int artticket = 0;
		String ticketdescr = " ";
		String[] fahrkartenNamen = {
				"Einzelfahrschein AB",
				"Einzelfahrschein BC",
				"Einzelfahrschein ABC",
				"Kurzstrecke AB",
				"Tageskarte AB",
				"Tageskarte BC",
				"Tageskarte ABC",
				"4-Fahrten-Karte AB",
				"4-Fahrten-Karte BC",
				"4-Fahrten-Karte ABC",
				"Kleingruppen-Tageskarte AB",
				"Kleingruppen-Tageskarte BC",
				"Kleingruppen-Tageskarte ABC"
		};

		Double[] fahrkartenPreise = {
				3.00,
				3.50,
				3.80,
				2.00,
				8.60,
				9.20,
				10.00,
				9.40,
				12.60,
				13.80,
				25.50,
				26.00,
				26.50
		};

		//Ausgabe Auswahlmöglichkeiten
		System.out.println("W�hlen Sie ihre Wunschfahrkarte f�r Berlin aus: \r\n");
		for (int i = 0; i < fahrkartenNamen.length; i++) {
			System.out.print("\n" + fahrkartenNamen[i] + " [" );
			System.out.printf("%.2f", fahrkartenPreise[i]);
			System.out.print(" EUR](" + (i + 1) + ")\r\n");
		}

		//Usereingabe & Überprüfung ob Eingabe valide
		do {
			if(artticket < 0 || artticket > fahrkartenNamen.length) {
				System.out.println("Ungültige Eingabe! Geben Sie eine Zahl zwischen 1-" + fahrkartenNamen.length + " an!");
			}
			artticket = tastatur.nextInt();
		}
		while (artticket < 0 || artticket > fahrkartenNamen.length);

		ticketdescr = fahrkartenNamen[artticket-1];
		zuZahlenderBetrag = fahrkartenPreise[artticket-1];
		
		// Ausgabe Ticketauswahl
		System.out.println("Deine Auswahl: " + ticketdescr);
		// Eingabe Ticketanzahl
		System.out.println("Anzahl der Fahrscheine(max 10): ");
		ticketanzahl = tastatur.nextInt();
		// Ticketeingabe nach falscher Eingabe wiederholen
		while (ticketanzahl > 10 || ticketanzahl < 1) {
			System.out.println("Ungültige Angabe! Geben Sie eine Zahl zwischen 1-10 an!");
			System.out.print("Anzahl der Fahrscheine(max 10): ");
			ticketanzahl = tastatur.nextInt();
		}

		zuZahlenderBetrag = zuZahlenderBetrag * ticketanzahl;
		return zuZahlenderBetrag;
	}

	// Methode f�r FahrkartenBezahlung
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double nochZuZahlen = 0.0;
		double eingezahlterGesamtbetrag = 0;
		double eingeworfeneMuenze;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.println("Noch zu zahlen: ");
			System.out.printf("%.2f", nochZuZahlen);
			System.out.print(" Euro\n");
			System.out.print("Eingabe in Euro (mind. 5 Cent, h�chstens 20 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			if (eingeworfeneMuenze == 0.05 || eingeworfeneMuenze == 0.10 || eingeworfeneMuenze == 0.20
					|| eingeworfeneMuenze == 0.50 || eingeworfeneMuenze == 1 || eingeworfeneMuenze == 2
					|| eingeworfeneMuenze == 5 || eingeworfeneMuenze == 10 || eingeworfeneMuenze == 20) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else {
				System.out.println("Ung�ltige Eingabe. W�hle ein g�ltiges Zahlungsmittel!");
			}
		}
		return eingezahlterGesamtbetrag;
	}

	// Methode f�r Fahrkartenausgabe
	public static void fahrkartenausgabe() {
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}

	// Methode f�r Rueckgeldausgabe
	public static void rueckgeldausgabe(double eingezahlterGesamtbetrag, double zuZahlenderBetrag) {
		double rueckgabebetrag;
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.print("\nDer R�ckgabebetrag in H�he von ");
			System.out.printf("%.2f", rueckgabebetrag);
			System.out.print(" Euro\n");
			System.out.println("wird in folgenden M�nzen und Scheinen ausgezahlt:");
			muenzRueckgabe(rueckgabebetrag);
		}
	}

	// Methode f�r Berechnung des Rueckgeldes
	public static void muenzRueckgabe(double rueckgabebetrag) {
		while (rueckgabebetrag >= 20.0) { // 20-Euro-Scheine
			System.out.println("20 Euro Schein");
			rueckgabebetrag = rueckgabebetrag - 20.0;
		}
		while (rueckgabebetrag >= 10.0) { // 10-Euro-Scheine
			System.out.println("10 Euro Schein");
			rueckgabebetrag = rueckgabebetrag - 10.0;
		}
		while (rueckgabebetrag >= 5.0) { // 5-Euro-Scheine
			System.out.println("5 Euro Schein");
			rueckgabebetrag = rueckgabebetrag - 5.0;
		}
		while (rueckgabebetrag >= 2.0) { // 2-Euro-M�nzen
			System.out.println("2 Euro M�nze");
			rueckgabebetrag = rueckgabebetrag - 2.0;
		}
		while (rueckgabebetrag >= 1.0) { // 1-Euro-M�nzen
			System.out.println("1 Euro M�nze");
			rueckgabebetrag = rueckgabebetrag - 1.0;
		}
		while (rueckgabebetrag >= 0.5) { // 50-Cent-M�nzen
			System.out.println("50 Cent M�nze");
			rueckgabebetrag = rueckgabebetrag - 0.5;
		}
		while (rueckgabebetrag >= 0.2) { // 20-Cent-M�nzen
			System.out.println("20 Cent M�nze");
			rueckgabebetrag = rueckgabebetrag - 0.2;
		}
		while (rueckgabebetrag >= 0.1) { // 10-Cent-M�nzen
			System.out.println("10 Cent M�nze");
			rueckgabebetrag = rueckgabebetrag - 0.1;
		}
		while (rueckgabebetrag >= 0.0491) { // 5-Cent-M�nzen weil das Subtrahieren von doubles Probleme aufweist >:(
			System.out.println("5 Cent M�nze");
			rueckgabebetrag = rueckgabebetrag - 0.05;
		}
	}
}
