package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.IRezervare;
import ro.ase.cts.proxy.clase.ProxyNumarPersoane;
import ro.ase.cts.proxy.clase.ProxyOra;
import ro.ase.cts.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();

        rezervare.rezerva("Gigel", 5, 15);

        IRezervare proxyNrPersoane = new ProxyNumarPersoane(rezervare);
        proxyNrPersoane.rezerva("Gigu", 2, 12);

        IRezervare proxyOra = new ProxyOra(rezervare);
        proxyOra.rezerva("Ion", 6, 12);
    }
}