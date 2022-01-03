package oppgave1;


public class Oblig1Oppgave1 {
    public static void main(String[] args)  {
        //  Sett en variabel lik en verdi for radius
        double radius = 23.5;
    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */
        String areal = String.format("%.2f", Sirkel.areal(radius));
        String omkrets = String.format("%.2f", Sirkel.omkrets(radius));
        String diameter = String.format("%.2f", Sirkel.diameter(radius));

        System.out.println("Arealet av sirkelen med en radius " + radius + " er " + areal +
                "\nOmkretsen av sirkelen med radius " + radius + " er " + omkrets +
                "\nDiameteren til sirkelen med radius " + radius + " er " + diameter);
    }
}
