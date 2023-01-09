import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {
		
		//Variablen und Scanner Deklaration
		Scanner tastatur = new Scanner(System.in);
		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;
		
		//Willkommensmessage
		begruessung();
		//Fahrkarte auswählen
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		//Geldeingabe
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		//Fahrkartenausgabe
		fahrkartenausgabe();
		//Rueckgeldausgabe
		rueckgeldausgabe(eingezahlterGesamtbetrag, zuZahlenderBetrag);
		//Verabschiedungsmessage
		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
		tastatur.close();
	}
	
	
	//Methode für Willkommensmessage
	public static void begruessung() {
		System.out.println("Herzlich Willkommen!\n");
	}
	
	//Methode für Fahrkartenbestellung
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		double zuZahlenderBetrag = 0;
		int ticketanzahl;
		int artticket = 0;
		String ticketdescr = " ";
		System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\r\n"
				+ "  Kurzstrecke AB [2,00 EUR] (1)\r\n"
				+ "  Einzelfahrschein AB [3,00 EUR] (2)\r\n"
				+ "  Tageskarte AB [8,80 EUR] (3)\r\n"
				+ "  4-Fahrten-Karte AB [9,40 EUR] (4)");
		artticket = tastatur.nextInt();
		
		switch(artticket) {
		case 1: 
			zuZahlenderBetrag = 2;
			ticketdescr = "Kurzstrecke AB [2,00 EUR]";
			break;
		case 2:
			zuZahlenderBetrag = 3;
			ticketdescr = "Einzelfahrschein AB [3,00 EUR]";
			break;
		case 3:
			zuZahlenderBetrag = 8.80;
			ticketdescr = "Tageskarte AB [8,80 EUR]";
			break;
		case 4:
			zuZahlenderBetrag = 9.40;
			ticketdescr = "4-Fahrten-Karte AB [9,40 EUR]";
			break;
		default:
			System.out.println("Ungültige Angabe! Geben Sie eine Zahl zwischen 1-4 an!");
			System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\r\n"
					+ "  Kurzstrecke AB [2,00 EUR] (1)\r\n"
					+ "  Einzelfahrschein AB [3,00 EUR] (2)\r\n"
					+ "  Tageskarte AB [8,80 EUR] (3)\r\n"
					+ "  4-Fahrten-Karte AB [9,40 EUR] (4)");
			artticket = tastatur.nextInt();
		}
		//Ausgabe Ticketauswahl
		System.out.println("Deine Auswahl: " + ticketdescr);
		//Eingabe Ticketanzahl
		System.out.println("Anzahl der Fahrscheine(max 10): ");
		ticketanzahl = tastatur.nextInt();
		//Ticketeingabe nach falscher Eingabe wiederholen
			while(ticketanzahl > 10 || ticketanzahl < 1) {
				System.out.println("Ungültige Angabe! Geben Sie eine Zahl zwischen 1-10 an!");
				System.out.print("Anzahl der Fahrscheine(max 10): ");
				ticketanzahl = tastatur.nextInt();
			}
			
		zuZahlenderBetrag = zuZahlenderBetrag * ticketanzahl;
		return zuZahlenderBetrag;
	}
	
	//Methode für FahrkartenBezahlung
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double nochZuZahlen = 0.0;
		double eingezahlterGesamtbetrag = 0;
		double eingeworfeneMuenze;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.println("Noch zu zahlen: ");
			System.out.printf("%.2f", nochZuZahlen);
			System.out.print(" Euro\n");
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			if (eingeworfeneMuenze == 0.05 || eingeworfeneMuenze == 0.10 || eingeworfeneMuenze == 0.20 || eingeworfeneMuenze == 0.50 || eingeworfeneMuenze == 1 || eingeworfeneMuenze == 2 || eingeworfeneMuenze == 5 || eingeworfeneMuenze == 10 || eingeworfeneMuenze == 20) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else {
				System.out.println("Ungültige Eingabe. Wähle ein gültiges Zahlungsmittel!");
			}
		}
		return eingezahlterGesamtbetrag;
	}
	
	//Methode für Fahrkartenausgabe
	public static void fahrkartenausgabe() {
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}
	
	//Methode für Rueckgeldausgabe
	public static void rueckgeldausgabe(double eingezahlterGesamtbetrag, double zuZahlenderBetrag) {
		double rueckgabebetrag;
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.print("\nDer Rückgabebetrag in Höhe von ");
			System.out.printf("%.2f", rueckgabebetrag);
			System.out.print(" Euro\n");
			System.out.println("wird in folgenden Münzen und Scheinen ausgezahlt:");
			muenzRueckgabe(rueckgabebetrag);
		}
	}
	
	//Methode für Berechnung des Rueckgeldes
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
		while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
			System.out.println("2 Euro Münze");
			rueckgabebetrag = rueckgabebetrag - 2.0;
		}
		while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
			System.out.println("1 Euro Münze");
			rueckgabebetrag = rueckgabebetrag - 1.0;
		}
		while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
			System.out.println("50 Cent Münze");
			rueckgabebetrag = rueckgabebetrag - 0.5;
		}
		while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
			System.out.println("20 Cent Münze");
			rueckgabebetrag = rueckgabebetrag - 0.2;
		}
		while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
			System.out.println("10 Cent Münze");
			rueckgabebetrag = rueckgabebetrag - 0.1;
		}
		while (rueckgabebetrag >= 0.0491) { // 5-Cent-Münzen weil das Subtrahieren von doubles Probleme aufweist >:(
			System.out.println("5 Cent Münze");
			rueckgabebetrag = rueckgabebetrag - 0.05;
		}
	}
}


