package ro.cts.ase.main2;

import ro.cts.ase.builder2.IBuilder;
import ro.cts.ase.builder2.Rezervare;
import ro.cts.ase.builder2.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder();

        Rezervare rezervare1 = rezervareBuilder.buildRezervare("Anto Maria");

        System.out.println(rezervare1);

        rezervare1 = rezervareBuilder
    }
}
