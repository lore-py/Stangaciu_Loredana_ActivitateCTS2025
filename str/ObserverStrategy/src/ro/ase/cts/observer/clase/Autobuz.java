package ro.ase.cts.observer.clase;

public class Autobuz extends Observabil{
    private int numarLinie;

    public Autobuz(int numarLinie) {
        this.numarLinie = numarLinie;
    }

    public void pleacaDeLaCapat(){
        String mesaj = "Autobuzul " + numarLinie + " a plecatd e la capat";
        super.notificareObservator(mesaj);
    }
}
