public class Main {
    public static void main(String[] args) {

        Raumschiff rs1 = new Raumschiff();
        rs1.setPhotonentorpedoAnzahl(1);
        rs1.setEnergieversorgungInProzent(100);
        rs1.setSchildeInProzent(100);
        rs1.setHuelleInProzent(100);
        rs1.setLebenserhaltungssystemeInProzent(100);
        rs1.setSchiffsname("IKS Hegh'ta");
        rs1.setAndroidenAnzahl(2);
        rs1.addLadung(new Ladung("Ferengi Schneckensaft", 200));
        rs1.addLadung(new Ladung("Bat'leth Klingonen Schwert", 200));

        Raumschiff rs2 = new Raumschiff();
        rs2.setPhotonentorpedoAnzahl(2);
        rs2.setEnergieversorgungInProzent(100);
        rs2.setSchildeInProzent(100);
        rs2.setHuelleInProzent(100);
        rs2.setLebenserhaltungssystemeInProzent(100);
        rs2.setSchiffsname("IRW Khazara");
        rs2.setAndroidenAnzahl(2);
        rs2.addLadung(new Ladung("Borg-Schrott", 5));
        rs2.addLadung(new Ladung("Rote Materie", 2));
        rs2.addLadung(new Ladung("Plasma-Waffe", 50));

        Raumschiff rs3 = new Raumschiff();
        rs3.setPhotonentorpedoAnzahl(0);
        rs3.setEnergieversorgungInProzent(80);
        rs3.setSchildeInProzent(80);
        rs3.setHuelleInProzent(50);
        rs3.setLebenserhaltungssystemeInProzent(100);
        rs3.setSchiffsname("Ni'Var");
        rs3.setAndroidenAnzahl(5);
        rs3.addLadung(new Ladung("Forschungssonde", 35));
        rs3.addLadung(new Ladung("Photonentorpedo", 3));
    }
}
