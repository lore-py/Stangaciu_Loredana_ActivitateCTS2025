package ro.cts.ase.builder;

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

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setMuzica(String muzica) {
        this.muzica = muzica;
    }

    public void setNumeClient(String numeClient) {
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
