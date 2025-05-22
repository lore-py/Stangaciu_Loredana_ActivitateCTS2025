package ro.ase.cts.clase;

public class MedicamentFarmacie {
    private String nume;
    private int pret;
    private boolean inStoc;
    private String dataExpirarii;

    public MedicamentFarmacie(String nume, int pret, boolean inStoc, String dataExpirarii) {
        this.nume = nume;
        this.pret = pret;
        this.inStoc = inStoc;
        this.dataExpirarii = dataExpirarii;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul a fost cumparat: "+nume+" pret: "+pret+" inStoc: "+inStoc);
    }
}
