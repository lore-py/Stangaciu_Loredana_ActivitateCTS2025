package ro.cts.adaptor;

public class MedicamentSpital {
    private String numeMedicament;
    private int pret;

    public MedicamentSpital(String numeMedicament, int pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + numeMedicament + " cu pretul de "+ pret +" a fost cumparat");
    }
    public void prezintaReteta() {
        System.out.println("Prezinta Reteta Medicament");
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public int getPret() {
        return pret;
    }
}
