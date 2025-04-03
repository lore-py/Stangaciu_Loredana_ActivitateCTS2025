package ro.cts.adaptor;

public class AdaptorMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicament;

    public AdaptorMedicament(String numeMedicament, int pret, boolean esteInStoc, String dataExpirarii) {
        super(numeMedicament, pret, esteInStoc, dataExpirarii);
    }

    public AdaptorMedicament(MedicamentSpital medicament) {
        super(medicament.getNumeMedicament(), medicament.getPret(), true, "13/05/2028" );
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
