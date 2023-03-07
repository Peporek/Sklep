package InneKlasy;

public class Sklep {
    protected String adresSklepu;
    protected double powierzchniaLokalu;
    protected boolean czyJestWc;
    protected double czynsz;

    public Sklep(String adresSklepu, double powierzchniaLokalu, boolean czyJestWc, double czynsz) {
        this.adresSklepu = adresSklepu;
        this.powierzchniaLokalu = powierzchniaLokalu;
        this.czyJestWc = czyJestWc;
        this.czynsz = czynsz;
    }

    @Override
    public String toString() {
        return "Sklep na ul.: " + adresSklepu + ", powierzchnia lokalu: " + powierzchniaLokalu +
                "m^2, Toaleta?: " + (czyJestWc ? "tak" : "nie") + ", czynsz najmu: " + czynsz + " zł";
    }

    public int liczbaPolek() {
        return (int) (powierzchniaLokalu / 2);
    }

    public final double obliczCzynsz(int liczbaMiesiecy) {
        return czynsz * liczbaMiesiecy;
    }
}
