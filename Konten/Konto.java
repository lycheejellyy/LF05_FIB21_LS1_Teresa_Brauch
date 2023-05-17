public class Konto {
    private String name;
    private String adresse;
    private String kunde_seit;


    public Konto() {
    }

    public Konto(String name, String adresse, String kunde_seit) {
        this.name = name;
        this.adresse = adresse;
        this.kunde_seit = kunde_seit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getKunde_seit() {
        return this.kunde_seit;
    }

    public void setKunde_seit(String kunde_seit) {
        this.kunde_seit = kunde_seit;
    }

}
