package ro.cts.seminar4.models;

public class SupaVita extends Supa {
    private static int discount;

    public SupaVita(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sunt o supa de vita" + super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - super.getPret()*discount;
    }
}
