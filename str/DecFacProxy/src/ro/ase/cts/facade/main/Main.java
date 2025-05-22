package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.ReceptionistFacade;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(false, 20, 6);
        ReceptionistFacade receptionist = new ReceptionistFacade();
        System.out.println(receptionist.poateLuaLocLaMasa(masa1));
    }
}