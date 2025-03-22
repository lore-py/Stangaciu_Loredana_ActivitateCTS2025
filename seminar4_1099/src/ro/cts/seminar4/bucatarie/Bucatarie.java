package ro.cts.seminar4.bucatarie;

import ro.cts.seminar4.models.Supa;
import ro.cts.seminar4.models.SupaCiuperci;
import ro.cts.seminar4.models.SupaLegume;
import ro.cts.seminar4.models.SupaVita;

public class Bucatarie {
    private int cantitate;
    private float pret;

    private Supa getSupa(TipSupa tipSupa, Boolean hasArdei, Boolean hasSmantana) {
        switch (tipSupa) {
            case vita -> {return new SupaVita(cantitate, pret, hasArdei, hasSmantana);}
            case ciuperci -> {return new SupaCiuperci(cantitate, pret, hasArdei, hasSmantana);}
            case legume -> {return new SupaLegume(cantitate, pret, hasArdei, hasSmantana);}
            default -> {
                return null;
            }
        }
    }

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }
}
