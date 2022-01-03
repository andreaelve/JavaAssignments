package oppgave1;

public class Sirkel {
    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double diameter(double radius) {
        double diameter = 2 * radius;
        return diameter;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double omkrets(double radius) {
        double omkrets = Math.PI * 2 * radius;
        return omkrets;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    public static double areal(double radius) {
        double areal = Math.pow(radius, 2) * Math.PI;
        return areal;
    }
}