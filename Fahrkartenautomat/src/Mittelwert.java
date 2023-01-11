public class Mittelwert {

   public static void main(String[] args) {

      // (E) "Eingabe"
      // Werte fuer x und y festlegen:
      // ===========================
      double x = 2.0;
      double y = 4.0;
      double m;

      // (V) Verarbeitung
      // Mittelwert von x und y berechnen:
      // ================================
      m = rechnungmittelwert(x, y);

      // (A) Ausgabe
      // Ergebnis auf der Konsole ausgeben:
      // =================================
      System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y, m);
   }

   public static double rechnungmittelwert(double start, double ende) {
      double mittelwert = (start + ende) / 2;
      return mittelwert;
   }

}