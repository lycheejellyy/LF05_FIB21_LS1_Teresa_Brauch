public class Artikeloverview {

    public static void main(String[] args) {

        Artikel art1 = new Artikel();
        Artikel art2 = new Artikel();

        art1.setBezeichnung("Himalayareis");
        art1.setNummer(12);
        art1.setEinkaufspreisInEuro(1.41);
        art1.setVerkaufspreisInEuro(1.78);
        art1.setSollBestand(100);
        art1.setIstBestand(90);

        art2.setBezeichnung("Frische Fische");
        art2.setNummer(581);
        art2.setEinkaufspreisInEuro(7.21);
        art2.setVerkaufspreisInEuro(12.45);
        art2.setSollBestand(80);
        art2.setIstBestand(77);

        System.out.println("Bezeichnung: " + art1.getBezeichnung());
        System.out.println("Artikelnummer: " + art1.getNummer());
        System.out.println("Einkaufspreis: " + art1.getEinkaufspreisInEuro());
        System.out.println("Verkaufspreis: " + art1.getVerkaufspreisInEuro());
        System.out.println("Sollbestand: " + art1.getSollBestand());
        System.out.println("Ist Bestand: " + art1.getIstBestand());
        System.out.println("Gewinn: " + art1.gewinnBerechnen());

        art1.bestellen();
        

        System.out.println("Bezeichnung: " + art2.getBezeichnung());
        System.out.println("Artikelnummer: " + art2.getNummer());
        System.out.println("Einkaufspreis: " + art2.getEinkaufspreisInEuro());
        System.out.println("Verkaufspreis: " + art2.getVerkaufspreisInEuro());
        System.out.println("Sollbestand: " + art2.getSollBestand());
        System.out.println("Ist Bestand: " + art2.getIstBestand());
        System.out.println("Gewinn: " + art2.gewinnBerechnen());

        art2.bestellen();
        

    }

}