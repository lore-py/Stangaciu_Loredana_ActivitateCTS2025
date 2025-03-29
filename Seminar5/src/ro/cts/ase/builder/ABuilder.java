package ro.cts.ase.builder;

public interface ABuilder {
    Rezervare buildRezervare();

    ABuilder setAsezareGeam(Boolean asezareGeam);
    ABuilder setScaunErgonomic(Boolean scaunErgonomic);
    ABuilder setDecorareMasa(Boolean decorareMasa);
    ABuilder setGenMuzica(String genMuzica);
    ABuilder setNumeClient(String numeClient);
}
