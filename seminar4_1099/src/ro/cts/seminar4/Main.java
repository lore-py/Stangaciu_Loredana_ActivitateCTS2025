package ro.cts.seminar4;

import ro.cts.seminar4.bucatarie.Bucatarie;
import ro.cts.seminar4.models.Supa;

public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie = new Bucatarie(250, 25.5f);
        Supa supaLegume;
        Supa supaVita;

        supaLegume.afisearaDescriere();
        supaVita.afiseazaDescriere();

        Bucatarie cantina = new Bucatarie(500, 10.5f);
    }
}