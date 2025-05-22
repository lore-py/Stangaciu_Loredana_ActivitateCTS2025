package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata plataSMS = new SMS();
        IMetodaPlata plataCardBancar = new CardBancar(345.6f);
        IMetodaPlata plataCardCalatorii = new CardCalatorii(9);

        Calator calator1 = new Calator("Andrei", plataSMS);

        calator1.platesteBilet(3);
        calator1.setMetodaPlata(plataCardBancar);
        calator1.platesteBilet(160);
    }
}