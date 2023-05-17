import java.util.ArrayList;

public class Raumschiff {
    private int photonentorpedoAnzahl;
    private int energieversorgungInProzent;
    private int schildeInProzent;
    private int huelleInProzent;
    private int lebenserhaltungssystemeInProzent;
    private int androidenAnzahl;
    private String schiffsname;
    private ArrayList<Ladung> ladungsverzeichnis;
    private ArrayList<String> broadcastKommunikator;

    public void Raumschiff() {

    }

    // Konstruktor
    public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent,
            int huelleInProzent, int lebenserhaltungssystemeInProzent, int androidenAnzahl, String schiffsname,
            ArrayList<Ladung> ladungsverzeichnis) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahl;
        this.energieversorgungInProzent = energieversorgungInProzent;
        this.schildeInProzent = schildeInProzent;
        this.huelleInProzent = huelleInProzent;
        this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
        this.androidenAnzahl = androidenAnzahl;
        this.schiffsname = schiffsname;
        this.ladungsverzeichnis = ladungsverzeichnis;
    }

    // Getter & Setter
    public int getPhotonentorpedoAnzahl() {
        return this.photonentorpedoAnzahl;
    }

    public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahl;
    }

    public int getEnergieversorgungInProzent() {
        return this.energieversorgungInProzent;
    }

    public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
        this.energieversorgungInProzent = energieversorgungInProzent;
    }

    public int getSchildeInProzent() {
        return this.schildeInProzent;
    }

    public void setSchildeInProzent(int schildeInProzent) {
        this.schildeInProzent = schildeInProzent;
    }

    public int getHuelleInProzent() {
        return this.huelleInProzent;
    }

    public void setHuelleInProzent(int huelleInProzent) {
        this.huelleInProzent = huelleInProzent;
    }

    public int getLebenserhaltungssystemeInProzent() {
        return this.lebenserhaltungssystemeInProzent;
    }

    public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
        this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
    }

    public int getAndroidenAnzahl() {
        return this.androidenAnzahl;
    }

    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    public String getSchiffsname() {
        return this.schiffsname;
    }

    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    public ArrayList<Ladung> getLadungsverzeichnis() {
        return this.ladungsverzeichnis;
    }

    public void setLadungsverzeichnis(ArrayList<Ladung> ladungsverzeichnis) {
        this.ladungsverzeichnis = ladungsverzeichnis;
    }

    public ArrayList<String> getBroadcastKommunikator() {
        return this.broadcastKommunikator;
    }

    public void setBroadcastKommunikator(ArrayList<String> broadcastKommunikator) {
        this.broadcastKommunikator = broadcastKommunikator;
    }

    public void addLadung(Ladung neueLadung) {
        ladungsverzeichnis.add(neueLadung);
    }

    public void photonentorpedoSchiessen(Raumschiff r) {
        if (this.photonentorpedoAnzahl == 0) {
            nachrichtAnAlle("-=*Click*=-");
        } else {
            nachrichtAnAlle("Photonentorpedo abgeschossen");
            this.photonentorpedoAnzahl--;
        }
    }

    private void treffer(Raumschiff r) {

    }

    public void nachrichtAnAlle(String message) {
        System.out.println(message);
        broadcastKommunikator.add(message);
    }
}
