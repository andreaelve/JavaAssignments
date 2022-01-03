package oppgave3;

/*Det skal lages et program som trekker tilfeldige tall og lagrer dem i en array.
Hvor mange tall som skal trekkes er avhengig av arrayets lengde, som er parameter i klassens konstruktør.
(Hele arrayet skal fylles) Programmet skal imidlertid bare lagre de tall som ikke er trukket allerede.
Dvs. arrayet skal inneholde KUN ÈN forekomst av hvert tall.
Alle tall som trekkes skal være i intervallet 100 til 999, begge grenser inkludert.

Når alle tallene er generert og lagret i arrayet, skal programmet finne den største, minste
og gjennomsnittlige verdien av tallene i arrayet.
Til slutt skal programmet skrive ut, i en meldingsboks, tallene i arrayet, samt resultatet
av beregningene som er beskrevet over.

Pass på følgende:

- Velg selvforklarende navn på variabler, konstanter og metoder.
- Velg riktig aksessform på datafelt og metoder (public eller private).
- Følg beskrivelsen av metodene nøye.
- Pass på at du har riktig type retur-verdi, samt riktig antall og type parametre.
Lag en egen klasse som inneholder main-metoden og som utfører nødvendige instruksjoner for å teste ut
metodene i klassen UnikeTall og få vist meldingsboksen på skjermen.

*/

import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

public class UnikeTall {
    // Deklarasjon av array for lagring av tilfeldige heltall
    private int[] tilfeldigeTallArray;

   /* Konstruktør som mottar arrayets lengde som parameter og
     oppretter arrayet.  */
    public UnikeTall(int lengde){
        tilfeldigeTallArray = new int[lengde];
    }

   /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */
    private boolean finnTall(int innTall){
        for(int tall : tilfeldigeTallArray){
            return innTall == tall;
        }
        return false;
    }

   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */
    public void fyllArray(){
        for(int i = 0; i < tilfeldigeTallArray.length; i++){
            int tilfeldigTall = (int)(Math.random()*(900)+100);
            while(finnTall(tilfeldigTall)){
                tilfeldigTall = (int)(Math.random()*(900)+100);
            }
            tilfeldigeTallArray[i] = tilfeldigTall;
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    private int minsteTall(){
        int minst = tilfeldigeTallArray[0];
        for (int tall : tilfeldigeTallArray){
            if(tall < minst){
                minst = tall;
            }
        }
        return minst;
    }

    // Metode som finner og returnerer det største tallet i arrayet.
    private int storsteTall(){
        int storst = tilfeldigeTallArray[0];
        for (int tall : tilfeldigeTallArray){
            if(tall > storst){
                storst = tall;
            }
        }
        return storst;
    }

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */
    private double gjennomsnitt(){
        double sum = 0;
        for(int tall : tilfeldigeTallArray){
            sum += tall;
        }
        return sum/ tilfeldigeTallArray.length;
    }

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
    public void visTall() {
        String alleTall = "";
        int teller = 0;
        for(int tall : tilfeldigeTallArray){
            alleTall += tall + " ";
            teller++;
            // Bruker en teller for å få passende lengde med tall i meldingsboksen.
            if(teller == 8){
                alleTall += "\n";
                teller = 0;
            }
        }

        showMessageDialog(null, alleTall +
                "\nMinste tall er " + minsteTall() +
                "\nStørste tall er " + storsteTall() +
                "\nGjennomsnittsverdien er " + String.format("%.2f",gjennomsnitt()));
    }
}
