package oppgave4;

/*Gitt følgende int [] liste =  {2,4,6,12,78,45,3,42,5,-7};

Skriv kode for å summere tallene med en for-løkke.
Gjør det samme med en for each -løkke (utvidet for-løkke).
Summene skal skrives ut i System.out på to forskjellige linjer.*/

public class Oppg1 {
    public static void main(String[] args){
        int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < liste.length; i++){
            sum1 += liste[i];
        }
        for(int tall : liste){
            sum2 += tall;
        }
        System.out.println(sum1 + " " + sum2);
    }
}
