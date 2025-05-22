package ro.ase.cts.main;

import ro.ase.cts.adapter.Adaptor;
import ro.ase.cts.clase.MedicamentFarmacie;
import ro.ase.cts.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicament){ medicament.cumparaMedicament();}

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen", 34, true, "12 ianuarie 2027");
        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital(10, "Paracetamol");
        Adaptor medicamentAdaptat = new Adaptor(medicamentSpital);
        vindeMedicament(medicamentAdaptat);
        medicamentAdaptat.cumparaMedicament();
    }
}