package ro.cts.seminar4.models;

public class SupaLegume extends Supa {
    private static int discount;

    public SupaLegume(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sunt o supa de legume" + super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret()*discount;
    }
}
