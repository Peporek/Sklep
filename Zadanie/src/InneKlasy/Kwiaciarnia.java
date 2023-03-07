package InneKlasy;

public class Kwiaciarnia extends Sklep{
    private double powierzchniaZaplecza;

    public Kwiaciarnia(String adresSklepu, double powierzchniaLokalu, boolean czyJestWc,
                       double czynsz, double powierzchniaZaplecza) {
        super(adresSklepu, powierzchniaLokalu, czyJestWc, czynsz);
        this.powierzchniaZaplecza = powierzchniaZaplecza;
    }

    @Override
    public String toString() {
        return "Kwiaciarnia: " + super.toString() + ", powierzchnia zaplecza: " + powierzchniaZaplecza + "m^2";
    }

    @Override
    public int liczbaPolek() {
        return (int) ((powierzchniaLokalu + powierzchniaZaplecza) / 4);
    }
}
