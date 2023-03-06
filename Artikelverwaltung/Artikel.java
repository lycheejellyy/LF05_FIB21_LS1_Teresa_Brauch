public class Artikel {

    private String bezeichnung;
    private int nummer;
    private double einkaufspreisInEuro;
    private double verkaufspreisInEuro;
    private int sollBestand;
    private int istBestand;

    public Artikel() {

    }

    public void bestellen() {
        if (this.istBestand < (this.sollBestand / 100 * 80)) {
            this.istBestand = this.sollBestand;
            System.out.println("Es wurde nachbestellt!");
        } else {
            System.out.println("Es sind genügend Artikel vorhanden!");
        }
    }

    public double gewinnBerechnen() {
        double gewinn;
        gewinn = (this.verkaufspreisInEuro - this.einkaufspreisInEuro) * this.istBestand;
        return gewinn;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getNummer() {
        return this.nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public double getEinkaufspreisInEuro() {
        return this.einkaufspreisInEuro;
    }

    public void setEinkaufspreisInEuro(double einkaufspreisInEuro) {
        this.einkaufspreisInEuro = einkaufspreisInEuro;
    }

    public double getVerkaufspreisInEuro() {
        return this.verkaufspreisInEuro;
    }

    public void setVerkaufspreisInEuro(double verkaufspreisInEuro) {
        this.verkaufspreisInEuro = verkaufspreisInEuro;
    }

    public int getSollBestand() {
        return this.sollBestand;
    }

    public void setSollBestand(int sollBestand) {
        this.sollBestand = sollBestand;
    }

    public int getIstBestand() {
        return this.istBestand;
    }

    public void setIstBestand(int istBestand) {
        this.istBestand = istBestand;
    }

}
