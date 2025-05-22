package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.SectieFrunza;

public class Main {
    public static void main(String[] args) {
        Departament dep1 = new Departament("Departament general");
        Departament dep2 = new Departament("Cardiologie");
        Departament dep3 = new Departament("Pediatrie");

        SectieFrunza sectie1 = new SectieFrunza("1");
        SectieFrunza sectie2 = new SectieFrunza("2");

        try {
            dep1.adaugaNod(dep2);
            dep1.adaugaNod(dep3);

            dep2.adaugaNod(sectie1);
            dep3.adaugaNod(sectie2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        dep1.descriereStructura();
    }
}