package ro.ase.cts.adapter;

import ro.ase.cts.clase.MedicamentFarmacie;
import ro.ase.cts.clase.MedicamentSpital;

public class Adaptor extends MedicamentFarmacie {

    private MedicamentSpital medicamentSpital;

    public Adaptor(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true, "2030");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
