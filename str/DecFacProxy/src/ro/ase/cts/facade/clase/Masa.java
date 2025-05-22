package ro.ase.cts.facade.clase;

public class Masa {
    private boolean esteLibera;
    private int numarMasa;
    private int nrPersoane;

    public Masa(boolean esteLibera, int numarMasa, int nrPersoane) {
        this.esteLibera = esteLibera;
        this.numarMasa = numarMasa;
        this.nrPersoane = nrPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
