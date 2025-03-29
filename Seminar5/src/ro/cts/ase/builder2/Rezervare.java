package ro.cts.ase.builder2;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean decorareMasa;
    private String muzica;
    private String numeClient;

    public Rezervare(boolean asezareGeam, boolean scaunErgonomic, boolean decorareMasa, String muzica, String numeClient) {
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorareMasa = decorareMasa;
        this.muzica = muzica;
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareGeam=" + asezareGeam +
                ", scaunErgonomic=" + scaunErgonomic +
                ", decorareMasa=" + decorareMasa +
                ", muzica='" + muzica + '\'' +
                ", numeClient='" + numeClient + '\'' +
                '}';
    }
}
