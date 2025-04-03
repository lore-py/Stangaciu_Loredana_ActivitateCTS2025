package ro.cts.adaptor;

public class MedicamentFarmacie {
    private String numeMedicament;
    private int pret;
    private boolean esteInStoc;
    private String dataExpirarii;

    public MedicamentFarmacie(String numeMedicament, int pret, boolean esteInStoc, String dataExpirarii) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
        this.dataExpirarii = dataExpirarii;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul " + numeMedicament + " care a fost achizitionat la pretul de " + pret + " expira la data de " + dataExpirarii);
    }

}
