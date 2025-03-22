package pb4.models;

public class Rezervare extends ARezervare{
    private Boolean isInterior;

    private Rezervare() {
        super();
        isInterior = true;
    }

    public Rezervare(String nume, int ora, int nrPersoane, int zi, Boolean isInterior) {
        super(nume, ora, nrPersoane, zi);
        this.isInterior = isInterior;
    }

    //Nu facem clonable
    @Override
    public ARezervare clonare(int zi) {
        Rezervare r = new Rezervare();
        r.isInterior = this.isInterior;
        r.nume = this.nume;
        r.nrPersoane = this.nrPersoane;
        if(zi>=1 && zi <=31){
            r.zi = zi;
        }
        else{
            r.zi=this.zi;
        }
        r.ora = this.ora;
        return r;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "isInterior=" + isInterior +
                ", nume='" + nume + '\'' +
                ", ora=" + ora +
                ", nrPersoane=" + nrPersoane +
                ", zi=" + zi +
                '}';
    }
}
