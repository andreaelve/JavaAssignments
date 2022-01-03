package oppgave2;

import static javax.swing.JOptionPane.*;

class Tallspill {
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        showMessageDialog(null, melding);
    }

    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        visMelding(tall + " er for lite! Prøv igjen!");
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        visMelding(tall + " er for stort! Prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        visMelding("Gratulerer, " + gjetning + " er riktig!\nDu gjettet rikitg på " + antall + " forsøk.");
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */

        //Kjører en spillrunde ved å trekke et tall.
        int tall = nyttTall();

        //Nullstiller tellevariabel.
        int antall = 0;

        //Lager en while-loop som kjører helt til spilleren gjetter rikitg.
        boolean riktigGjetning = false;
        while(!riktigGjetning){
            //Ber spilleren velge et tall.
            String innGjetning = showInputDialog("Jeg tenker på et tall mellom 0 og 200.\nPrøv å gjette det tallet:");

            //Setter gjetning lik 0 før input testes.
            int gjetning = 0;
            //Tester først om spilleren skrev inn et gyldig input med try/catch.
            boolean gyldigInput = false;
            while (!gyldigInput){
                try {
                    gjetning = Integer.parseInt(innGjetning);
                    if(gjetning > 0 && gjetning < 200){
                        gyldigInput = true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch(Exception e){
                    showMessageDialog(null, "Input var ikke gyldig. " +
                            "Skriv inn et tall mellom 0 og 200");
                    innGjetning = showInputDialog("Skriv inn et tall mellom 0 og 200");
                }
            }

            //Sjekker om input er mindre, større eller lik tallet og skriver ut passende melding.
            if(gjetning > tall){
                forStort(gjetning);
                antall++;
            } else if(gjetning < tall){
                forLite(gjetning);
                antall++;
            } else {
                avsluttRunde(antall, gjetning);
                riktigGjetning = true;
            }
        }
    }
}

public class TallspillOppgave {
    public static void main(String[] args) {
        Tallspill spill = new Tallspill();
        spill.kjørSpill();
    }
}
