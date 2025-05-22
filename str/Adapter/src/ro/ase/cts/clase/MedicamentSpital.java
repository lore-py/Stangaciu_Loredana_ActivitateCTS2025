package ro.ase.cts.clase;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Este achizitionat medicamentul: "+nume+", pret: "+pret);
    }

    public void prezintaReteta(){
        System.out.println("A fost prezentata reteta");
    }

    public MedicamentSpital(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }
}
