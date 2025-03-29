package ro.cts.ase.builder2;

import ro.cts.ase.builder.ABuilder;

public interface IBuilder {
    Rezervare buildRezervare(String numeClient);

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScaunErgonomic(Boolean scaunErgonomic);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
    IBuilder setNumeClient(String numeClient);
}
