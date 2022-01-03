package oppgave2;

import static javax.swing.JOptionPane.showInputDialog;

public class Oblig1Oppgave2 {
    public static void main(String[] args) {

        // les inn navn, antall og pris for vare 1
        String navn1 = showInputDialog("Skriv inn navn");
        String innAntall1 = showInputDialog("Skriv inn antall");
        String innPris1 = showInputDialog("Skriv inn pris");

        // les inn navn, antall og pris for vare 2
        String navn2 = showInputDialog("Skriv inn navn");
        String innAntall2 = showInputDialog("Skriv inn antall");
        String innPris2 = showInputDialog("Skriv inn pris");


        /*
        bruk avvikshåntering (try/catch) for å konvertere
        antall og pris for vare 1 og vare 2.
        */
        int antall1 = 0; // Setter lik 0, så hvis input er feil så regnes det videre med 0.
        double pris1 = 0; // Setter lik 0, så hvis input er feil så regnes det videre med 0.
        try {
            antall1 = Integer.parseInt(innAntall1);
            pris1 = Double.parseDouble(innPris1);
        } catch(Exception e) {
            System.out.println("Input for vare 1 er ikke gyldig.");
        }


        int antall2 = 0; // Setter lik 0, så hvis input er feil så regnes det videre med 0.
        double pris2 = 0; // Setter lik 0, så hvis input er feil så regnes det videre med 0.
        try {
            antall2 = Integer.parseInt(innAntall2);
            pris2 = Double.parseDouble(innPris2);
        } catch(Exception e) {
            System.out.println("Input for vare 2 er ikke gyldig.");
        }

        // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        // beregn og skriv ut total pris for alle varer i System.out
        System.out.println("Totalprisen for " + vare1.getNavn() + " ble: " + vare1.totalPris() + " kr.");
        System.out.println("Totalprisen for " + vare2.getNavn() + " ble: " + vare2.totalPris() + " kr.");
        System.out.println("Totalprisen for begge varene er " + (vare1.totalPris() + vare2.totalPris()) + " kr.");
    }
}
