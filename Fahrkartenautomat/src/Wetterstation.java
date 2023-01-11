import java.lang.Math;

public class Wetterstation {
    public static void main(String[] args) {
        // Deklaration
        double[] wetterdaten = { -15.55, -2.55, -11.44, -8.6, -14.4, -5.17, 1.48, -3.47, 2.00, 2.14, 4.05, 7.45, 3.25,
                5.04, 11.4, 7.67, 8.64, 13.28, 6.87, 15.54, 12.45, 16.55, 20.42, 22.38, 19.58, 18.85, 23.84, 24.42,
                25.54, 28.35, 30.16, 32.44, 26.55, 22.13, 16.64, 13.33, 16.45, 17.34, 15.33, 11.13, 15.16, 11.44, 6.55,
                2.13, 6.64, 3.33, 6.45, -1.34, 5.33, -11.15 };
        double average = 0;
        double max = 0;
        double min = 0;
        double maxDiff = 0;

        // Durchschnittstemperatur
        for (int i = 0; i < wetterdaten.length; i++) {
            average += wetterdaten[i];
        }
        average /= wetterdaten.length;
        // Höchsttemperatur
        for (int i = 0; i < wetterdaten.length; i++) {
            max = Math.max(max, wetterdaten[i]);
        }
        // Niedrigste Temperatur
        for (int i = 0; i < wetterdaten.length; i++) {
            min = Math.min(min, wetterdaten[i]);
        }
        // höchster Temperaturumschwung
        for (int i = 0; i < wetterdaten.length - 1; i++) {
            double difference = Math.abs(wetterdaten[i] - wetterdaten[i + 1]);
            if (difference > maxDiff) {
                maxDiff = difference;
            }
        }

        System.out.println("Anzahl der Daten: " + wetterdaten.length);
        System.out.println("Durchschnittstemperatur: " + average);
        System.out.println("Höchste Temperatur: " + max);
        System.out.println("Niedrigste Temperatur: " + min);
        System.out.println("Höchster Temperaturumschwung: " + maxDiff);
    }

}
