package oppgave4;


    class Sjekkarray {
        /*
        1. Lag en klasse kalt «SjekkArray». Denne skal ha en statisk metode som heter «summer».
        Denne metoden tar to heltall og et heltalls-array som innparametere og
        returnerer et heltall med summen.
        Lag kode for å summere arryet fra posisjonen fra og med første parameter
        til og med posisjonen oppgitt som andre parameter.
        */
        static int summer(int tall1, int tall2, int[] array){
            int sum = 0;
            for(int i = tall1; i <= tall2; i++){
                sum += array[i];
            }
            return sum;
        }

        /*
        2. Lag en ny statisk metode i klassen kalt «arrayLike».
        Denne metoden skal ta to heltall-arrays inn og sjekke om de er like (et og et element er likt).
        Dersom de er det (og like lange) så returnerer metoden «true», ellers «false».
        Lag kode for å sjekke to arrays med denne metoden i main-metoden.
        */
        static boolean arrayListe(int[] array1, int[] array2){
            if(array1.length == array2.length){
                for(int i = 0; i < array1.length; i++){
                    if(array1[i] != array2[i]){
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        }

        /*
        3. Lag så en ny statisk metode kalt «arrayEksisterer» som skal finne ut av om det
        finnes et tall i et oppgitt array.
        Metoden skal ha et array inn og så et heltall som man skal sjekke om
        ligger i arrayet. Metoden skal returnere «true» eller «false»
        avhengig av om tallet finnes eller ikke. Lag kode for å sjekke om et
        tall eksisterer med denne metoden i main-metoden
        */
        static boolean arrayEksisterer(int[] array, int tall){
            boolean finnes = false;
            for(int element : array){
                if (element == tall) {
                    finnes = true;
                    break;
                }
            }
            return finnes;
        }
    }

public class Oppg2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array3 = new int[]{1, 4, 2, 6};

        int sum = Sjekkarray.summer(2, 4, array1);
        boolean likListe1 = Sjekkarray.arrayListe(array1, array2);
        boolean likListe2 = Sjekkarray.arrayListe(array1, array3);
        boolean finnes1 = Sjekkarray.arrayEksisterer(array1, 4);
        boolean finnes2 = Sjekkarray.arrayEksisterer(array3, 3);

        System.out.println(sum + " " + likListe1 +" " + likListe2 + " " + finnes1 + " " + finnes2);
    }
}
