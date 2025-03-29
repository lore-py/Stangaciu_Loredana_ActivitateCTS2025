package ro.cts.ase.builder2;

public class RezervareBuilder implements IBuilder{
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean decorareMasa;
    private String muzica;
    private String numeClient;

    @Override
    public Rezervare buildRezervare(String numeClient) {
        return new Rezervare(asezareGeam,
                scaunErgonomic,
                decorareMasa,
                muzica,
                numeClient
        );
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    @Override
    public IBuilder setScaunErgonomic(Boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        this.muzica = genMuzica;
        return null;
    }

    @Override
    public IBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }
}
