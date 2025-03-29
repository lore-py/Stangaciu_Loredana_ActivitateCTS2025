package ro.cts.ase.builder;

public class RezervareBuilder implements ABuilder{

    Rezervare rezervare;

    public RezervareBuilder(String numeClient) {
        rezervare = new Rezervare(false, false, false, "fara muzica", numeClient);
    }

    @Override
    public Rezervare buildRezervare() {
        return this.rezervare;
    }

    @Override
    public ABuilder setAsezareGeam(Boolean asezareGeam) {
        rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    @Override
    public ABuilder setScaunErgonomic(Boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    @Override
    public ABuilder setDecorareMasa(Boolean decorareMasa) {
        rezervare.setDecorareMasa(decorareMasa);
        return null;
    }

    @Override
    public ABuilder setGenMuzica(String genMuzica) {
        rezervare.setMuzica(genMuzica);
        return this;
    }

    @Override
    public ABuilder setNumeClient(String numeClient) {
        rezervare.setNumeClient(numeClient);
        return this;
    }


}
