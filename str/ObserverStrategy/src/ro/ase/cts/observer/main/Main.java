package ro.ase.cts.observer.main;


import ro.ase.cts.observer.clase.Autobuz;
import ro.ase.cts.observer.clase.Calator;
import ro.ase.cts.observer.clase.Observator;

public class Main {
    public static void main(String[] args) {
        Observator o1 = new Calator("Maria");
        Autobuz a1 = new Autobuz(107);

        a1.abonareObservator(o1);
        a1.pleacaDeLaCapat();
    }
}