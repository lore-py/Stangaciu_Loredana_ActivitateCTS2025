package ro.cts.ase.main;

import ro.cts.ase.builder.ABuilder;
import ro.cts.ase.builder.Rezervare;
import ro.cts.ase.builder.RezervareBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ABuilder rezervareBuilder = new RezervareBuilder("Ana Maria");
        Rezervare rezervare;
        Rezervare rezervare1;
//        rezervareBuilder.setAsezareGeam(true);
//        rezervareBuilder.setDecorareMasa(true);
//        rezervareBuilder = rezervareBuilder.buildRezervare();
        rezervare = rezervareBuilder.buildRezervare();
        rezervare1 = rezervareBuilder.setGenMuzica("rock").buildRezervare();
        rezervare = rezervareBuilder.setAsezareGeam(true).buildRezervare();

        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}