package Oppgave1;/*
Lag et program som beregner og skriver ut summen av alle tall mellom to grenser
som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen.
Dersom innlest øvre grense er mindre enn eller lik nedre grense, skal programmet skrive
ut en melding til brukeren om dette og foreta ny innlesing.
Når godkjente grenser er lest inn,skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum.
Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut
følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
Test ut programmet med nedre grense lik 1 og øvre grense lik 100.
Legg inn et linjeskift for hvert 10. tall i summen.
*/

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {

        String innNedreGrense = showInputDialog("Skriv inn nedre grense");
        String innØvregrense = showInputDialog("Skriv inn øvre grense");
        boolean riktigInput = false;
        int nedreGrense = 0;
        int øvreGrense = 0;
        while (!riktigInput){
            try {
                nedreGrense = Integer.parseInt(innNedreGrense);
                øvreGrense = Integer.parseInt(innØvregrense);
                if (nedreGrense >= øvreGrense) {
                    throw new IllegalArgumentException("Øvre grense må være større enn nedre grense");
                } else {
                    riktigInput = true;
                }
            }
            catch (Exception e) {
                showMessageDialog(null, "Input er ikke gyldig. Skriv på nytt");
                innNedreGrense = showInputDialog("Skriv inn nedre grense");
                innØvregrense = showInputDialog("Skriv inn øvre grense");
            }
        }
        int antallI = 0;

        int sum = nedreGrense;
        for(int i = nedreGrense; i <= øvreGrense; i++){
            sum += i;
            antallI ++;
            System.out.print(i );
            if (i < øvreGrense) {
                System.out.print(" + ");
            }
            if(antallI == 10 && i != øvreGrense) {
                System.out.println();
                antallI = 0;
            }
        }
        System.out.print(" = " + sum);
    }
}
