package oppgave2;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        if (antall > 0) {
            this.antall = antall;
        } else {
            System.out.println("Antallet må være et tall større enn 0");
        }
        if (pris <= 0) {
            throw new IllegalArgumentException("Pris må være et tall større enn 0");
        } else {
            this.pris = pris;
        }
    }

    // get / set metoder
    // antall og pris må være større enn null
    // Navn
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    // Antall
    public int getAntall() {
        return antall;
    }
    public void setAntall(int antall) {
        if (antall <= 0 ) {
            throw new IllegalArgumentException("Antallet må være et tall større enn 0");
        } else {
            this.antall = antall;
        }
    }

    //Pris
    public double getPris() {
        return pris;
    }
    public void setPris(double pris) {
        if (pris <= 0) {
            throw new IllegalArgumentException("Pris må være et tall større enn 0");
        } else {
            this.pris = pris;
        }
    }

    // metode for å beregne totalpris (pris * antall)
    public double totalPris() {
        double totalpris = this.pris * this.antall;
        return totalpris;
    }
}
