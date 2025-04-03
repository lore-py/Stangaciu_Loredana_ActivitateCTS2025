package ro.cts.adaptor;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicament) {
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicament = new MedicamentFarmacie("Xanax", 23, true, "1 aprilie 2004");
        vindeMedicament(medicament);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Gabaran", 45);

        AdaptorMedicament adaptor = new AdaptorMedicament(medicamentSpital);
        vindeMedicament(adaptor);
    }
}
